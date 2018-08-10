package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserCanAccessMicroappResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.can_access_microapp request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserCanAccessMicroappRequest extends BaseDingTalkRequest<OapiUserCanAccessMicroappResponse> {
	
	

	/** 
	* 微应用id
	 */
	private Long appId;

	/** 
	* 员工唯一标识ID
	 */
	private String userId;

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.can_access_microapp";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("appId", this.appId);
		txtParams.put("userId", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserCanAccessMicroappResponse> getResponseClass() {
		return OapiUserCanAccessMicroappResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}