package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiImpaasGroupModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.modify request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.03
 */
public class OapiImpaasGroupModifyRequest extends BaseDingTalkRequest<OapiImpaasGroupModifyResponse> {
	
	

	/** 
	* 请求入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GroupInfoModifyRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.group.modify";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasGroupModifyResponse> getResponseClass() {
		return OapiImpaasGroupModifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 群主信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 8649869456579323291L;
		/**
		 * 群主id
		 */
		@ApiField("id")
		private String id;
		/**
		 * id类型 员工or openid
		 */
		@ApiField("type")
		private String type;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 请求入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupInfoModifyRequest extends TaobaoObject {
		private static final long serialVersionUID = 5634166578946353997L;
		/**
		 * 会话id
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 群名称
		 */
		@ApiField("group_name")
		private String groupName;
		/**
		 * 群主信息
		 */
		@ApiField("group_owner")
		private BaseGroupMemberInfo groupOwner;
	
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public BaseGroupMemberInfo getGroupOwner() {
			return this.groupOwner;
		}
		public void setGroupOwner(BaseGroupMemberInfo groupOwner) {
			this.groupOwner = groupOwner;
		}
	}
	

}