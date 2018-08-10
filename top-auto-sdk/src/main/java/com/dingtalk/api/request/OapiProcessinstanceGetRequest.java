package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiProcessinstanceGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiProcessinstanceGetRequest extends BaseDingTalkRequest<OapiProcessinstanceGetResponse> {
	
	

	/** 
	* 审批实例id
	 */
	private String processInstanceId;

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.get";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("process_instance_id", this.processInstanceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessinstanceGetResponse> getResponseClass() {
		return OapiProcessinstanceGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
	}
	

}