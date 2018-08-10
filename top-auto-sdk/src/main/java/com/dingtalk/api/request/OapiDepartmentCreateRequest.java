package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiDepartmentCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.department.create request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiDepartmentCreateRequest extends BaseDingTalkRequest<OapiDepartmentCreateResponse> {
	
	

	/** 
	* 是否创建一个关联此部门的企业群，默认为false
	 */
	private Boolean createDeptGroup;

	/** 
	* 是否隐藏部门, true表示隐藏, false表示显示
	 */
	private Boolean deptHiding;

	/** 
	* 可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用 | 符号进行分割。总数不能超过200。
	 */
	private String deptPerimits;

	/** 
	* 部门名称。长度限制为1~64个字符。不允许包含字符‘-’‘，’以及‘,’
	 */
	private String name;

	/** 
	* 在父部门中的次序值。order值小的排序靠前
	 */
	private String order;

	/** 
	* 是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己
	 */
	private Boolean outerDept;

	/** 
	* 本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割。总数不能超过200。
	 */
	private String outerPermitDepts;

	/** 
	* 本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用|符号进行分割。总数不能超过200。
	 */
	private String outerPermitUsers;

	/** 
	* 是否优先使用父部门的预算
	 */
	private Boolean parentBalanceFirst;

	/** 
	* 父部门id。根部门id为1
	 */
	private String parentid;

	/** 
	* 是否共享预算
	 */
	private Boolean shareBalance;

	/** 
	* 部门标识字段，开发者可用该字段来唯一标识一个部门，并与钉钉外部通讯录里的部门做映射
	 */
	private String sourceIdentifier;

	/** 
	* 可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割。总数不能超过200。
	 */
	private String userPerimits;

	public void setCreateDeptGroup(Boolean createDeptGroup) {
		this.createDeptGroup = createDeptGroup;
	}

	public Boolean getCreateDeptGroup() {
		return this.createDeptGroup;
	}

	public void setDeptHiding(Boolean deptHiding) {
		this.deptHiding = deptHiding;
	}

	public Boolean getDeptHiding() {
		return this.deptHiding;
	}

	public void setDeptPerimits(String deptPerimits) {
		this.deptPerimits = deptPerimits;
	}

	public String getDeptPerimits() {
		return this.deptPerimits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrder() {
		return this.order;
	}

	public void setOuterDept(Boolean outerDept) {
		this.outerDept = outerDept;
	}

	public Boolean getOuterDept() {
		return this.outerDept;
	}

	public void setOuterPermitDepts(String outerPermitDepts) {
		this.outerPermitDepts = outerPermitDepts;
	}

	public String getOuterPermitDepts() {
		return this.outerPermitDepts;
	}

	public void setOuterPermitUsers(String outerPermitUsers) {
		this.outerPermitUsers = outerPermitUsers;
	}

	public String getOuterPermitUsers() {
		return this.outerPermitUsers;
	}

	public void setParentBalanceFirst(Boolean parentBalanceFirst) {
		this.parentBalanceFirst = parentBalanceFirst;
	}

	public Boolean getParentBalanceFirst() {
		return this.parentBalanceFirst;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getParentid() {
		return this.parentid;
	}

	public void setShareBalance(Boolean shareBalance) {
		this.shareBalance = shareBalance;
	}

	public Boolean getShareBalance() {
		return this.shareBalance;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setUserPerimits(String userPerimits) {
		this.userPerimits = userPerimits;
	}

	public String getUserPerimits() {
		return this.userPerimits;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.department.create";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("createDeptGroup", this.createDeptGroup);
		txtParams.put("deptHiding", this.deptHiding);
		txtParams.put("deptPerimits", this.deptPerimits);
		txtParams.put("name", this.name);
		txtParams.put("order", this.order);
		txtParams.put("outerDept", this.outerDept);
		txtParams.put("outerPermitDepts", this.outerPermitDepts);
		txtParams.put("outerPermitUsers", this.outerPermitUsers);
		txtParams.put("parentBalanceFirst", this.parentBalanceFirst);
		txtParams.put("parentid", this.parentid);
		txtParams.put("shareBalance", this.shareBalance);
		txtParams.put("sourceIdentifier", this.sourceIdentifier);
		txtParams.put("userPerimits", this.userPerimits);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiDepartmentCreateResponse> getResponseClass() {
		return OapiDepartmentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}