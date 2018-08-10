package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.impaas.message.getmessagestatus response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiImpaasMessageGetmessagestatusResponse extends DingTalkResponse {

	private static final long serialVersionUID = 3135411344341328832L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private GetMessageStatusResponse result;


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

	public void setResult(GetMessageStatusResponse result) {
		this.result = result;
	}
	public GetMessageStatusResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 发送失败的详情 receiverId：失败的id code：失败的错误码 msg：失败的原因
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FailedModel extends TaobaoObject {
		private static final long serialVersionUID = 1549363144432267595L;
		/**
		 * code
		 */
		@ApiField("code")
		private String code;
		/**
		 * msg
		 */
		@ApiField("msg")
		private String msg;
		/**
		 * receiverId
		 */
		@ApiField("receiver_id")
		private String receiverId;
	
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMsg() {
			return this.msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getReceiverId() {
			return this.receiverId;
		}
		public void setReceiverId(String receiverId) {
			this.receiverId = receiverId;
		}
		public void setReceiverIdString(String receiverId) {
			this.receiverId = receiverId;
		}
		
	}
	
	/**
	 * 已读的接收者及时间列表 receiverId：用户id readTime：阅读时间，Long
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReadModel extends TaobaoObject {
		private static final long serialVersionUID = 2728581159694944934L;
		/**
		 * readTime
		 */
		@ApiField("read_time")
		private Long readTime;
		/**
		 * receiverId
		 */
		@ApiField("receiver_id")
		private String receiverId;
	
		public Long getReadTime() {
			return this.readTime;
		}
		public void setReadTime(Long readTime) {
			this.readTime = readTime;
		}
		public String getReceiverId() {
			return this.receiverId;
		}
		public void setReceiverId(String receiverId) {
			this.receiverId = receiverId;
		}
		public void setReceiverIdString(String receiverId) {
			this.receiverId = receiverId;
		}
		
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GetMessageStatusResponse extends TaobaoObject {
		private static final long serialVersionUID = 6893664155788141156L;
		/**
		 * 发送失败的详情 receiverId：失败的id code：失败的错误码 msg：失败的原因
		 */
		@ApiListField("failed_model")
		@ApiField("failed_model")
		private List<FailedModel> failedModel;
		/**
		 * 已读的接收者及时间列表 receiverId：用户id readTime：阅读时间，Long
		 */
		@ApiListField("read_model")
		@ApiField("read_model")
		private List<ReadModel> readModel;
		/**
		 * 消息任务执行返回码 0表示成功
		 */
		@ApiField("task_code")
		private Long taskCode;
		/**
		 * 错误信息
		 */
		@ApiField("task_msg")
		private String taskMsg;
		/**
		 * 消息任务执行状态 0：初始化，刚提交时的状态 3：处理中 4：处理完成 5：撤销
		 */
		@ApiField("task_status")
		private Long taskStatus;
	
		public List<FailedModel> getFailedModel() {
			return this.failedModel;
		}
		public void setFailedModel(List<FailedModel> failedModel) {
			this.failedModel = failedModel;
		}
		public List<ReadModel> getReadModel() {
			return this.readModel;
		}
		public void setReadModel(List<ReadModel> readModel) {
			this.readModel = readModel;
		}
		public Long getTaskCode() {
			return this.taskCode;
		}
		public void setTaskCode(Long taskCode) {
			this.taskCode = taskCode;
		}
		public String getTaskMsg() {
			return this.taskMsg;
		}
		public void setTaskMsg(String taskMsg) {
			this.taskMsg = taskMsg;
		}
		public Long getTaskStatus() {
			return this.taskStatus;
		}
		public void setTaskStatus(Long taskStatus) {
			this.taskStatus = taskStatus;
		}
	}
	


}
