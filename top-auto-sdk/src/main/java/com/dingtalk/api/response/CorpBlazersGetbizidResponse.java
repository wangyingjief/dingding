package com.dingtalk.api.response;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.blazers.getbizid response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpBlazersGetbizidResponse extends DingTalkResponse {

	private static final long serialVersionUID = 6612935132543776598L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7459924589682629716L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * result
		 */
		@ApiField("result")
		private String result;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getResult() {
			return this.result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public void setResultString(String result) {
			this.result = result;
		}
		
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
