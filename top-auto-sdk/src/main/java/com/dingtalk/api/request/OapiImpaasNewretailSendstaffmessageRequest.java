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

import com.dingtalk.api.response.OapiImpaasNewretailSendstaffmessageResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.newretail.sendstaffmessage request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasNewretailSendstaffmessageRequest extends BaseDingTalkRequest<OapiImpaasNewretailSendstaffmessageResponse> {
	
	

	/** 
	* 消息体
	 */
	private String content;

	/** 
	* 0系统消息
	 */
	private Long msgType;

	/** 
	* 系统账号
	 */
	private String sender;

	/** 
	* 用账号列表
	 */
	private String useridList;

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

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.newretail.sendstaffmessage";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		txtParams.put("msg_type", this.msgType);
		txtParams.put("sender", this.sender);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasNewretailSendstaffmessageResponse> getResponseClass() {
		return OapiImpaasNewretailSendstaffmessageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(useridList, 100, "useridList");
	}
	

}