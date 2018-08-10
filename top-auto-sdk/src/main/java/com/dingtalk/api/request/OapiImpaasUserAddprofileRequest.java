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
import com.dingtalk.api.response.OapiImpaasUserAddprofileResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.addprofile request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasUserAddprofileRequest extends BaseDingTalkRequest<OapiImpaasUserAddprofileResponse> {
	
	

	/** 
	* 添加的账号信息
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(AddProfileReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.user.addprofile";
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

	public Class<OapiImpaasUserAddprofileResponse> getResponseClass() {
		return OapiImpaasUserAddprofileResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 添加的账号信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddProfileReq extends TaobaoObject {
		private static final long serialVersionUID = 6794538995545449538L;
		/**
		 * 渠道
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 二方账号id
		 */
		@ApiField("id")
		private String id;
		/**
		 * 账号nick
		 */
		@ApiField("nick")
		private String nick;
	
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
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
	}
	

}