package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiChatGetRequest extends BaseDingTalkRequest<OapiChatGetResponse> {
	
	

	/** 
	* 群会话的id
	 */
	private String chatid;

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.get";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("chatid", this.chatid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatGetResponse> getResponseClass() {
		return OapiChatGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}