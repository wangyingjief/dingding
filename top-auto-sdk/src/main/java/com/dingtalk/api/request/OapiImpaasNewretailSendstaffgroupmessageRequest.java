package com.dingtalk.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImpaasNewretailSendstaffgroupmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.newretail.sendstaffgroupmessage request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasNewretailSendstaffgroupmessageRequest extends BaseDingTalkRequest<OapiImpaasNewretailSendstaffgroupmessageResponse> {
	
	

	/** 
	* 加密后的群号
	 */
	private String chatId;

	/** 
	* 消息内容
	 */
	private String content;

	/** 
	* 消息类型
	 */
	private Long msgType;

	/** 
	* 系统账号名
	 */
	private String sender;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public void setContentString(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setMsgType(Long msgType) {
		this.msgType = msgType;
	}

	public Long getMsgType() {
		return this.msgType;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSender() {
		return this.sender;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.newretail.sendstaffgroupmessage";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("chat_id", this.chatId);
		txtParams.put("content", this.content);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("sender", this.sender);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasNewretailSendstaffgroupmessageResponse> getResponseClass() {
		return OapiImpaasNewretailSendstaffgroupmessageResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}