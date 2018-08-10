package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserGetUseridByUnionidResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getUseridByUnionid request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserGetUseridByUnionidRequest extends BaseDingTalkRequest<OapiUserGetUseridByUnionidResponse> {
	
	

	/** 
	* 用户在当前钉钉开放平台账号范围内的唯一标识，同一个钉钉开放平台账号可以包含多个开放应用，同时也包含ISV的套件应用及企业应用
	 */
	private String unionid;

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.getUseridByUnionid";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("unionid", this.unionid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserGetUseridByUnionidResponse> getResponseClass() {
		return OapiUserGetUseridByUnionidResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}