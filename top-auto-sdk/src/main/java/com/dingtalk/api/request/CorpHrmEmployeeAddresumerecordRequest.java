package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.CorpHrmEmployeeAddresumerecordResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.hrm.employee.addresumerecord request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class CorpHrmEmployeeAddresumerecordRequest extends BaseDingTalkRequest<CorpHrmEmployeeAddresumerecordResponse> {
	
	

	/** 
	* 成长记录第一条内容
	 */
	private String content;

	/** 
	* 厂长记录kv展示内容：json格式，顺序展示
	 */
	private String kVContent;

	/** 
	* pc端url
	 */
	private String pcUrl;

	/** 
	* 手机端url
	 */
	private String phoneUrl;

	/** 
	* 20180428 零点零分零秒
	 */
	private Long recordTimeStamp;

	/** 
	* 成长记录title
	 */
	private String title;

	/** 
	* 被操作人userid
	 */
	private String userid;

	/** 
	* webOA后台url
	 */
	private String webUrl;

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setkVContent(String kVContent) {
		this.kVContent = kVContent;
	}

	public String getkVContent() {
		return this.kVContent;
	}

	public void setPcUrl(String pcUrl) {
		this.pcUrl = pcUrl;
	}

	public String getPcUrl() {
		return this.pcUrl;
	}

	public void setPhoneUrl(String phoneUrl) {
		this.phoneUrl = phoneUrl;
	}

	public String getPhoneUrl() {
		return this.phoneUrl;
	}

	public void setRecordTimeStamp(Long recordTimeStamp) {
		this.recordTimeStamp = recordTimeStamp;
	}

	public Long getRecordTimeStamp() {
		return this.recordTimeStamp;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public String getApiMethodName() {
		return "dingtalk.corp.hrm.employee.addresumerecord";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		txtParams.put("k_v_content", this.kVContent);
		txtParams.put("pc_url", this.pcUrl);
		txtParams.put("phone_url", this.phoneUrl);
		txtParams.put("record_time_stamp", this.recordTimeStamp);
		txtParams.put("title", this.title);
		txtParams.put("userid", this.userid);
		txtParams.put("web_url", this.webUrl);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CorpHrmEmployeeAddresumerecordResponse> getResponseClass() {
		return CorpHrmEmployeeAddresumerecordResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}