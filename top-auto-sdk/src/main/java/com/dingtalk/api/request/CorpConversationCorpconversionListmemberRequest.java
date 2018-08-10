package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpConversationCorpconversionListmemberResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.conversation.corpconversion.listmember request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpConversationCorpconversionListmemberRequest extends BaseDingTalkRequest<CorpConversationCorpconversionListmemberResponse> {
	
	

	/** 
	* 本次请求获取群成员的大小，最大为100
	 */
	private Long count;

	/** 
	* 群成员列表偏移量
	 */
	private Long offset;

	/** 
	* 群组id
	 */
	private String openConversationId;

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getCount() {
		return this.count;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOpenConversationId(String openConversationId) {
		this.openConversationId = openConversationId;
	}

	public String getOpenConversationId() {
		return this.openConversationId;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.conversation.corpconversion.listmember";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("count", this.count);
		txtParams.put("offset", this.offset);
		txtParams.put("open_conversation_id", this.openConversationId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpConversationCorpconversionListmemberResponse> getResponseClass() {
		return CorpConversationCorpconversionListmemberResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(count, "count");
		RequestCheckUtils.checkNotEmpty(offset, "offset");
		RequestCheckUtils.checkNotEmpty(openConversationId, "openConversationId");
	}
	

}