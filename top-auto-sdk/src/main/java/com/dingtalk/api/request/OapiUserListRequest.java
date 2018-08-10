package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.list request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiUserListRequest extends BaseDingTalkRequest<OapiUserListResponse> {
	
	

	/** 
	* 获取的部门id
	 */
	private Long departmentId;

	/** 
	* 通讯录语言(默认zh_CN另外支持en_US)
	 */
	private String lang;

	/** 
	* 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量
	 */
	private Long offset;

	/** 
	* 支持分页查询，部门成员的排序规则，默认不传是按自定义排序；entry_asc代表按照进入部门的时间升序，entry_desc代表按照进入部门的时间降序，modify_asc代表按照部门信息修改时间升序，modify_desc代表按照部门信息修改时间降序，custom代表用户定义(未定义时按照拼音)排序
	 */
	private String order;

	/** 
	* 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100
	 */
	private Long size;

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return this.lang;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOrder() {
		return this.order;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.list";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("department_id", this.departmentId);
		txtParams.put("lang", this.lang);
		txtParams.put("offset", this.offset);
		txtParams.put("order", this.order);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserListResponse> getResponseClass() {
		return OapiUserListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}