package com.dingtalk.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.CorpChatbotCreateorgbotResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.chatbot.createorgbot request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpChatbotCreateorgbotRequest extends BaseDingTalkRequest<CorpChatbotCreateorgbotResponse> {
	
	

	/** 
	* 创建机器人modle
	 */
	private String createChatBotModel;

	public void setCreateChatBotModel(String createChatBotModel) {
		this.createChatBotModel = createChatBotModel;
	}

	public void setCreateChatBotModel(CreateChatBotModel createChatBotModel) {
		this.createChatBotModel = new JSONWriter(false,true).write(createChatBotModel);
	}

	public String getCreateChatBotModel() {
		return this.createChatBotModel;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.chatbot.createorgbot";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("create_chat_bot_model", this.createChatBotModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpChatbotCreateorgbotResponse> getResponseClass() {
		return CorpChatbotCreateorgbotResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 创建机器人modle
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CreateChatBotModel extends TaobaoObject {
		private static final long serialVersionUID = 1287242211389988222L;
		/**
		 * 2-企业对内机器人，3-企业对外机器人
		 */
		@ApiField("bot_type")
		private Long botType;
		/**
		 * 机器人简介
		 */
		@ApiField("breif")
		private String breif;
		/**
		 * 开通机器人企业id
		 */
		@ApiField("corp_id")
		private String corpId;
		/**
		 * 机器人功能详细描述
		 */
		@ApiField("description")
		private String description;
		/**
		 * 机器人头像
		 */
		@ApiField("icon")
		private String icon;
		/**
		 * 微应用id
		 */
		@ApiField("microapp_agent_id")
		private Long microappAgentId;
		/**
		 * 机器人名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 机器人安全秘钥
		 */
		@ApiField("outgoing_token")
		private String outgoingToken;
		/**
		 * 机器人回调URL
		 */
		@ApiField("outgoing_url")
		private String outgoingUrl;
		/**
		 * 机器人类型(钉钉分配)
		 */
		@ApiField("type")
		private String type;
	
		public Long getBotType() {
			return this.botType;
		}
		public void setBotType(Long botType) {
			this.botType = botType;
		}
		public String getBreif() {
			return this.breif;
		}
		public void setBreif(String breif) {
			this.breif = breif;
		}
		public String getCorpId() {
			return this.corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public String getDescription() {
			return this.description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIcon() {
			return this.icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public Long getMicroappAgentId() {
			return this.microappAgentId;
		}
		public void setMicroappAgentId(Long microappAgentId) {
			this.microappAgentId = microappAgentId;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOutgoingToken() {
			return this.outgoingToken;
		}
		public void setOutgoingToken(String outgoingToken) {
			this.outgoingToken = outgoingToken;
		}
		public String getOutgoingUrl() {
			return this.outgoingUrl;
		}
		public void setOutgoingUrl(String outgoingUrl) {
			this.outgoingUrl = outgoingUrl;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}
	

}