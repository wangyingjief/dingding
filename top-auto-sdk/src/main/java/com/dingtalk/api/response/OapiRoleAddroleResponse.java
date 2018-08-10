package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.role.addrole response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRoleAddroleResponse extends DingTalkResponse {

	private static final long serialVersionUID = 2622164881821686359L;

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

	/** 
	 * roleId
	 */
	@ApiField("roleId")
	private Long roleId;


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

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getRoleId( ) {
		return this.roleId;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
