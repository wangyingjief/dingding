package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpDeviceNickUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.device.nick.update request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpDeviceNickUpdateRequest extends BaseDingTalkRequest<CorpDeviceNickUpdateResponse> {
	
	

	/** 
	* 设备ID
	 */
	private String deviceId;

	/** 
	* 设备服务商ID
	 */
	private Long deviceServiceId;

	/** 
	* 设备新昵称
	 */
	private String newNick;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceServiceId(Long deviceServiceId) {
		this.deviceServiceId = deviceServiceId;
	}

	public Long getDeviceServiceId() {
		return this.deviceServiceId;
	}

	public void setNewNick(String newNick) {
		this.newNick = newNick;
	}

	public String getNewNick() {
		return this.newNick;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.device.nick.update";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("device_id", this.deviceId);
		txtParams.put("device_service_id", this.deviceServiceId);
		txtParams.put("new_nick", this.newNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDeviceNickUpdateResponse> getResponseClass() {
		return CorpDeviceNickUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceId, "deviceId");
		RequestCheckUtils.checkNotEmpty(deviceServiceId, "deviceServiceId");
		RequestCheckUtils.checkNotEmpty(newNick, "newNick");
	}
	

}