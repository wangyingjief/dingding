package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.CorpSmartdeviceAddrecognizenotifyResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.smartdevice.addrecognizenotify request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpSmartdeviceAddrecognizenotifyRequest extends BaseDingTalkRequest<CorpSmartdeviceAddrecognizenotifyResponse> {
	
	

	/** 
	* 通知数据
	 */
	private String notifyVo;

	public void setNotifyVo(String notifyVo) {
		this.notifyVo = notifyVo;
	}

	public void setNotifyVo(RecognizeNotifyVO notifyVo) {
		this.notifyVo = new JSONWriter(false,true).write(notifyVo);
	}

	public String getNotifyVo() {
		return this.notifyVo;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.smartdevice.addrecognizenotify";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("notify_vo", this.notifyVo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpSmartdeviceAddrecognizenotifyResponse> getResponseClass() {
		return CorpSmartdeviceAddrecognizenotifyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 通知数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RecognizeNotifyVO extends TaobaoObject {
		private static final long serialVersionUID = 6739391465326595922L;
		/**
		 * 预约开始时间 timestamp(毫秒)
		 */
		@ApiField("appointed_endtime")
		private Long appointedEndtime;
		/**
		 * 预约结束时间 timestamp(毫秒)
		 */
		@ApiField("appointed_starttime")
		private Long appointedStarttime;
		/**
		 * 消息内容的模板，key向智能硬件团队申请
		 */
		@ApiField("notify_template")
		private String notifyTemplate;
		/**
		 * 通知类型 仅支持1：用户
		 */
		@ApiField("notify_type")
		private Long notifyType;
		/**
		 * 被通知的用户列表
		 */
		@ApiListField("notify_user_list")
		@ApiField("string")
		private List<String> notifyUserList;
		/**
		 * 识别结束时间 timestamp(毫秒)
		 */
		@ApiField("recognize_endtime")
		private Long recognizeEndtime;
		/**
		 * 识别开始时间 timestamp(毫秒)
		 */
		@ApiField("recognize_starttime")
		private Long recognizeStarttime;
		/**
		 * 联系人id
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getAppointedEndtime() {
			return this.appointedEndtime;
		}
		public void setAppointedEndtime(Long appointedEndtime) {
			this.appointedEndtime = appointedEndtime;
		}
		public Long getAppointedStarttime() {
			return this.appointedStarttime;
		}
		public void setAppointedStarttime(Long appointedStarttime) {
			this.appointedStarttime = appointedStarttime;
		}
		public String getNotifyTemplate() {
			return this.notifyTemplate;
		}
		public void setNotifyTemplate(String notifyTemplate) {
			this.notifyTemplate = notifyTemplate;
		}
		public Long getNotifyType() {
			return this.notifyType;
		}
		public void setNotifyType(Long notifyType) {
			this.notifyType = notifyType;
		}
		public List<String> getNotifyUserList() {
			return this.notifyUserList;
		}
		public void setNotifyUserList(List<String> notifyUserList) {
			this.notifyUserList = notifyUserList;
		}
		public Long getRecognizeEndtime() {
			return this.recognizeEndtime;
		}
		public void setRecognizeEndtime(Long recognizeEndtime) {
			this.recognizeEndtime = recognizeEndtime;
		}
		public Long getRecognizeStarttime() {
			return this.recognizeStarttime;
		}
		public void setRecognizeStarttime(Long recognizeStarttime) {
			this.recognizeStarttime = recognizeStarttime;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}