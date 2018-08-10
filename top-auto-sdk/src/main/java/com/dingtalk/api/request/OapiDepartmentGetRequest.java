package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDepartmentGetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiDepartmentGetRequest extends BaseDingTalkRequest<OapiDepartmentGetResponse> {
	
	

	/** 
	* 部门id
	 */
	private String id;

	/** 
	* 通讯录语言(默认zh_CN，未来会支持en_US)
	 */
	private String lang;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return this.lang;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.department.get";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("lang", this.lang);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDepartmentGetResponse> getResponseClass() {
		return OapiDepartmentGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}