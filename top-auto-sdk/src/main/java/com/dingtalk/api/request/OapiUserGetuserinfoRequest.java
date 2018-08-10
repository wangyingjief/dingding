package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserGetuserinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getuserinfo request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserGetuserinfoRequest extends BaseDingTalkRequest<OapiUserGetuserinfoResponse> {
	
	

	/** 
	* requestAuthCode接口中获取的CODE
	 */
	private String code;

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.getuserinfo";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("code", this.code);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserGetuserinfoResponse> getResponseClass() {
		return OapiUserGetuserinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}