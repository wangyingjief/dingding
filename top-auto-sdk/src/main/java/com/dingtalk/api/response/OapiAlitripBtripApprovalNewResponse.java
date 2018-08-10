package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.approval.new response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripApprovalNewResponse extends DingTalkResponse {

	private static final long serialVersionUID = 8266268687656453869L;

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
	 * 结果对象
	 */
	@ApiListField("module")
	@ApiField("open_api_new_apply_rs")
	private List<OpenApiNewApplyRs> module;

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

	public void setModule(List<OpenApiNewApplyRs> module) {
		this.module = module;
	}
	public List<OpenApiNewApplyRs> getModule( ) {
		return this.module;
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
	
	/**
	 * 结果对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenApiNewApplyRs extends TaobaoObject {
		private static final long serialVersionUID = 1734914142396718599L;
		/**
		 * 商旅申请单id
		 */
		@ApiField("apply_id")
		private Long applyId;
		/**
		 * 外部申请单id
		 */
		@ApiField("thirdpart_apply_id")
		private String thirdpartApplyId;
	
		public Long getApplyId() {
			return this.applyId;
		}
		public void setApplyId(Long applyId) {
			this.applyId = applyId;
		}
		public String getThirdpartApplyId() {
			return this.thirdpartApplyId;
		}
		public void setThirdpartApplyId(String thirdpartApplyId) {
			this.thirdpartApplyId = thirdpartApplyId;
		}
	}
	


}
