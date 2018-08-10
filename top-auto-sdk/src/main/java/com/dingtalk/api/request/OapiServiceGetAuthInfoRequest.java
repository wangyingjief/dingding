package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetAuthInfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_auth_info request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.01
 */
public class OapiServiceGetAuthInfoRequest extends BaseDingTalkRequest<OapiServiceGetAuthInfoResponse> {
	
	

	/** 
	* 授权方corpid
	 */
	private String authCorpid;

	/** 
	* 套件key
	 */
	private String suiteKey;

	public void setAuthCorpid(String authCorpid) {
		this.authCorpid = authCorpid;
	}

	public String getAuthCorpid() {
		return this.authCorpid;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_auth_info";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auth_corpid", this.authCorpid);
		txtParams.put("suite_key", this.suiteKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetAuthInfoResponse> getResponseClass() {
		return OapiServiceGetAuthInfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}