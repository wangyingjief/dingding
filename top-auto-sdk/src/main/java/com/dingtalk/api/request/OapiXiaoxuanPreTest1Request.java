package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiXiaoxuanPreTest1Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.xiaoxuan.pre.test1 request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiXiaoxuanPreTest1Request extends BaseDingTalkRequest<OapiXiaoxuanPreTest1Response> {
	
	

	/** 
	* 1
	 */
	private String systemData;

	public void setSystemData(String systemData) {
		this.systemData = systemData;
	}

	public String getSystemData() {
		return this.systemData;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.xiaoxuan.pre.test1";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("systemData", this.systemData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiXiaoxuanPreTest1Response> getResponseClass() {
		return OapiXiaoxuanPreTest1Response.class;
	}

	public void check() throws ApiRuleException {
	}
	

}