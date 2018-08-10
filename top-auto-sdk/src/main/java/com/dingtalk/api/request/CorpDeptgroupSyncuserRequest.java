package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpDeptgroupSyncuserResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.deptgroup.syncuser request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpDeptgroupSyncuserRequest extends BaseDingTalkRequest<CorpDeptgroupSyncuserResponse> {
	
	

	/** 
	* 部门id
	 */
	private Long deptId;

	/** 
	* 用户id
	 */
	private String userid;

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.deptgroup.syncuser";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dept_id", this.deptId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDeptgroupSyncuserResponse> getResponseClass() {
		return CorpDeptgroupSyncuserResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}