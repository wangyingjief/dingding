package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpDingindexGetResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.dingindex.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpDingindexGetRequest extends BaseDingTalkRequest<CorpDingindexGetResponse> {
	
	

	/** 
	* 统计日期
	 */
	private String statDates;

	public void setStatDates(String statDates) {
		this.statDates = statDates;
	}

	public String getStatDates() {
		return this.statDates;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.dingindex.get";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("stat_dates", this.statDates);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpDingindexGetResponse> getResponseClass() {
		return CorpDingindexGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(statDates, "statDates");
		RequestCheckUtils.checkMaxListSize(statDates, 5, "statDates");
	}
	

}