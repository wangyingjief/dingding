package com.dingtalk.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpMessageCorpconversationAsyncsendResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.message.corpconversation.asyncsend request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpMessageCorpconversationAsyncsendRequest extends BaseDingTalkRequest<CorpMessageCorpconversationAsyncsendResponse> {
	
	

	/** 
	* 微应用的id
	 */
	private Long agentId;

	/** 
	* 接收者的部门id列表
	 */
	private String deptIdList;

	/** 
	* 与msgtype对应的消息体，具体见文档
	 */
	private String msgcontent;

	/** 
	* 消息类型,如text、file、oa等，具体见文档
	 */
	private String msgtype;

	/** 
	* 是否发送给企业全部用户
	 */
	private Boolean toAllUser;

	/** 
	* 接收者的用户userid列表
	 */
	private String useridList;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
	}

	public void setMsgcontent(String msgcontent) {
		this.msgcontent = msgcontent;
	}
	public void setMsgcontentString(String msgcontent) {
		this.msgcontent = msgcontent;
	}

	public String getMsgcontent() {
		return this.msgcontent;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgtype() {
		return this.msgtype;
	}

	public void setToAllUser(Boolean toAllUser) {
		this.toAllUser = toAllUser;
	}

	public Boolean getToAllUser() {
		return this.toAllUser;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.message.corpconversation.asyncsend";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agent_id", this.agentId);
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("msgcontent", this.msgcontent);
		txtParams.put("msgtype", this.msgtype);
		txtParams.put("to_all_user", this.toAllUser);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpMessageCorpconversationAsyncsendResponse> getResponseClass() {
		return CorpMessageCorpconversationAsyncsendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxListSize(deptIdList, 20, "deptIdList");
		RequestCheckUtils.checkNotEmpty(msgcontent, "msgcontent");
		RequestCheckUtils.checkNotEmpty(msgtype, "msgtype");
		RequestCheckUtils.checkMaxListSize(useridList, 20, "useridList");
	}
	

}