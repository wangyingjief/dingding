package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.SmartworkAttendsGetusergroupResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.attends.getusergroup request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkAttendsGetusergroupRequest extends BaseDingTalkRequest<SmartworkAttendsGetusergroupResponse> {
	
	

	/** 
	* 员工在企业内的UserID，企业用来唯一标识用户的字段。
	 */
	private String userid;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.attends.getusergroup";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkAttendsGetusergroupResponse> getResponseClass() {
		return SmartworkAttendsGetusergroupResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}