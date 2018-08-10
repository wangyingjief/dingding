package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCcoserviceServicegroupIsignoreproblemcheckResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ccoservice.servicegroup.isignoreproblemcheck request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCcoserviceServicegroupIsignoreproblemcheckRequest extends BaseDingTalkRequest<OapiCcoserviceServicegroupIsignoreproblemcheckResponse> {
	
	

	/** 
	* 用户dingtalk加密id
	 */
	private String dingtalkId;

	/** 
	* 群id
	 */
	private String openConversationId;

	public void setDingtalkId(String dingtalkId) {
		this.dingtalkId = dingtalkId;
	}

	public String getDingtalkId() {
		return this.dingtalkId;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.ccoservice.servicegroup.isignoreproblemcheck";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dingtalk_id", this.dingtalkId);
		txtParams.put("open_conversation_id", this.openConversationId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCcoserviceServicegroupIsignoreproblemcheckResponse> getResponseClass() {
		return OapiCcoserviceServicegroupIsignoreproblemcheckResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dingtalkId, "dingtalkId");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
	}
	

}