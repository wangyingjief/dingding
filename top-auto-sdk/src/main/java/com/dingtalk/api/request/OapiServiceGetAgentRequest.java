package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceGetAgentResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.get_agent request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiServiceGetAgentRequest extends BaseDingTalkRequest<OapiServiceGetAgentResponse> {
	
	

	/** 
	* agentid
	 */
	private String agentid;

	/** 
	* auth_corpid
	 */
	private String authCorpid;

	/** 
	* permanent_code
	 */
	private String permanentCode;

	/** 
	* suite_key
	 */
	private String suiteKey;

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getAgentid() {
		return this.agentid;
	}

	public void setAuthCorpid(String authCorpid) {
		this.authCorpid = authCorpid;
	}

	public String getAuthCorpid() {
		return this.authCorpid;
	}

	public void setPermanentCode(String permanentCode) {
		this.permanentCode = permanentCode;
	}

	public String getPermanentCode() {
		return this.permanentCode;
	}

	public void setSuiteKey(String suiteKey) {
		this.suiteKey = suiteKey;
	}

	public String getSuiteKey() {
		return this.suiteKey;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.service.get_agent";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agentid", this.agentid);
		txtParams.put("auth_corpid", this.authCorpid);
		txtParams.put("permanent_code", this.permanentCode);
		txtParams.put("suite_key", this.suiteKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceGetAgentResponse> getResponseClass() {
		return OapiServiceGetAgentResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}