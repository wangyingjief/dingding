package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpDeviceManageHasbinddeviceResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.device.manage.hasbinddevice request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpDeviceManageHasbinddeviceRequest extends BaseDingTalkRequest<CorpDeviceManageHasbinddeviceResponse> {
	
	

	/** 
	* 设备产品类型 产品编码：M1：9 C1：14 M2：15 D1：24
	 */
	private Long deviceServiceId;

	public void setDeviceServiceId(Long deviceServiceId) {
		this.deviceServiceId = deviceServiceId;
	}

	public Long getDeviceServiceId() {
		return this.deviceServiceId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.device.manage.hasbinddevice";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("device_service_id", this.deviceServiceId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDeviceManageHasbinddeviceResponse> getResponseClass() {
		return CorpDeviceManageHasbinddeviceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deviceServiceId, "deviceServiceId");
	}
	

}