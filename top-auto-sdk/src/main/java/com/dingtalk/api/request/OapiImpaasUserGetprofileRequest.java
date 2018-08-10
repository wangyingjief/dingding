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
import com.dingtalk.api.response.OapiImpaasUserGetprofileResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.getprofile request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasUserGetprofileRequest extends BaseDingTalkRequest<OapiImpaasUserGetprofileResponse> {
	
	

	/** 
	* 获取profile入参
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetProfileReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.user.getprofile";
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

	public Class<OapiImpaasUserGetprofileResponse> getResponseClass() {
		return OapiImpaasUserGetprofileResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 用户信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AccountInfo extends TaobaoObject {
		private static final long serialVersionUID = 6683177163611544339L;
		/**
		 * 类型为channelUser有效
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 用户类型对应id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 用户类型 员工:staff 二方：channelUser
		 */
		@ApiField("type")
		private String type;
	
		public String getChannel() {
			return this.channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
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
	 * 获取profile入参
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetProfileReq extends TaobaoObject {
		private static final long serialVersionUID = 4146527559257271859L;
		/**
		 * 用户信息
		 */
		@ApiField("accountInfo")
		private AccountInfo accountInfo;
	
		public AccountInfo getAccountInfo() {
			return this.accountInfo;
		}
		public void setAccountInfo(AccountInfo accountInfo) {
			this.accountInfo = accountInfo;
		}
	}
	

}