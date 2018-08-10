package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.SmartworkBpmsProcessinstanceUpdatevariablesResponse;

/**
 * TOP DingTalk-API: dingtalk.smartwork.bpms.processinstance.updatevariables request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class SmartworkBpmsProcessinstanceUpdatevariablesRequest extends BaseDingTalkRequest<SmartworkBpmsProcessinstanceUpdatevariablesResponse> {
	
	

	/** 
	* 审批实例id
	 */
	private String processInstanceId;

	/** 
	* 评论
	 */
	private String remark;

	/** 
	* 表单参数列表
	 */
	private String variables;

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

	public void setVariables(String variables) {
		this.variables = variables;
	}

	public void setVariables(List<BizValueVo> variables) {
		this.variables = new JSONWriter(false,true).write(variables);
	}

	public String getVariables() {
		return this.variables;
	}

	public String getApiMethodName() {
		return "dingtalk.smartwork.bpms.processinstance.updatevariables";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("process_instance_id", this.processInstanceId);
		txtParams.put("remark", this.remark);
		txtParams.put("variables", this.variables);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartworkBpmsProcessinstanceUpdatevariablesResponse> getResponseClass() {
		return SmartworkBpmsProcessinstanceUpdatevariablesResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
		RequestCheckUtils.checkObjectMaxListSize(variables, 5, "variables");
	}
	
	/**
	 * 表单参数列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BizValueVo extends TaobaoObject {
		private static final long serialVersionUID = 1257744979619416724L;
		/**
		 * 别名，审批表单控件唯一标识
		 */
		@ApiField("biz_alias")
		private String bizAlias;
		/**
		 * 扩展值
		 */
		@ApiField("ext_value")
		private String extValue;
		/**
		 * 表单值
		 */
		@ApiField("value")
		private String value;
	
		public String getBizAlias() {
			return this.bizAlias;
		}
		public void setBizAlias(String bizAlias) {
			this.bizAlias = bizAlias;
		}
		public String getExtValue() {
			return this.extValue;
		}
		public void setExtValue(String extValue) {
			this.extValue = extValue;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	

}