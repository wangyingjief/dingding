package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatUpdategroupnickResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.updategroupnick request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiChatUpdategroupnickRequest extends BaseDingTalkRequest<OapiChatUpdategroupnickResponse> {
	
	

	/** 
	* chatid
	 */
	private String chatid;

	/** 
	* 群昵称
	 */
	private String groupNick;

	/** 
	* 用户userid
	 */
	private String userid;

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setGroupNick(String groupNick) {
		this.groupNick = groupNick;
	}

	public String getGroupNick() {
		return this.groupNick;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.updategroupnick";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("chatid", this.chatid);
		txtParams.put("group_nick", this.groupNick);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatUpdategroupnickResponse> getResponseClass() {
		return OapiChatUpdategroupnickResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkNotEmpty(groupNick, "groupNick");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}