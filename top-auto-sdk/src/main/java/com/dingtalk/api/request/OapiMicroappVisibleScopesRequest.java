package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappVisibleScopesResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.visible_scopes request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappVisibleScopesRequest extends BaseDingTalkRequest<OapiMicroappVisibleScopesResponse> {
	
	

	/** 
	* 微应用实例化id
	 */
	private Long agentId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.visible_scopes";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agentId", this.agentId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappVisibleScopesResponse> getResponseClass() {
		return OapiMicroappVisibleScopesResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}