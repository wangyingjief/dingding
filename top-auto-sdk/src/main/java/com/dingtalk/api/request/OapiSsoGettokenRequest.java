package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSsoGettokenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sso.gettoken request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSsoGettokenRequest extends BaseDingTalkRequest<OapiSsoGettokenResponse> {
	
	

	/** 
	* 企业Id
	 */
	private String corpid;

	/** 
	* 这里必须填写专属的SSOSecret
	 */
	private String corpsecret;

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}

	public String getCorpid() {
		return this.corpid;
	}

	public void setCorpsecret(String corpsecret) {
		this.corpsecret = corpsecret;
	}

	public String getCorpsecret() {
		return this.corpsecret;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sso.gettoken";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("corpid", this.corpid);
		txtParams.put("corpsecret", this.corpsecret);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSsoGettokenResponse> getResponseClass() {
		return OapiSsoGettokenResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}