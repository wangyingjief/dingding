package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiReportTemplateListbyuseridResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.template.listbyuserid request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiReportTemplateListbyuseridRequest extends BaseDingTalkRequest<OapiReportTemplateListbyuseridResponse> {
	
	

	/** 
	* 分页游标，从0开始。根据返回结果里的next_cursor是否为空来判断是否还有下一页，且再次调用时offset设置成next_cursor的值
	 */
	private Long offset;

	/** 
	* 分页大小，最大可设置成100
	 */
	private Long size;

	/** 
	* 员工userId, 不传递表示获取所有日志模板
	 */
	private String userid;

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.report.template.listbyuserid";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("offset", this.offset);
		txtParams.put("size", this.size);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiReportTemplateListbyuseridResponse> getResponseClass() {
		return OapiReportTemplateListbyuseridResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}