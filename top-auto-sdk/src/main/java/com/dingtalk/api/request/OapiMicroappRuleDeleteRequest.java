package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappRuleDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.rule.delete request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappRuleDeleteRequest extends BaseDingTalkRequest<OapiMicroappRuleDeleteResponse> {
	
	

	/** 
	* 规则所属的微应用agentId
	 */
	private Long agentId;

	/** 
	* 被删除的规则id
	 */
	private Long ruleId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.rule.delete";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agentId", this.agentId);
		txtParams.put("ruleId", this.ruleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappRuleDeleteResponse> getResponseClass() {
		return OapiMicroappRuleDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}