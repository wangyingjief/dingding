package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAuthScopesResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.auth.scopes request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiAuthScopesRequest extends BaseDingTalkRequest<OapiAuthScopesResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.auth.scopes";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAuthScopesResponse> getResponseClass() {
		return OapiAuthScopesResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}