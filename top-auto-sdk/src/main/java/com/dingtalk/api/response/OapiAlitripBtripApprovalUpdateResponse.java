package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.approval.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripApprovalUpdateResponse extends DingTalkResponse {

	private static final long serialVersionUID = 1484381197696467538L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 成功标识
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
