package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiHealthStepinfoGetuserstatusResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.health.stepinfo.getuserstatus request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiHealthStepinfoGetuserstatusRequest extends BaseDingTalkRequest<OapiHealthStepinfoGetuserstatusResponse> {
	
	

	/** 
	* 用户id
	 */
	private String userid;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.health.stepinfo.getuserstatus";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHealthStepinfoGetuserstatusResponse> getResponseClass() {
		return OapiHealthStepinfoGetuserstatusResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}