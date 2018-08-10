package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImpaasConversationModifymemberResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.modifymember request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasConversationModifymemberRequest extends BaseDingTalkRequest<OapiImpaasConversationModifymemberResponse> {
	
	

	/** 
	* 渠道
	 */
	private String channel;

	/** 
	* 群ID
	 */
	private String chatid;

	/** 
	* 会员ID列表
	 */
	private String memberidList;

	/** 
	* 1 添加 2 删除
	 */
	private Long type;

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

	public void setMemberidList(String memberidList) {
		this.memberidList = memberidList;
	}

	public String getMemberidList() {
		return this.memberidList;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.conversation.modifymember";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel", this.channel);
		txtParams.put("chatid", this.chatid);
		txtParams.put("memberid_list", this.memberidList);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasConversationModifymemberResponse> getResponseClass() {
		return OapiImpaasConversationModifymemberResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(channel, "channel");
		RequestCheckUtils.checkNotEmpty(chatid, "chatid");
		RequestCheckUtils.checkNotEmpty(memberidList, "memberidList");
		RequestCheckUtils.checkMaxListSize(memberidList, 500, "memberidList");
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}