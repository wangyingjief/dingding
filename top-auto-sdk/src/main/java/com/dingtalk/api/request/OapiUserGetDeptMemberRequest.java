package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserGetDeptMemberResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getDeptMember request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.04
 */
public class OapiUserGetDeptMemberRequest extends BaseDingTalkRequest<OapiUserGetDeptMemberResponse> {
	
	

	/** 
	* a
	 */
	private String deptId;

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptId() {
		return this.deptId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.getDeptMember";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("deptId", this.deptId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserGetDeptMemberResponse> getResponseClass() {
		return OapiUserGetDeptMemberResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}