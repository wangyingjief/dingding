package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpMessageCorpconversationGetsendresultResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.getsendresult request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpMessageCorpconversationGetsendresultRequest extends BaseDingTalkRequest<CorpMessageCorpconversationGetsendresultResponse> {
	
	

	/** 
	* 微应用的agentid
	 */
	private Long agentId;

	/** 
	* 异步任务的id
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
		return "dingtalk.corp.message.corpconversation.getsendresult";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
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

	public Class<CorpMessageCorpconversationGetsendresultResponse> getResponseClass() {
		return CorpMessageCorpconversationGetsendresultResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}