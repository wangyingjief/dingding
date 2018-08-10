package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGetPersistentCodeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.get_persistent_code request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGetPersistentCodeRequest extends BaseDingTalkRequest<OapiSnsGetPersistentCodeResponse> {
	
	

	/** 
	* 用户授权给钉钉开放应用的临时授权码
	 */
	private String tmpAuthCode;

	public void setTmpAuthCode(String tmpAuthCode) {
		this.tmpAuthCode = tmpAuthCode;
	}

	public String getTmpAuthCode() {
		return this.tmpAuthCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.get_persistent_code";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tmp_auth_code", this.tmpAuthCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSnsGetPersistentCodeResponse> getResponseClass() {
		return OapiSnsGetPersistentCodeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}