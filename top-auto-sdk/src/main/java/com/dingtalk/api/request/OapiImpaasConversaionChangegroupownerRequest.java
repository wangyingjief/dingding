package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImpaasConversaionChangegroupownerResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversaion.changegroupowner request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasConversaionChangegroupownerRequest extends BaseDingTalkRequest<OapiImpaasConversaionChangegroupownerResponse> {
	
	

	/** 
	* 应用channel
	 */
	private String channel;

	/** 
	* 钉钉会话id
	 */
	private String chatid;

	/** 
	* 员工id
	 */
	private String userid;

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.conversaion.changegroupowner";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel", this.channel);
		txtParams.put("chatid", this.chatid);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasConversaionChangegroupownerResponse> getResponseClass() {
		return OapiImpaasConversaionChangegroupownerResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}