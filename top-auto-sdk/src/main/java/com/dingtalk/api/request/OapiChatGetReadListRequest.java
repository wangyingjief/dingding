package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatGetReadListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.getReadList request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiChatGetReadListRequest extends BaseDingTalkRequest<OapiChatGetReadListResponse> {
	
	

	/** 
	* 分页查询的游标，第一次可以传0，后续传返回结果中的next_cursor的值。当返回结果中，没有next_cursor时，表示没有后续的数据了，可以结束调用
	 */
	private Long cursor;

	/** 
	* 发送群消息接口返回的加密消息id
	 */
	private String messageId;

	/** 
	* 分页查询的大小，最大可以传100
	 */
	private Long size;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.getReadList";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cursor", this.cursor);
		txtParams.put("messageId", this.messageId);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatGetReadListResponse> getResponseClass() {
		return OapiChatGetReadListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}