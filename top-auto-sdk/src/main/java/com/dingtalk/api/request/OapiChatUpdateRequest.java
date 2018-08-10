package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiChatUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.update request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiChatUpdateRequest extends BaseDingTalkRequest<OapiChatUpdateResponse> {
	
	

	/** 
	* 添加外部联系人成员列表
	 */
	private List<String> addExtidlist;

	/** 
	* 添加成员列表
	 */
	private List<String> addUseridlist;

	/** 
	* 群会话id
	 */
	private String chatid;

	/** 
	* 删除外部联系人成员列表
	 */
	private List<String> delExtidlist;

	/** 
	* 删除成员列表
	 */
	private List<String> delUseridlist;

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

	public void setAddExtidlist(List<String> addExtidlist) {
		this.addExtidlist = addExtidlist;
	}

	public List<String> getAddExtidlist() {
		return this.addExtidlist;
	}

	public void setAddUseridlist(List<String> addUseridlist) {
		this.addUseridlist = addUseridlist;
	}

	public List<String> getAddUseridlist() {
		return this.addUseridlist;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setDelExtidlist(List<String> delExtidlist) {
		this.delExtidlist = delExtidlist;
	}

	public List<String> getDelExtidlist() {
		return this.delExtidlist;
	}

	public void setDelUseridlist(List<String> delUseridlist) {
		this.delUseridlist = delUseridlist;
	}

	public List<String> getDelUseridlist() {
		return this.delUseridlist;
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

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.update";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("add_extidlist", TaobaoUtils.objectToJson(this.addExtidlist));
		txtParams.put("add_useridlist", TaobaoUtils.objectToJson(this.addUseridlist));
		txtParams.put("chatid", this.chatid);
		txtParams.put("del_extidlist", TaobaoUtils.objectToJson(this.delExtidlist));
		txtParams.put("del_useridlist", TaobaoUtils.objectToJson(this.delUseridlist));
		txtParams.put("name", this.name);
		txtParams.put("owner", this.owner);
		txtParams.put("ownerType", this.ownerType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatUpdateResponse> getResponseClass() {
		return OapiChatUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}