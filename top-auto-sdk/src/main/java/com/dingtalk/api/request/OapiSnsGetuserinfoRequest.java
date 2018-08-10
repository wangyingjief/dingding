package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGetuserinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.getuserinfo request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGetuserinfoRequest extends BaseDingTalkRequest<OapiSnsGetuserinfoResponse> {
	
	

	/** 
	* 用户授权给开放应用的token
	 */
	private String snsToken;

	public void setSnsToken(String snsToken) {
		this.snsToken = snsToken;
	}

	public String getSnsToken() {
		return this.snsToken;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.getuserinfo";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sns_token", this.snsToken);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsGetuserinfoResponse> getResponseClass() {
		return OapiSnsGetuserinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}