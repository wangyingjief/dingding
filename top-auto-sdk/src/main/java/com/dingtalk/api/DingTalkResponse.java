package com.dingtalk.api;

import java.io.Serializable;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 钉钉API基础响应信息。
 * 
 * @author chaohui.zch 2016年11月4日下午4:24:40
 */
public abstract class DingTalkResponse extends TaobaoResponse implements Serializable {

	private static final long serialVersionUID = 6248594861757498235L;

	@ApiField("errcode")
	private Long errcode;

	@ApiField("errmsg")
	private String errmsg;

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
}
