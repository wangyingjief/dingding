package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.SmartworkCheckinRecordGetResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.checkin.record.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkCheckinRecordGetRequest extends BaseDingTalkRequest<SmartworkCheckinRecordGetResponse> {
	
	

	/** 
	* 分页查询的游标，最开始可以传0
	 */
	private Long cursor;

	/** 
	* 截止时间，单位毫秒。如果是取1个人的数据，时间范围最大到10天，如果是取多个人的数据，时间范围最大1天。
	 */
	private Long endTime;

	/** 
	* 分页查询的每页大小，最大100
	 */
	private Long size;

	/** 
	* 起始时间,单位毫秒
	 */
	private Long startTime;

	/** 
	* 需要查询的用户列表
	 */
	private String useridList;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.checkin.record.get";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cursor", this.cursor);
		txtParams.put("end_time", this.endTime);
		txtParams.put("size", this.size);
		txtParams.put("start_time", this.startTime);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkCheckinRecordGetResponse> getResponseClass() {
		return SmartworkCheckinRecordGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 10, "useridList");
	}
	

}