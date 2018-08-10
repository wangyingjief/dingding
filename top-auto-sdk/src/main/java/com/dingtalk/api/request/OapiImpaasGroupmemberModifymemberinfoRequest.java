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
import com.dingtalk.api.response.OapiImpaasGroupmemberModifymemberinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.modifymemberinfo request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.03
 */
public class OapiImpaasGroupmemberModifymemberinfoRequest extends BaseDingTalkRequest<OapiImpaasGroupmemberModifymemberinfoResponse> {
	
	

	/** 
	* 请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(ModifyGroupMemberInfoRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.groupmember.modifymemberinfo";
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

	public Class<OapiImpaasGroupmemberModifymemberinfoResponse> getResponseClass() {
		return OapiImpaasGroupmemberModifymemberinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 要修改的成员信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 6457395643254799975L;
		/**
		 * 用户id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 用户昵称，要修改到的值
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
	
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	
	/**
	 * 请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ModifyGroupMemberInfoRequest extends TaobaoObject {
		private static final long serialVersionUID = 3385146739712758113L;
		/**
		 * 群ID
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 要修改的成员信息
		 */
		@ApiField("member_info")
		private GroupMemberInfo memberInfo;
	
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public GroupMemberInfo getMemberInfo() {
			return this.memberInfo;
		}
		public void setMemberInfo(GroupMemberInfo memberInfo) {
			this.memberInfo = memberInfo;
		}
	}
	

}