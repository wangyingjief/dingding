package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCspaceAddToSingleChatResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.cspace.add_to_single_chat request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiCspaceAddToSingleChatRequest extends BaseDingTalkRequest<OapiCspaceAddToSingleChatResponse> {
	
	

	/** 
	* 文件接收人的userid
	 */
	private String agentId;

	/** 
	* 文件名(需包含含扩展名),需要utf-8 urlEncode
	 */
	private String fileName;

	/** 
	* 调用钉盘上传文件接口得到的mediaid,需要utf-8 urlEncode
	 */
	private String mediaId;

	/** 
	* 文件发送者微应用的agentId
	 */
	private String userid;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.cspace.add_to_single_chat";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agent_id", this.agentId);
		txtParams.put("file_name", this.fileName);
		txtParams.put("media_id", this.mediaId);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCspaceAddToSingleChatResponse> getResponseClass() {
		return OapiCspaceAddToSingleChatResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}