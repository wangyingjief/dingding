package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRoleUpdateroleResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.updaterole request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiRoleUpdateroleRequest extends BaseDingTalkRequest<OapiRoleUpdateroleResponse> {
	
	

	/** 
	* 1
	 */
	private Long roleId;

	/** 
	* 1
	 */
	private String roleName;

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.updaterole";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("roleId", this.roleId);
		txtParams.put("roleName", this.roleName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleUpdateroleResponse> getResponseClass() {
		return OapiRoleUpdateroleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(roleId, "roleId");
		RequestCheckUtils.checkNotEmpty(roleName, "roleName");
	}
	

}