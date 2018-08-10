package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.addchatbotinstance response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpChatbotAddchatbotinstanceResponse extends DingTalkResponse {

	private static final long serialVersionUID = 4729358961579144425L;

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
	public static class ChatbotInstanceVo extends TaobaoObject {
		private static final long serialVersionUID = 4274158776627592882L;
		/**
		 * 机器人实例userId
		 */
		@ApiField("chatbot_user_id")
		private String chatbotUserId;
		/**
		 * 机器人发消息时的地址
		 */
		@ApiField("webhook")
		private String webhook;
	
		public String getChatbotUserId() {
			return this.chatbotUserId;
		}
		public void setChatbotUserId(String chatbotUserId) {
			this.chatbotUserId = chatbotUserId;
		}
		public String getWebhook() {
			return this.webhook;
		}
		public void setWebhook(String webhook) {
			this.webhook = webhook;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 4142492271352957349L;
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
		private ChatbotInstanceVo result;
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
		public ChatbotInstanceVo getResult() {
			return this.result;
		}
		public void setResult(ChatbotInstanceVo result) {
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
