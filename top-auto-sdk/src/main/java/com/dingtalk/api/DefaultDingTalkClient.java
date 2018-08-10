package com.dingtalk.api;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.taobao.api.*;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.*;

/**
 * 钉钉客户端。
 * @author chaohui.zch 2016年11月8日下午2:38:45
 */
public class DefaultDingTalkClient implements DingTalkClient {

	protected String serverUrl;
	protected String format = Constants.FORMAT_JSON;
	protected int connectTimeout = 15000; // 默认连接超时时间为15秒
	protected int readTimeout = 30000; // 默认响应超时时间为30秒
	protected boolean needCheckRequest = true; // 是否在客户端校验请求
	protected boolean needEnableParser = true; // 是否对响应结果进行解释
	protected boolean useSimplifyJson = false; // 是否采用精简化的JSON返回
	protected boolean useGzipEncoding = true; // 是否启用响应GZIP压缩
	
	public DefaultDingTalkClient(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public DefaultDingTalkClient(String serverUrl,String format) {
		this(serverUrl);
		this.format = format;
	}

	public DefaultDingTalkClient(String serverUrl, String format, int connectTimeout, int readTimeout) {
		this(serverUrl,format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request) throws ApiException {
		return execute(request, null);
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessToken) throws ApiException {
		return _execute(request, accessToken);
	}

	private <T extends DingTalkResponse> T _execute(DingTalkRequest<T> request, String accessToken) throws ApiException {
		if(request.getApiCallType() == null || request.getApiCallType().equals(DingTalkConstants.CALL_TYPE_TOP)) {
			return _executeTop(request, accessToken);
		} else {
			return _executeOApi(request, accessToken);
		}
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessKey, String accessSecret) throws ApiException {
		return execute(request, accessKey, accessSecret, null,null);
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessKey, String accessSecret, String suiteTicket) throws ApiException {
		return execute(request, accessKey, accessSecret, suiteTicket,null);
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessKey, String accessSecret, String suiteTicket, String corpId) throws ApiException {
		if(request.getApiCallType() == null || request.getApiCallType().equals(DingTalkConstants.CALL_TYPE_TOP)) {
			return _executeTop(request,null);
		} else {
			return _executeOApi(request,null, accessKey, accessSecret,suiteTicket, corpId);
		}
	}

	private <T extends DingTalkResponse> T _executeTop(DingTalkRequest<T> request, String session) throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			if (Constants.FORMAT_XML.equals(this.format)) {
				parser = new ObjectXmlParser<T>(request.getResponseClass());
			} else {
				parser = new ObjectJsonParser<T>(request.getResponseClass(), this.useSimplifyJson);
			}
		}

		// 本地校验请求参数
		if (this.needCheckRequest) {
			try {
				request.check();
			} catch (ApiRuleException e) {
				T localResponse = null;
				try {
					localResponse = request.getResponseClass().newInstance();
				} catch (Exception xe) {
					throw new ApiException(xe);
				}
				localResponse.setErrorCode(e.getErrCode());
				localResponse.setMsg(e.getErrMsg());
				return localResponse;
			}
		}

		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		protocalMustParams.put(Constants.VERSION, "2.0");
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.SESSION, session);
		protocalOptParams.put(Constants.PARTNER_ID, getSdkVersion());

		if (this.useSimplifyJson) {
			protocalOptParams.put(Constants.SIMPLIFY, Boolean.TRUE.toString());
		}
		requestHolder.setProtocalOptParams(protocalOptParams);

		try {

			String realServerUrl = getServerUrl(this.serverUrl, request.getApiMethodName(), session,appParams);
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);

			String rsp = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			// 是否需要上传文件
			if (request instanceof DingTalkUploadRequest) {
				DingTalkUploadRequest<T> uRequest = (DingTalkUploadRequest<T>) request;
				Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
				rsp = WebUtils.doPost(fullUrl, appParams, fileParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap());
			} else {
				rsp = WebUtils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap(), null);
			}
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}

		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody());
			tRsp.setBody(requestHolder.getResponseBody());
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		tRsp.setParams(appParams);
		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	private <T extends DingTalkResponse> T _executeOApi(DingTalkRequest<T> request, String session) throws ApiException {
		return _executeOApi(request, session, null, null, null, null);
	}

	private <T extends DingTalkResponse> T _executeOApi(DingTalkRequest<T> request, String session, String accessKey, String accessSecret, String suiteTicket, String corpId) throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			parser = new DingTalkJsonParser<T>(request.getResponseClass());
		}

		// 本地校验请求参数
		if (this.needCheckRequest) {
			try {
				request.check();
			} catch (ApiRuleException e) {
				T localResponse = null;
				try {
					localResponse = request.getResponseClass().newInstance();
				} catch (Exception xe) {
					throw new ApiException(xe);
				}
				localResponse.setErrorCode(e.getErrCode());
				localResponse.setMsg(e.getErrMsg());
				return localResponse;
			}
		}

		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(DingTalkConstants.ACCESS_TOKEN, session);
		requestHolder.setProtocalMustParams(protocalMustParams);

		try {
			String fullUrl;
			// 签名优先
			if(accessKey != null) {
				Long timestamp = System.currentTimeMillis();
				// 验证签名有效性
				String canonicalString = DingTalkSignatureUtil.getCanonicalStringForIsv(timestamp, suiteTicket);
				String signature = DingTalkSignatureUtil.computeSignature(accessSecret, canonicalString);
				Map<String, String > ps = new HashMap<String, String>();
				ps.put("accessKey", accessKey);
				ps.put("signature", signature);
				ps.put("timestamp", timestamp+"");
				if(suiteTicket != null) {
					ps.put("suiteTicket", suiteTicket);
				}
				if(corpId != null){
					ps.put("corpId", corpId);
				}

				String queryStr =DingTalkSignatureUtil.paramToQueryString(ps, "utf-8");
				if (this.serverUrl.indexOf("?") > 0) {
					fullUrl = this.serverUrl + "&"+queryStr;
				} else {
					fullUrl = this.serverUrl + "?"+queryStr;
				}
			}else{
				if (this.serverUrl.indexOf("?") > 0) {
					fullUrl = this.serverUrl + (session != null && session.length() > 0 ? ("&access_token=" + session) : "");
				} else {
					fullUrl = this.serverUrl + (session != null && session.length() > 0 ? ("?access_token=" + session) : "");
				}
			}

			String rsp = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}

			if(request.getHttpMethod().equals("POST")) {
				// 是否需要上传文件
				if (request instanceof DingTalkUploadRequest) {
					DingTalkUploadRequest<T> uRequest = (DingTalkUploadRequest<T>) request;
					Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
					rsp = WebUtils.doPost(fullUrl, appParams, fileParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap());
				} else {

					Map<String, Object> jsonParams = new HashMap<String, Object>();
					for (Map.Entry<String, String> paramEntry : appParams.entrySet()) {
						String key = paramEntry.getKey();
						String value = paramEntry.getValue();
						if(value.startsWith("[") && value.endsWith("]")) {
						    List<Map<String, Object>> childMap = (List<Map<String, Object>>)TaobaoUtils.jsonToObject(value);
						    jsonParams.put(key, childMap);
                        } else if(value.startsWith("{") && value.endsWith("}")) {
							Map<String, Object> childMap = (Map<String, Object>)TaobaoUtils.jsonToObject(value);
							jsonParams.put(key, childMap);
						} else {
							jsonParams.put(key, value);
						}
					}

					rsp = WebUtils.doPostWithJson(fullUrl, jsonParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout);
				}
			} else {
				rsp = WebUtils.doGet(fullUrl, appParams);
			}
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}

		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody());
			tRsp.setBody(requestHolder.getResponseBody());
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		tRsp.setParams(appParams);
		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	public String getServerUrl(String serverUrl, String apiName, String session,TaobaoHashMap appParams) {
		return serverUrl;
	}

	protected String getSdkVersion() {
		return Constants.SDK_VERSION;
	}

	/**
	 * 是否在客户端校验请求参数。
	 */
	public void setNeedCheckRequest(boolean needCheckRequest) {
		this.needCheckRequest = needCheckRequest;
	}

	/**
	 * 是否把响应字符串解释为对象。
	 */
	public void setNeedEnableParser(boolean needEnableParser) {
		this.needEnableParser = needEnableParser;
	}

	/**
	 * 是否采用标准化的JSON格式返回。
	 */
	public void setUseSimplifyJson(boolean useSimplifyJson) {
		this.useSimplifyJson = useSimplifyJson;
	}

	/**
	 * 是否记录API请求错误日志。
	 */
	public void setNeedEnableLogger(boolean needEnableLogger) {
		TaobaoLogger.setNeedEnableLogger(needEnableLogger);
	}

	/**
	 * 是否忽略HTTPS证书校验。
	 */
	public void setIgnoreSSLCheck(boolean ignore) {
		WebUtils.setIgnoreSSLCheck(ignore);
	}

	/**
	 * 是否启用响应GZIP压缩
	 */
	public void setUseGzipEncoding(boolean useGzipEncoding) {
		this.useGzipEncoding = useGzipEncoding;
	}

	/**
	 * 设置API请求的连接超时时间，默认为15秒。
	 */
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	/**
	 * 设置API请求的读超时时间，默认为30秒。
	 */
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

}
