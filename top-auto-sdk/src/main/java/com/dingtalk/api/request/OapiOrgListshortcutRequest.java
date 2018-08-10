package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiOrgListshortcutResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.listshortcut request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiOrgListshortcutRequest extends BaseDingTalkRequest<OapiOrgListshortcutResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.org.listshortcut";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgListshortcutResponse> getResponseClass() {
		return OapiOrgListshortcutResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}