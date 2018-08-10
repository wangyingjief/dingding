package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiProcessinstanceExecuteResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.execute request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiProcessinstanceExecuteRequest extends BaseDingTalkRequest<OapiProcessinstanceExecuteResponse> {
	
	

	/** 
	* 操作人id，通过dingtalk.smartwork.bpms.processinstance.get这个接口可以获取
	 */
	private String actionerUserid;

	/** 
	* 审批实例id
	 */
	private String processInstanceId;

	/** 
	* 操作评论，可为空
	 */
	private String remark;

	/** 
	* 审批操作，同意-agree，拒绝-refuse
	 */
	private String result;

	/** 
	* 任务节点id，dingtalk.smartwork.bpms.processinstance.get接口可获取
	 */
	private Long taskId;

	public void setActionerUserid(String actionerUserid) {
		this.actionerUserid = actionerUserid;
	}

	public String getActionerUserid() {
		return this.actionerUserid;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return this.result;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.execute";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("actioner_userid", this.actionerUserid);
		txtParams.put("process_instance_id", this.processInstanceId);
		txtParams.put("remark", this.remark);
		txtParams.put("result", this.result);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessinstanceExecuteResponse> getResponseClass() {
		return OapiProcessinstanceExecuteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionerUserid, "actionerUserid");
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
		RequestCheckUtils.checkMaxLength(remark, 2000, "remark");
		RequestCheckUtils.checkNotEmpty(result, "result");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}