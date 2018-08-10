package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.SmartworkBpmsProcessGetbybiztypeResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.process.getbybiztype request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkBpmsProcessGetbybiztypeRequest extends BaseDingTalkRequest<SmartworkBpmsProcessGetbybiztypeResponse> {
	
	

	/** 
	* 套件开发时与审批约定的业务标识
	 */
	private String bizType;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.bpms.process.getbybiztype";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_type", this.bizType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessGetbybiztypeResponse> getResponseClass() {
		return SmartworkBpmsProcessGetbybiztypeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
	}
	

}