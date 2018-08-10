package com.dingtalk.api.request;

import java.util.Date;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpConferenceDetailsQueryResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.conference.details.query request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpConferenceDetailsQueryRequest extends BaseDingTalkRequest<CorpConferenceDetailsQueryResponse> {
	
	

	/** 
	* 主叫userId
	 */
	private String callerUserId;

	/** 
	* 查询个数，上限100
	 */
	private Long limit;

	/** 
	* 成员userId
	 */
	private String memberUserId;

	/** 
	* 查询起始时间
	 */
	private Date sinceTime;

	public void setCallerUserId(String callerUserId) {
		this.callerUserId = callerUserId;
	}

	public String getCallerUserId() {
		return this.callerUserId;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setMemberUserId(String memberUserId) {
		this.memberUserId = memberUserId;
	}

	public String getMemberUserId() {
		return this.memberUserId;
	}

	public void setSinceTime(Date sinceTime) {
		this.sinceTime = sinceTime;
	}

	public Date getSinceTime() {
		return this.sinceTime;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.conference.details.query";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("caller_user_id", this.callerUserId);
		txtParams.put("limit", this.limit);
		txtParams.put("member_user_id", this.memberUserId);
		txtParams.put("since_time", this.sinceTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpConferenceDetailsQueryResponse> getResponseClass() {
		return CorpConferenceDetailsQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}