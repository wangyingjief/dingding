package com.qimencloud.api;

import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Date;

import com.taobao.api.internal.util.XmlWriter;
import com.taobao.api.internal.mapping.RequestXmlBodyType;
import com.taobao.api.ApiRuleException;
import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.cluster.ClusterManager;
import com.taobao.api.internal.cluster.DnsConfig;
import com.taobao.api.internal.parser.json.QimenCloudJsonParser;
import com.taobao.api.internal.parser.xml.QimenCloudXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.WebUtils;

public class DefaultQimenCloudClient implements QimenCloudClient {

	protected String serverUrl;
	protected String appKey;
	protected String appSecret;
	protected String format = Constants.FORMAT_JSON;
	protected String signMethod = Constants.SIGN_METHOD_HMAC_SHA256;
	protected int connectTimeout = 15000; // 默认连接超时时间为15秒
	protected int readTimeout = 30000; // 默认响应超时时间为30秒
	protected boolean needCheckRequest = true; // 是否在客户端校验请求
	protected boolean needEnableParser = true; // 是否对响应结果进行解释
	protected boolean useGzipEncoding = true; // 是否启用响应GZIP压缩
	private   boolean isHttpDnsEnabled = false; //是否启用了httpdns
    private   String  originalHttpHost = null;  //原始请求Host
    
    private Proxy proxy = null; //代理类
    
	public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret) {
		this.serverUrl = serverUrl;
		this.appKey = appKey;
		this.appSecret = appSecret;
	}
	
	public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret, String format) {
		this(serverUrl, appKey, appSecret);
		this.format = format;
	}
	
	public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout) {
		this(serverUrl, appKey, appSecret, format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}
	
	public DefaultQimenCloudClient(String serverUrl, String appKey, String appSecret, String format, int connectTimeout, int readTimeout, String signMethod) {
		this(serverUrl, appKey, appSecret, format, connectTimeout, readTimeout);
		this.signMethod = signMethod;
	}
	
	public <T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request)
			throws ApiException {
		return execute(request, null);
	}
	
	public <T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request, String session)
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
		protocalMustParams.put(Constants.APP_KEY, appKey);
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.SIGN_METHOD, signMethod);
		protocalOptParams.put(Constants.VERSION, "2.0");
		protocalOptParams.put(Constants.SESSION, session);
		protocalOptParams.put(Constants.TARGET_APP_KEY, request.getTargetAppKey());
		requestHolder.setProtocalOptParams(protocalOptParams);

		String fullUrl = null;
		String traceRequestUrl = null;
		try {
			// 添加签名参数
			if(isXmlBody) {
				protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequestWithBody(requestHolder, apiBody, appSecret, signMethod));
			} else {
				protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequest(requestHolder, appSecret, signMethod));
			}

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
			if(getTopHttpDnsHost() != null){
				request.getHeaderMap().put(Constants.TOP_HTTP_DNS_HOST, getTopHttpDnsHost());
			}
			
			if(isXmlBody) {
				rsp = WebUtils.doPost(fullUrl, Constants.QM_CONTENT_TYPE, apiBody.getBytes(Constants.CHARSET_UTF8), connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
			} else {
				rsp = WebUtils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
			}
//			
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
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
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	public QimenCloudResponse execute(QimenCloudRequest request) throws ApiException {
		return execute(request, null);
	}

	public QimenCloudResponse execute(QimenCloudRequest request, String session)
			throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<QimenCloudResponse> parser = null;
		if (this.needEnableParser) {
			if (Constants.FORMAT_XML.equals(this.format)) {
				parser = new QimenCloudXmlParser<QimenCloudResponse>(request.getResponseClass());
			} else {
				parser = new QimenCloudJsonParser<QimenCloudResponse>(request.getResponseClass());
			}
		}

		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getQueryParams());
		requestHolder.setApplicationParams(appParams);
		
		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		protocalMustParams.put(Constants.APP_KEY, appKey);
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.SIGN_METHOD, signMethod);
		protocalOptParams.put(Constants.VERSION, "2.0");
		protocalOptParams.put(Constants.SESSION, session);
		protocalOptParams.put(Constants.TARGET_APP_KEY, request.getTargetAppKey());
		requestHolder.setProtocalOptParams(protocalOptParams);
		
		String apiBody = request.getBody();

		String fullUrl = null;
		String traceRequestUrl = null;
		try {
			if(apiBody != null && !apiBody.isEmpty()) {
				protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequestWithBody(requestHolder, apiBody, appSecret, signMethod));
			} else {
				protocalMustParams.put(Constants.SIGN, TaobaoUtils.signTopRequest(requestHolder, appSecret, signMethod));
			}
			
			String realServerUrl = getServerUrl(this.serverUrl);
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String appParamsQuery = WebUtils.buildQuery(appParams, Constants.CHARSET_UTF8);
			if(apiBody != null && !apiBody.isEmpty()) {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
				traceRequestUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
			} else {
				fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
				traceRequestUrl = WebUtils.buildRequestUrl(realServerUrl, appParamsQuery, sysMustQuery, sysOptQuery);
			}
			
			String rsp = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			if(getTopHttpDnsHost() != null){
				request.getHeaderMap().put(Constants.TOP_HTTP_DNS_HOST, getTopHttpDnsHost());
			}

			if(apiBody != null && !apiBody.isEmpty()) {
				rsp = WebUtils.doPost(fullUrl, Constants.QM_CONTENT_TYPE, apiBody.getBytes(Constants.CHARSET_UTF8), connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
			} else {
				rsp = WebUtils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap(), this.getProxy());
			}
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}
		
		QimenCloudResponse tRsp = null;
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

		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError(appKey, request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}
	
	public String getServerUrl(String serverUrl) {
		if(isHttpDnsEnabled){
	        DnsConfig dnsConfig = ClusterManager.GetDnsConfigFromCache();
	        if (dnsConfig == null) {
	            return serverUrl;
	        } else {
	            return dnsConfig.getVipUrl(serverUrl);
	        } 
        }
        return serverUrl;
	}
	
	public String getTopHttpDnsHost(){
	    if(isHttpDnsEnabled){
	        return originalHttpHost;
	    }
	    return null;
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
	
	/**
	 * 设置签名算法
	 */
	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
	}
	
	/**
	 * 启用http dns
	 */
	public void enableHttpDns(){
	    WebUtils.setIgnoreHostCheck(true);
	    setHttpDnsHost(serverUrl);
        ClusterManager.initRefreshThread(appKey, appSecret);
        isHttpDnsEnabled = true;
	}
	
	
	/**
	 * 沙箱环境启用http dns
	 * @param onlineAppKey 正式key
	 * @param onlineAppSecret 正式环境secret
	 */
    public void enableHttpDns(String onlineAppKey, String onlineAppSecret){
        WebUtils.setIgnoreHostCheck(true);
        setHttpDnsHost(serverUrl);
        ClusterManager.initRefreshThread(onlineAppKey, onlineAppSecret);
        isHttpDnsEnabled = true;
    }
	
    private void setHttpDnsHost(String serverUrl){
        if(serverUrl == null || serverUrl.isEmpty()){
            return;
        }
        try {
            URL url = new URL(serverUrl);
            originalHttpHost = url.getHost();
        } catch (Exception e) {
            throw new RuntimeException("error serverUrl:" + serverUrl, e);
        }
    }
    
    public String getAppKey() {
        return appKey;
    }

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}
}
