package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.delete request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappDeleteRequest extends BaseDingTalkRequest<OapiMicroappDeleteResponse> {
	
	

	/** 
	* 微应用实例化id，企业只能删除自建微应用
	 */
	private Long agentId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.delete";
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

	public Class<OapiMicroappDeleteResponse> getResponseClass() {
		return OapiMicroappDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}