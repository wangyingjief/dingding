package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CcoserviceServicegroupAddmemberResponse;

/**
 * TOP DingTalk-API: dingtalk.ccoservice.servicegroup.addmember request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CcoserviceServicegroupAddmemberRequest extends BaseDingTalkRequest<CcoserviceServicegroupAddmemberResponse> {
	
	

	/** 
	* 服务群id
	 */
	private String openGroupId;

	/** 
	* 企业员工id
	 */
	private String userid;

	public void setOpenGroupId(String openGroupId) {
		this.openGroupId = openGroupId;
	}

	public String getOpenGroupId() {
		return this.openGroupId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.ccoservice.servicegroup.addmember";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("open_group_id", this.openGroupId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CcoserviceServicegroupAddmemberResponse> getResponseClass() {
		return CcoserviceServicegroupAddmemberResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openGroupId, "openGroupId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}