package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiChatCreateRequest extends BaseDingTalkRequest<OapiChatCreateResponse> {
	
	

	/** 
	* 群类型，2：企业群，0：普通群
	 */
	private Long conversationTag;

	/** 
	* 外部联系人成员列表
	 */
	private List<String> extidlist;

	/** 
	* 群名称
	 */
	private String name;

	/** 
	* 群主的userId
	 */
	private String owner;

	/** 
	* 群主类型，emp：企业员工，ext：外部联系人
	 */
	private String ownerType;

	/** 
	* 新成员可查看100条聊天历史消息的类型，1：可查看，默认或0：不可查看
	 */
	private Long showHistoryType;

	/** 
	* 群成员userId列表
	 */
	private List<String> useridlist;

	public void setConversationTag(Long conversationTag) {
		this.conversationTag = conversationTag;
	}

	public Long getConversationTag() {
		return this.conversationTag;
	}

	public void setExtidlist(List<String> extidlist) {
		this.extidlist = extidlist;
	}

	public List<String> getExtidlist() {
		return this.extidlist;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getOwnerType() {
		return this.ownerType;
	}

	public void setShowHistoryType(Long showHistoryType) {
		this.showHistoryType = showHistoryType;
	}

	public Long getShowHistoryType() {
		return this.showHistoryType;
	}

	public void setUseridlist(List<String> useridlist) {
		this.useridlist = useridlist;
	}

	public List<String> getUseridlist() {
		return this.useridlist;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.create";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("conversationTag", this.conversationTag);
		txtParams.put("extidlist", TaobaoUtils.objectToJson(this.extidlist));
		txtParams.put("name", this.name);
		txtParams.put("owner", this.owner);
		txtParams.put("ownerType", this.ownerType);
		txtParams.put("showHistoryType", this.showHistoryType);
		txtParams.put("useridlist", TaobaoUtils.objectToJson(this.useridlist));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatCreateResponse> getResponseClass() {
		return OapiChatCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}