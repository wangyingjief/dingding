package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserDeleteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.delete request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserDeleteRequest extends BaseDingTalkRequest<OapiUserDeleteResponse> {
	
	

	/** 
	* 员工唯一标识ID（不可修改）
	 */
	private String userid;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.delete";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserDeleteResponse> getResponseClass() {
		return OapiUserDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}