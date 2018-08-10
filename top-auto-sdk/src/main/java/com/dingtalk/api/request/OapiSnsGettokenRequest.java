package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGettokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.gettoken request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGettokenRequest extends BaseDingTalkRequest<OapiSnsGettokenResponse> {
	
	

	/** 
	* 由钉钉开放平台提供给开放应用的唯一标识
	 */
	private String appid;

	/** 
	* 由钉钉开放平台提供的密钥
	 */
	private String appsecret;

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppid() {
		return this.appid;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getAppsecret() {
		return this.appsecret;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.gettoken";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("appid", this.appid);
		txtParams.put("appsecret", this.appsecret);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsGettokenResponse> getResponseClass() {
		return OapiSnsGettokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}