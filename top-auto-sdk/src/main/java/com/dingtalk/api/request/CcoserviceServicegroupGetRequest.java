package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CcoserviceServicegroupGetResponse;

/**
 * TOP DingTalk-API: dingtalk.ccoservice.servicegroup.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CcoserviceServicegroupGetRequest extends BaseDingTalkRequest<CcoserviceServicegroupGetResponse> {
	
	

	/** 
	* 服务群id
	 */
	private String openGroupId;

	public void setOpenGroupId(String openGroupId) {
		this.openGroupId = openGroupId;
	}

	public String getOpenGroupId() {
		return this.openGroupId;
	}

	public String getApiMethodName() {
		return "dingtalk.ccoservice.servicegroup.get";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("open_group_id", this.openGroupId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CcoserviceServicegroupGetResponse> getResponseClass() {
		return CcoserviceServicegroupGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(openGroupId, "openGroupId");
	}
	

}