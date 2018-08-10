package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiServiceActivateSuiteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.service.activate_suite request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiServiceActivateSuiteRequest extends BaseDingTalkRequest<OapiServiceActivateSuiteResponse> {
	
	

	/** 
	* 授权方corpid
	 */
	private String authCorpid;

	/** 
	* 永久授权码，从get_permanent_code接口中获取
	 */
	private String permanentCode;

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
		return "dingtalk.oapi.service.activate_suite";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auth_corpid", this.authCorpid);
		txtParams.put("permanent_code", this.permanentCode);
		txtParams.put("suite_key", this.suiteKey);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiServiceActivateSuiteResponse> getResponseClass() {
		return OapiServiceActivateSuiteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}