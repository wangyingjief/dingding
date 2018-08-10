package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiWorkrecordUpdateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.workrecord.update request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.07
 */
public class OapiWorkrecordUpdateRequest extends BaseDingTalkRequest<OapiWorkrecordUpdateResponse> {
	
	

	/** 
	* 待办事项唯一id
	 */
	private String recordId;

	/** 
	* 用户id
	 */
	private String userid;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordId() {
		return this.recordId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.workrecord.update";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("record_id", this.recordId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiWorkrecordUpdateResponse> getResponseClass() {
		return OapiWorkrecordUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(recordId, "recordId");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}