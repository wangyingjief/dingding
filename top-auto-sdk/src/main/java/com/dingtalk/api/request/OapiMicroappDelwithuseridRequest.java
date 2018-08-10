package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMicroappDelwithuseridResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.delwithuserid request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMicroappDelwithuseridRequest extends BaseDingTalkRequest<OapiMicroappDelwithuseridResponse> {
	
	

	/** 
	* 微应用实例化id，表示企业和微应用的唯一关系
	 */
	private Long agentId;

	/** 
	* 用户id列表，最多10个
	 */
	private String userids;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.microapp.delwithuserid";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agentId", this.agentId);
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMicroappDelwithuseridResponse> getResponseClass() {
		return OapiMicroappDelwithuseridResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(userids, "userids");
		RequestCheckUtils.checkMaxListSize(userids, 20, "userids");
	}
	

}