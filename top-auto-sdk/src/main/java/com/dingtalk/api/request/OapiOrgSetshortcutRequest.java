package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiOrgSetshortcutResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.setshortcut request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiOrgSetshortcutRequest extends BaseDingTalkRequest<OapiOrgSetshortcutResponse> {
	
	

	/** 
	* 微应用实例id列表
	 */
	private String agentIds;

	public void setAgentIds(String agentIds) {
		this.agentIds = agentIds;
	}

	public String getAgentIds() {
		return this.agentIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.setshortcut";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agentIds", this.agentIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgSetshortcutResponse> getResponseClass() {
		return OapiOrgSetshortcutResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(agentIds, 20, "agentIds");
	}
	

}