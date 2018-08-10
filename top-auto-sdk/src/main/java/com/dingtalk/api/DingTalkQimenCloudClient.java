package com.dingtalk.api;

import java.io.IOException;
import java.util.Date;

import com.qimencloud.api.AbstractQimenCloudResponse;
import com.qimencloud.api.IQimenCloudRequest;
import com.qimencloud.api.QimenCloudClient;
import com.qimencloud.api.QimenCloudRequest;
import com.qimencloud.api.QimenCloudResponse;
import com.taobao.api.ApiException;
import com.taobao.api.ApiRuleException;
import com.taobao.api.Constants;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.mapping.RequestXmlBodyType;
import com.taobao.api.internal.parser.json.QimenCloudJsonParser;
import com.taobao.api.internal.parser.xml.QimenCloudXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.WebUtils;
import com.taobao.api.internal.util.XmlWriter;

public class DingTalkQimenCloudClient implements QimenCloudClient {

	protected String serverUrl;
	protected String format = Constants.FORMAT_JSON;
	protected int connectTimeout = 15000; // 默认连接超时时间为15秒
	protected int readTimeout = 30000; // 默认响应超时时间为30秒
	protected boolean needCheckRequest = true; // 是否在客户端校验请求
	protected boolean needEnableParser = true; // 是否对响应结果进行解释
	protected boolean useGzipEncoding = true; // 是否启用响应GZIP压缩
    
	public DingTalkQimenCloudClient(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	
	public DingTalkQimenCloudClient(String serverUrl, String format) {
		this(serverUrl);
		this.format = format;
	}
	
	public DingTalkQimenCloudClient(String serverUrl, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}
	
	public <T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request, String accessToken)
			throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			if (Constants.FORMAT_XML.equals(this.format)) {
				parser = new QimenCloudXmlParser<T>(request.getResponseClass());
			} else {
				parser = new QimenCloudJsonParser<T>(request.getResponseClass());
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
				localResponse.setCode(e.getErrCode());
				localResponse.setMessage(e.getErrMsg());
				return localResponse;
			}
		}
		
		// XXX 兼容 老奇门1.0 的 XML BODY
		String apiBody = null;
		RequestXmlBodyType requestXmlBodyType = request.getClass().getAnnotation(RequestXmlBodyType.class);
		Boolean isXmlBody = (requestXmlBodyType != null);
		if(isXmlBody) {
			XmlWriter writer = new XmlWriter(true, Constants.QM_ROOT_TAG, IQimenCloudRequest.class);
			apiBody = writer.write(request);
		} 
		
		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);
		
		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.VERSION, "2.0");
		protocalOptParams.put(Constants.SESSION, accessToken);
		requestHolder.setProtocalOptParams(protocalOptParams);

		String fullUrl = null;
		String traceRequestUrl = null;
		try {

			String realServerUrl = getServerUrl(this.serverUrl);
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String appParamsQuery = WebUtils.buildQuery(appParams, Constants.CHARSET_UTF8);
			if(isXmlBody) {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
				traceRequestUrl = fullUrl;
			} else {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
				traceRequestUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
			}
			
			String rsp = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			
			if(isXmlBody) {
				rsp = WebUtils.doPost(fullUrl, Constants.QM_CONTENT_TYPE, apiBody.getBytes(Constants.CHARSET_UTF8), connectTimeout, readTimeout, request.getHeaderMap(), null);
			} else {
				rsp = WebUtils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap(), null);
			}
//			
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError( "DingTalkApp" , request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}
		
		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody());
			tRsp.setRequestUrl(traceRequestUrl);
			tRsp.setBody(requestHolder.getResponseBody());
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setRequestUrl(traceRequestUrl);
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		if (!tRsp.isPlatformSuccess()) {
			TaobaoLogger.logApiError("DingTalkApp", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	public QimenCloudResponse execute(QimenCloudRequest request, String accessToken)
			throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<QimenCloudResponse> parser = null;
		if (this.needEnableParser) {
			if (Constants.FORMAT_XML.equals(this.format)) {
				parser = new QimenCloudXmlParser<QimenCloudResponse>(QimenCloudResponse.class);
			} else {
				parser = new QimenCloudJsonParser<QimenCloudResponse>(QimenCloudResponse.class);
			}
		}
		
		// XXX 兼容 老奇门1.0 的 XML BODY
		String apiBody = null;
		RequestXmlBodyType requestXmlBodyType = request.getClass().getAnnotation(RequestXmlBodyType.class);
		Boolean isXmlBody = (requestXmlBodyType != null);
		if(isXmlBody) {
			XmlWriter writer = new XmlWriter(true, Constants.QM_ROOT_TAG, IQimenCloudRequest.class);
			apiBody = writer.write(request);
		} 
		
		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getQueryParams());
		requestHolder.setApplicationParams(appParams);
		
		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.VERSION, "2.0");
		protocalOptParams.put(Constants.SESSION, accessToken);
		requestHolder.setProtocalOptParams(protocalOptParams);

		String fullUrl = null;
		String traceRequestUrl = null;
		try {

			String realServerUrl = getServerUrl(this.serverUrl);
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String appParamsQuery = WebUtils.buildQuery(appParams, Constants.CHARSET_UTF8);
			if(isXmlBody) {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
				traceRequestUrl = fullUrl;
			} else {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
				traceRequestUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
			}
			
			String rsp = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			
			if(isXmlBody) {
				rsp = WebUtils.doPost(fullUrl, Constants.QM_CONTENT_TYPE, apiBody.getBytes(Constants.CHARSET_UTF8), connectTimeout, readTimeout, request.getHeaderMap(), null);
			} else {
				rsp = WebUtils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap(), null);
			}
//			
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError( "DingTalkApp" , request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}
		
		QimenCloudResponse tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody());
			tRsp.setRequestUrl(traceRequestUrl);
			tRsp.setBody(requestHolder.getResponseBody());
		} else {
			try {
				tRsp = new QimenCloudResponse();
				tRsp.setRequestUrl(traceRequestUrl);
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError("DingTalkApp", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}
	
	public String getServerUrl(String serverUrl) {
        return serverUrl;
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

	public <T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request) throws ApiException {
		throw new ApiException("钉钉api，accessToken必传");
	}

	public QimenCloudResponse execute(QimenCloudRequest request) throws ApiException {
		throw new ApiException("钉钉api，accessToken必传");
	}
	
}
