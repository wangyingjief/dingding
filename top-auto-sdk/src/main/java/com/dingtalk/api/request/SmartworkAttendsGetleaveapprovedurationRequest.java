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

import com.dingtalk.api.response.SmartworkAttendsGetleaveapprovedurationResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.attends.getleaveapproveduration request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkAttendsGetleaveapprovedurationRequest extends BaseDingTalkRequest<SmartworkAttendsGetleaveapprovedurationResponse> {
	
	

	/** 
	* 请假开始时间
	 */
	private Date fromDate;

	/** 
	* 请假结束时间
	 */
	private Date toDate;

	/** 
	* 员工在企业内的UserID，企业用来唯一标识用户的字段。
	 */
	private String userid;

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.attends.getleaveapproveduration";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("from_date", this.fromDate);
		txtParams.put("to_date", this.toDate);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkAttendsGetleaveapprovedurationResponse> getResponseClass() {
		return SmartworkAttendsGetleaveapprovedurationResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fromDate, "fromDate");
		RequestCheckUtils.checkNotEmpty(toDate, "toDate");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}