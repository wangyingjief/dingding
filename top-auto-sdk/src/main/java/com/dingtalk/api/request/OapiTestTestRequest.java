package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiTestTestResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.test.test request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiTestTestRequest extends BaseDingTalkRequest<OapiTestTestResponse> {
	
	

	/** 
	* 1
	 */
	private String input;

	public void setInput(String input) {
		this.input = input;
	}

	public String getInput() {
		return this.input;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.test.test";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("input", this.input);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiTestTestResponse> getResponseClass() {
		return OapiTestTestResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}