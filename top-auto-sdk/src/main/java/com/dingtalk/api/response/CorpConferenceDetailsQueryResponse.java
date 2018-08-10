package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.conference.details.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpConferenceDetailsQueryResponse extends DingTalkResponse {

	private static final long serialVersionUID = 1312627241285724771L;

	/** 
	 * 返回结果
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
