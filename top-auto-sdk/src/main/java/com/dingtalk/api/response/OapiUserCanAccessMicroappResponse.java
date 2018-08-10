package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.can_access_microapp response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserCanAccessMicroappResponse extends DingTalkResponse {

	private static final long serialVersionUID = 2281858819587313575L;

	/** 
	 * canAccess
	 */
	@ApiField("canAccess")
	private Boolean canAccess;

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


	public void setCanAccess(Boolean canAccess) {
		this.canAccess = canAccess;
	}
	public Boolean getCanAccess( ) {
		return this.canAccess;
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
