package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.ext.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpExtAddResponse extends DingTalkResponse {

	private static final long serialVersionUID = 2551467398367561149L;

	/** 
	 * 新外部联系人的userId
	 */
	@ApiField("userid")
	private String userid;


	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid( ) {
		return this.userid;
	}

	
	


}
