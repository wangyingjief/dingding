package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappRuleGetRuleListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.rule.get_rule_list request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappRuleGetRuleListRequest extends BaseDingTalkRequest<OapiMicroappRuleGetRuleListResponse> {
	
	

	/** 
	* 微应用在企业内的id
	 */
	private Long agentId;

	/** 
	* 用户在企业内的唯一标识
	 */
	private String userid;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.rule.get_rule_list";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agentId", this.agentId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappRuleGetRuleListResponse> getResponseClass() {
		return OapiMicroappRuleGetRuleListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}