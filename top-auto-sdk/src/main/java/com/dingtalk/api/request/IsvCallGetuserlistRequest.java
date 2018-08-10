package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.IsvCallGetuserlistResponse;

/**
 * TOP DingTalk-API: dingtalk.isv.call.getuserlist request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class IsvCallGetuserlistRequest extends BaseDingTalkRequest<IsvCallGetuserlistResponse> {
	
	

	/** 
	* 批量值
	 */
	private Long offset;

	/** 
	* 游标开始值
	 */
	private Long start;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public Long getStart() {
		return this.start;
	}

	public String getApiMethodName() {
		return "dingtalk.isv.call.getuserlist";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("offset", this.offset);
		txtParams.put("start", this.start);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<IsvCallGetuserlistResponse> getResponseClass() {
		return IsvCallGetuserlistResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}