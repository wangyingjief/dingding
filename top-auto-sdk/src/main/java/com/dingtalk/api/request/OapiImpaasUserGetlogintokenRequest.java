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
import com.dingtalk.api.response.OapiImpaasUserGetlogintokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.user.getlogintoken request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.06
 */
public class OapiImpaasUserGetlogintokenRequest extends BaseDingTalkRequest<OapiImpaasUserGetlogintokenResponse> {
	
	

	/** 
	* 获取免登token请求
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(GetLoginTokenReq request) {
		this.request = new JSONWriter(false,false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.user.getlogintoken";
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

	public Class<OapiImpaasUserGetlogintokenResponse> getResponseClass() {
		return OapiImpaasUserGetlogintokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 获取免登token请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetLoginTokenReq extends TaobaoObject {
		private static final long serialVersionUID = 7569168928351259851L;
		/**
		 * 渠道类型
		 */
		@ApiField("channel")
		private String channel;
		/**
		 * 二方账号
		 */
		@ApiField("id")
		private String id;
	
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
	}
	

}