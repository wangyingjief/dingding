package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRoleAddroleResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.addrole request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiRoleAddroleRequest extends BaseDingTalkRequest<OapiRoleAddroleResponse> {
	
	

	/** 
	* test
	 */
	private Long groupId;

	/** 
	* test
	 */
	private String roleName;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.addrole";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("groupId", this.groupId);
		txtParams.put("roleName", this.roleName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleAddroleResponse> getResponseClass() {
		return OapiRoleAddroleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupId, "groupId");
		RequestCheckUtils.checkNotEmpty(roleName, "roleName");
	}
	

}