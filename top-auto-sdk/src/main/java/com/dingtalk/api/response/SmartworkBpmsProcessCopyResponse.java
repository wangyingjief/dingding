package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.process.copy response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartworkBpmsProcessCopyResponse extends DingTalkResponse {

	private static final long serialVersionUID = 2171358834626222337L;

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
	public static class ProcessVo extends TaobaoObject {
		private static final long serialVersionUID = 6483177286517386616L;
		/**
		 * bizCategoryId
		 */
		@ApiField("biz_category_id")
		private String bizCategoryId;
		/**
		 * description
		 */
		@ApiField("description")
		private String description;
		/**
		 * formContent
		 */
		@ApiField("form_content")
		private String formContent;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * processCode
		 */
		@ApiField("process_code")
		private String processCode;
	
		public String getBizCategoryId() {
			return this.bizCategoryId;
		}
		public void setBizCategoryId(String bizCategoryId) {
			this.bizCategoryId = bizCategoryId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getFormContent() {
			return this.formContent;
		}
		public void setFormContent(String formContent) {
			this.formContent = formContent;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProcessCode() {
			return this.processCode;
		}
		public void setProcessCode(String processCode) {
			this.processCode = processCode;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 6348931912268696573L;
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
		private ProcessVo result;
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
		public ProcessVo getResult() {
			return this.result;
		}
		public void setResult(ProcessVo result) {
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
