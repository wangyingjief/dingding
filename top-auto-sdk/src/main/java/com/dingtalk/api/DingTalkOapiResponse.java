package com.dingtalk.api;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.io.Serializable;

/**
 * 钉钉API基础响应信息。
 * 
 * @author chaohui.zch 2016年11月4日下午4:24:40
 */
public abstract class DingTalkOapiResponse extends TaobaoResponse implements Serializable {

	private static final long serialVersionUID = 6248594861757498235L;

	/**
	 * result
	 */
	@ApiField("errcode")
	private Long errcode;

	@ApiField("errmsg")
	private String errmsg;

	@ApiField("request_id")
	private String requestId;

	public Long getErrcode() {
		return errcode;
	}

	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public boolean isSuccess() {
		return errcode == null || errcode.equals(0);
	}
}
