package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpChatbotListbychatbotidsResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.listbychatbotids request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpChatbotListbychatbotidsRequest extends BaseDingTalkRequest<CorpChatbotListbychatbotidsResponse> {
	
	

	/** 
	* chatbotId列表
	 */
	private String chatbotIds;

	public void setChatbotIds(String chatbotIds) {
		this.chatbotIds = chatbotIds;
	}

	public String getChatbotIds() {
		return this.chatbotIds;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.listbychatbotids";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("chatbot_ids", this.chatbotIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotListbychatbotidsResponse> getResponseClass() {
		return CorpChatbotListbychatbotidsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatbotIds, "chatbotIds");
		RequestCheckUtils.checkMaxListSize(chatbotIds, 20, "chatbotIds");
	}
	

}