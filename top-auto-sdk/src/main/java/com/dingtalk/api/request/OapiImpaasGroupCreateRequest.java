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
import com.dingtalk.api.response.OapiImpaasGroupCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.06
 */
public class OapiImpaasGroupCreateRequest extends BaseDingTalkRequest<OapiImpaasGroupCreateResponse> {
	
	

	/** 
	* 创建群请求对象
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(CreateGroupRequest request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.group.create";
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

	public Class<OapiImpaasGroupCreateResponse> getResponseClass() {
		return OapiImpaasGroupCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 创建者
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BaseGroupMemberInfo extends TaobaoObject {
		private static final long serialVersionUID = 6373731453664731366L;
		/**
		 * 账号id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号类型
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
	 * 创建群请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateGroupRequest extends TaobaoObject {
		private static final long serialVersionUID = 6333877624464885177L;
		/**
		 * hema
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 创建者
		 */
		@ApiField("creater")
		private BaseGroupMemberInfo creater;
		/**
		 * 群成员列表
		 */
		@ApiListField("member_list")
		@ApiField("base_group_member_info")
		private List<BaseGroupMemberInfo> memberList;
		/**
		 * 群名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 群类型
		 */
		@ApiField("type")
		private Long type;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public BaseGroupMemberInfo getCreater() {
			return this.creater;
		}
		public void setCreater(BaseGroupMemberInfo creater) {
			this.creater = creater;
		}
		public List<BaseGroupMemberInfo> getMemberList() {
			return this.memberList;
		}
		public void setMemberList(List<BaseGroupMemberInfo> memberList) {
			this.memberList = memberList;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	

}