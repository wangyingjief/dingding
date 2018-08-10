package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpSmartdeviceHasfaceResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.smartdevice.hasface request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpSmartdeviceHasfaceRequest extends BaseDingTalkRequest<CorpSmartdeviceHasfaceResponse> {
	
	

	/** 
	* 查询用userid列表
	 */
	private String useridList;

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.smartdevice.hasface";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSmartdeviceHasfaceResponse> getResponseClass() {
		return CorpSmartdeviceHasfaceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(useridList, "useridList");
		RequestCheckUtils.checkMaxListSize(useridList, 20, "useridList");
	}
	

}