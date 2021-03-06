package com.dingtalk.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceGetupdatedataResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.getupdatedata request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.31
 */
public class OapiAttendanceGetupdatedataRequest extends BaseDingTalkRequest<OapiAttendanceGetupdatedataResponse> {
	
	

	/** 
	* 用户id
	 */
	private String userid;

	/** 
	* 工作日
	 */
	private Date workDate;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public Date getWorkDate() {
		return this.workDate;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.getupdatedata";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userid", this.userid);
		txtParams.put("work_date", this.workDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceGetupdatedataResponse> getResponseClass() {
		return OapiAttendanceGetupdatedataResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userid, "userid");
		RequestCheckUtils.checkNotEmpty(workDate, "workDate");
	}
	

}