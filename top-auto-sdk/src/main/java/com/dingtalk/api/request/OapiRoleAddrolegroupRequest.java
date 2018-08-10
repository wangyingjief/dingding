package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiRoleAddrolegroupResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.addrolegroup request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiRoleAddrolegroupRequest extends BaseDingTalkRequest<OapiRoleAddrolegroupResponse> {
	
	

	/** 
	* 名称
	 */
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.role.addrolegroup";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("name", this.name);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRoleAddrolegroupResponse> getResponseClass() {
		return OapiRoleAddrolegroupResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(name, "name");
	}
	

}