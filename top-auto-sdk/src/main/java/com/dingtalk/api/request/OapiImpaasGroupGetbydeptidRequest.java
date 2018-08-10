package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiImpaasGroupGetbydeptidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.getbydeptid request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiImpaasGroupGetbydeptidRequest extends BaseDingTalkRequest<OapiImpaasGroupGetbydeptidResponse> {
	
	

	/** 
	* 1企业全员群
	 */
	private Long deptId;

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDeptId() {
		return this.deptId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.impaas.group.getbydeptid";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dept_id", this.deptId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiImpaasGroupGetbydeptidResponse> getResponseClass() {
		return OapiImpaasGroupGetbydeptidResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deptId, "deptId");
	}
	

}