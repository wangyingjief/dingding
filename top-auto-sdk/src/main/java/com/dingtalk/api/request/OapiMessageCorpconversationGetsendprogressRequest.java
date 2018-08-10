package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiMessageCorpconversationGetsendprogressResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.getsendprogress request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMessageCorpconversationGetsendprogressRequest extends BaseDingTalkRequest<OapiMessageCorpconversationGetsendprogressResponse> {
	
	

	/** 
	* 发送消息时使用的微应用的id
	 */
	private Long agentId;

	/** 
	* 发送消息时钉钉返回的任务id
	 */
	private Long taskId;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.corpconversation.getsendprogress";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agent_id", this.agentId);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationGetsendprogressResponse> getResponseClass() {
		return OapiMessageCorpconversationGetsendprogressResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}