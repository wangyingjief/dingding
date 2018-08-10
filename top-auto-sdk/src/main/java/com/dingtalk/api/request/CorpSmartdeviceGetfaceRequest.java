package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpSmartdeviceGetfaceResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.smartdevice.getface request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpSmartdeviceGetfaceRequest extends BaseDingTalkRequest<CorpSmartdeviceGetfaceResponse> {
	
	

	/** 
	* 员工ID
	 */
	private String userid;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.smartdevice.getface";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSmartdeviceGetfaceResponse> getResponseClass() {
		return CorpSmartdeviceGetfaceResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}