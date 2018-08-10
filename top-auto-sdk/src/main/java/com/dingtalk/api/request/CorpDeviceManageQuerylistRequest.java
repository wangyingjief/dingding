package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpDeviceManageQuerylistResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.device.manage.querylist request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpDeviceManageQuerylistRequest extends BaseDingTalkRequest<CorpDeviceManageQuerylistResponse> {
	
	

	/** 
	* 分页拉取设备列表的游标，首次拉取可传Null或者0
	 */
	private Long cursor;

	/** 
	* 设备服务商ID
	 */
	private Long deviceServiceId;

	/** 
	* 单次请求的大小，最大不超过20
	 */
	private Long size;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setDeviceServiceId(Long deviceServiceId) {
		this.deviceServiceId = deviceServiceId;
	}

	public Long getDeviceServiceId() {
		return this.deviceServiceId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.device.manage.querylist";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cursor", this.cursor);
		txtParams.put("device_service_id", this.deviceServiceId);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDeviceManageQuerylistResponse> getResponseClass() {
		return CorpDeviceManageQuerylistResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(deviceServiceId, "deviceServiceId");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 20L, "size");
	}
	

}