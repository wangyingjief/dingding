package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpBlazersUnbindResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.blazers.unbind request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpBlazersUnbindRequest extends BaseDingTalkRequest<CorpBlazersUnbindResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.corp.blazers.unbind";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpBlazersUnbindResponse> getResponseClass() {
		return CorpBlazersUnbindResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}