package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImpaasConversationCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.conversation.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasConversationCreateRequest extends BaseDingTalkRequest<OapiImpaasConversationCreateResponse> {
	
	

	/** 
	* 渠道
	 */
	private String channel;

	/** 
	* 群名称
	 */
	private String name;

	/** 
	* 群主员工id
	 */
	private String ownerUserid;

	/** 
	* 成员员工id列表
	 */
	private String useridList;

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOwnerUserid(String ownerUserid) {
		this.ownerUserid = ownerUserid;
	}

	public String getOwnerUserid() {
		return this.ownerUserid;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.conversation.create";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel", this.channel);
		txtParams.put("name", this.name);
		txtParams.put("owner_userid", this.ownerUserid);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasConversationCreateResponse> getResponseClass() {
		return OapiImpaasConversationCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(channel, "channel");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkNotEmpty(ownerUserid, "ownerUserid");
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 500, "useridList");
	}
	

}