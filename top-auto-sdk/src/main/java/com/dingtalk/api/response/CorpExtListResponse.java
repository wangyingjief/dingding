package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ext.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtListResponse extends DingTalkResponse {

	private static final long serialVersionUID = 3676353927697952231L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;


	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	
	


}
