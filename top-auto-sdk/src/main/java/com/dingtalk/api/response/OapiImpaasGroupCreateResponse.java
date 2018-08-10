package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.group.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasGroupCreateResponse extends DingTalkResponse {

	private static final long serialVersionUID = 8847684156684132493L;

	/** 
	 * result
	 */
	@ApiField("chatid")
	private String chatid;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setChatid(String chatid) {
		this.chatid = chatid;
	}
	public String getChatid( ) {
		return this.chatid;
	}

	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
