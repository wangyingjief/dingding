package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.microapp.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMicroappCreateResponse extends DingTalkResponse {

	private static final long serialVersionUID = 3845519283721565744L;

	/** 
	 * agentid
	 */
	@ApiField("agentid")
	private Long agentid;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;


	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}
	public Long getAgentid( ) {
		return this.agentid;
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
