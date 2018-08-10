package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpBlazersRemovemappingResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.blazers.removemapping request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpBlazersRemovemappingRequest extends BaseDingTalkRequest<CorpBlazersRemovemappingResponse> {
	
	

	/** 
	* 商户唯一标识
	 */
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.blazers.removemapping";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_id", this.bizId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpBlazersRemovemappingResponse> getResponseClass() {
		return CorpBlazersRemovemappingResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}