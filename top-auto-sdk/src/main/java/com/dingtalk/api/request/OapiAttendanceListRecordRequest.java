package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiAttendanceListRecordResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.listRecord request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiAttendanceListRecordRequest extends BaseDingTalkRequest<OapiAttendanceListRecordResponse> {
	
	

	/** 
	* 查询考勤打卡记录的结束工作日。注意，起始与结束工作日最多相隔7天
	 */
	private String checkDateFrom;

	/** 
	* 查询考勤打卡记录的结束工作日。注意，起始与结束工作日最多相隔7天
	 */
	private String checkDateTo;

	/** 
	* 企业内的员工id列表，最多不能超过50个
	 */
	private List<String> userIds;

	public void setCheckDateFrom(String checkDateFrom) {
		this.checkDateFrom = checkDateFrom;
	}

	public String getCheckDateFrom() {
		return this.checkDateFrom;
	}

	public void setCheckDateTo(String checkDateTo) {
		this.checkDateTo = checkDateTo;
	}

	public String getCheckDateTo() {
		return this.checkDateTo;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.attendance.listRecord";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("checkDateFrom", this.checkDateFrom);
		txtParams.put("checkDateTo", this.checkDateTo);
		txtParams.put("userIds", TaobaoUtils.objectToJson(this.userIds));
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAttendanceListRecordResponse> getResponseClass() {
		return OapiAttendanceListRecordResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}