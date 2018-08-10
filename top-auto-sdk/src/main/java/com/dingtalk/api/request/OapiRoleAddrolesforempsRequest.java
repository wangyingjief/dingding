package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRoleAddrolesforempsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.addrolesforemps request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiRoleAddrolesforempsRequest extends BaseDingTalkRequest<OapiRoleAddrolesforempsResponse> {
	
	

	/** 
	* 角色id list
	 */
	private String roleIds;

	/** 
	* 员工id list
	 */
	private String userIds;

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getRoleIds() {
		return this.roleIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.addrolesforemps";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("roleIds", this.roleIds);
		txtParams.put("userIds", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleAddrolesforempsResponse> getResponseClass() {
		return OapiRoleAddrolesforempsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(roleIds, "roleIds");
		RequestCheckUtils.checkMaxListSize(roleIds, 20, "roleIds");
		RequestCheckUtils.checkNotEmpty(userIds, "userIds");
		RequestCheckUtils.checkMaxListSize(userIds, 20, "userIds");
	}
	

}