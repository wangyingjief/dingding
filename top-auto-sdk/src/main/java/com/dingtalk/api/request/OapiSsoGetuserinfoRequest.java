package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSsoGetuserinfoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sso.getuserinfo request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSsoGetuserinfoRequest extends BaseDingTalkRequest<OapiSsoGetuserinfoResponse> {
	
	

	/** 
	* 通过Oauth认证给URL带上的CODE
	 */
	private String accessToken;

	/** 
	* 再次强调，此token不同于一般的accesstoken，需要调用获取微应用管理员免登需要的AccessToken
	 */
	private String code;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sso.getuserinfo";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("access_token", this.accessToken);
		txtParams.put("code", this.code);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiSsoGetuserinfoResponse> getResponseClass() {
		return OapiSsoGetuserinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}