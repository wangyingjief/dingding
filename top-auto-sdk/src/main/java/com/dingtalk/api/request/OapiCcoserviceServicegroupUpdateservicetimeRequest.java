package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCcoserviceServicegroupUpdateservicetimeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ccoservice.servicegroup.updateservicetime request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCcoserviceServicegroupUpdateservicetimeRequest extends BaseDingTalkRequest<OapiCcoserviceServicegroupUpdateservicetimeResponse> {
	
	

	/** 
	* 服务结束时间
	 */
	private String endTime;

	/** 
	* 群加密id
	 */
	private String openConversationId;

	/** 
	* 服务开始时间
	 */
	private String startTime;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ccoservice.servicegroup.updateservicetime";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("open_conversation_id", this.openConversationId);
		txtParams.put("start_time", this.startTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCcoserviceServicegroupUpdateservicetimeResponse> getResponseClass() {
		return OapiCcoserviceServicegroupUpdateservicetimeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
	}
	

}