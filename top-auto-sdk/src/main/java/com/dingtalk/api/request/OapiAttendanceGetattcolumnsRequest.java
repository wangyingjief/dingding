package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceGetattcolumnsResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getattcolumns request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.06
 */
public class OapiAttendanceGetattcolumnsRequest extends BaseDingTalkRequest<OapiAttendanceGetattcolumnsResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.getattcolumns";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGetattcolumnsResponse> getResponseClass() {
		return OapiAttendanceGetattcolumnsResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}