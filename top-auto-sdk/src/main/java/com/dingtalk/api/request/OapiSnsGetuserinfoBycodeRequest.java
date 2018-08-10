package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiSnsGetuserinfoBycodeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.getuserinfo_bycode request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiSnsGetuserinfoBycodeRequest extends BaseDingTalkRequest<OapiSnsGetuserinfoBycodeResponse> {
	
	

	/** 
	* 登录的临时授权码
	 */
	private String tmpAuthCode;

	public void setTmpAuthCode(String tmpAuthCode) {
		this.tmpAuthCode = tmpAuthCode;
	}

	public String getTmpAuthCode() {
		return this.tmpAuthCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.sns.getuserinfo_bycode";
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

	public Class<OapiSnsGetuserinfoBycodeResponse> getResponseClass() {
		return OapiSnsGetuserinfoBycodeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}