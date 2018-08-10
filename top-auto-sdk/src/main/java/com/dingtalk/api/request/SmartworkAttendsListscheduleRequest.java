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

import com.dingtalk.api.response.SmartworkAttendsListscheduleResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.attends.listschedule request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkAttendsListscheduleRequest extends BaseDingTalkRequest<SmartworkAttendsListscheduleResponse> {
	
	

	/** 
	* 偏移位置
	 */
	private Long offset;

	/** 
	* 分页大小，最大200
	 */
	private Long size;

	/** 
	* 排班时间，只取年月日部分
	 */
	private Date workDate;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public Date getWorkDate() {
		return this.workDate;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.attends.listschedule";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		txtParams.put("work_date", this.workDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkAttendsListscheduleResponse> getResponseClass() {
		return SmartworkAttendsListscheduleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(workDate, "workDate");
	}
	

}