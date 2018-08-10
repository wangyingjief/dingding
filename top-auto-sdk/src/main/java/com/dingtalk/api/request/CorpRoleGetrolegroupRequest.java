package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpRoleGetrolegroupResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.role.getrolegroup request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpRoleGetrolegroupRequest extends BaseDingTalkRequest<CorpRoleGetrolegroupResponse> {
	
	

	/** 
	* 角色组的Id
	 */
	private Long groupId;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.role.getrolegroup";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_id", this.groupId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpRoleGetrolegroupResponse> getResponseClass() {
		return CorpRoleGetrolegroupResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupId, "groupId");
	}
	

}