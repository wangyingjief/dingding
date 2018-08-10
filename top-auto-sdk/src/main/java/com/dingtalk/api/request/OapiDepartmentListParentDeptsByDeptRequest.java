package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDepartmentListParentDeptsByDeptResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.list_parent_depts_by_dept request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiDepartmentListParentDeptsByDeptRequest extends BaseDingTalkRequest<OapiDepartmentListParentDeptsByDeptResponse> {
	
	

	/** 
	* 部门id
	 */
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.department.list_parent_depts_by_dept";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDepartmentListParentDeptsByDeptResponse> getResponseClass() {
		return OapiDepartmentListParentDeptsByDeptResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}