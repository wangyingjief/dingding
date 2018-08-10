package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetUnactiveCorpResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_unactive_corp request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiServiceGetUnactiveCorpRequest extends BaseDingTalkRequest<OapiServiceGetUnactiveCorpResponse> {
	
	

	/** 
	* 套件下的微应用ID
	 */
	private Long appId;

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAppId() {
		return this.appId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_unactive_corp";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("app_id", this.appId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetUnactiveCorpResponse> getResponseClass() {
		return OapiServiceGetUnactiveCorpResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}