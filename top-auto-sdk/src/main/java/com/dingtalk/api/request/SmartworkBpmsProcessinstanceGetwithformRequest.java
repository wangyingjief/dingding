package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.SmartworkBpmsProcessinstanceGetwithformResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstance.getwithform request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkBpmsProcessinstanceGetwithformRequest extends BaseDingTalkRequest<SmartworkBpmsProcessinstanceGetwithformResponse> {
	
	

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
		return "dingtalk.smartwork.bpms.processinstance.getwithform";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("process_instance_id", this.processInstanceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessinstanceGetwithformResponse> getResponseClass() {
		return SmartworkBpmsProcessinstanceGetwithformResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
	}
	

}