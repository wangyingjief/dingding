package com.dingtalk.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpMessageCorpconversationSendmockResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.sendmock request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpMessageCorpconversationSendmockRequest extends BaseDingTalkRequest<CorpMessageCorpconversationSendmockResponse> {
	
	

	/** 
	* 消息体
	 */
	private String message;

	/** 
	* 消息类型
	 */
	private String messageType;

	/** 
	* 微应用agentId
	 */
	private Long microappAgentId;

	/** 
	* 消息接收者部门列表
	 */
	private String toParty;

	/** 
	* 消息接收者userid列表
	 */
	private String toUser;

	public void setMessage(String message) {
		this.message = message;
	}
	public void setMessageString(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMicroappAgentId(Long microappAgentId) {
		this.microappAgentId = microappAgentId;
	}

	public Long getMicroappAgentId() {
		return this.microappAgentId;
	}

	public void setToParty(String toParty) {
		this.toParty = toParty;
	}

	public String getToParty() {
		return this.toParty;
	}

	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	public String getToUser() {
		return this.toUser;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.message.corpconversation.sendmock";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message", this.message);
		txtParams.put("message_type", this.messageType);
		txtParams.put("microapp_agent_id", this.microappAgentId);
		txtParams.put("to_party", this.toParty);
		txtParams.put("to_user", this.toUser);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpMessageCorpconversationSendmockResponse> getResponseClass() {
		return CorpMessageCorpconversationSendmockResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(message, "message");
		RequestCheckUtils.checkNotEmpty(messageType, "messageType");
		RequestCheckUtils.checkNotEmpty(microappAgentId, "microappAgentId");
		RequestCheckUtils.checkNotEmpty(toParty, "toParty");
		RequestCheckUtils.checkMaxListSize(toParty, 20, "toParty");
		RequestCheckUtils.checkNotEmpty(toUser, "toUser");
		RequestCheckUtils.checkMaxListSize(toUser, 20, "toUser");
	}
	

}