package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiHealthStepinfoListbyuseridResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.health.stepinfo.listbyuserid request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiHealthStepinfoListbyuseridRequest extends BaseDingTalkRequest<OapiHealthStepinfoListbyuseridResponse> {
	
	

	/** 
	* 时间，注意时间格式是YYMMDD
	 */
	private String statDate;

	/** 
	* 员工userid列表，最多传50个
	 */
	private String userids;

	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}

	public String getStatDate() {
		return this.statDate;
	}

	public void setUserids(String userids) {
		this.userids = userids;
	}

	public String getUserids() {
		return this.userids;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.health.stepinfo.listbyuserid";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("stat_date", this.statDate);
		txtParams.put("userids", this.userids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiHealthStepinfoListbyuseridResponse> getResponseClass() {
		return OapiHealthStepinfoListbyuseridResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(statDate, "statDate");
		RequestCheckUtils.checkNotEmpty(userids, "userids");
		RequestCheckUtils.checkMaxListSize(userids, 50, "userids");
	}
	

}