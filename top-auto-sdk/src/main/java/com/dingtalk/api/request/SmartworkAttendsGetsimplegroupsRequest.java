package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.SmartworkAttendsGetsimplegroupsResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.attends.getsimplegroups request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkAttendsGetsimplegroupsRequest extends BaseDingTalkRequest<SmartworkAttendsGetsimplegroupsResponse> {
	
	

	/** 
	* 偏移位置
	 */
	private Long offset;

	/** 
	* 分页大小，最大10
	 */
	private Long size;

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

	public String getApiMethodName() {
		return "dingtalk.smartwork.attends.getsimplegroups";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkAttendsGetsimplegroupsResponse> getResponseClass() {
		return SmartworkAttendsGetsimplegroupsResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}