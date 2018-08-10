package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiImpaasGroupmemberModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.groupmember.modify request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.06
 */
public class OapiImpaasGroupmemberModifyRequest extends BaseDingTalkRequest<OapiImpaasGroupmemberModifyResponse> {
	
	

	/** 
	* 修改群成员列表入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GroupMemberListModifyRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.groupmember.modify";
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

	public Class<OapiImpaasGroupmemberModifyResponse> getResponseClass() {
		return OapiImpaasGroupmemberModifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 待操作成员列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 6792869498454735567L;
		/**
		 * 待成员id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 待操作成员类型
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
	 * 修改群成员列表入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMemberListModifyRequest extends TaobaoObject {
		private static final long serialVersionUID = 5179177423238566635L;
		/**
		 * 渠道号
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 会话id
		 */
		@ApiField("chatid")
		private String chatid;
		/**
		 * 待操作成员列表
		 */
		@ApiListField("member_list")
		@ApiField("base_group_member_info")
		private List<BaseGroupMemberInfo> memberList;
		/**
		 * 表示添加或删除
		 */
		@ApiField("modify_type")
		private String modifyType;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getChatid() {
			return this.chatid;
		}
		public void setChatid(String chatid) {
			this.chatid = chatid;
		}
		public List<BaseGroupMemberInfo> getMemberList() {
			return this.memberList;
		}
		public void setMemberList(List<BaseGroupMemberInfo> memberList) {
			this.memberList = memberList;
		}
		public String getModifyType() {
			return this.modifyType;
		}
		public void setModifyType(String modifyType) {
			this.modifyType = modifyType;
		}
	}
	

}