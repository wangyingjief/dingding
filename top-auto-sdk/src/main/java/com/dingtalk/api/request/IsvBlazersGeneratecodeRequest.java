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

import com.dingtalk.api.response.IsvBlazersGeneratecodeResponse;

/**
 * TOP DingTalk-API: dingtalk.isv.blazers.generatecode request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class IsvBlazersGeneratecodeRequest extends BaseDingTalkRequest<IsvBlazersGeneratecodeResponse> {
	
	

	/** 
	* 业务对象唯一标示
	 */
	private String bizId;

	/** 
	* 具体业务场景下约定的数据，格式：Map<String,String>
	 */
	private String ext;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
	public void setExtString(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public String getApiMethodName() {
		return "dingtalk.isv.blazers.generatecode";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_TOP;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_id", this.bizId);
		txtParams.put("ext", this.ext);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<IsvBlazersGeneratecodeResponse> getResponseClass() {
		return IsvBlazersGeneratecodeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizId, "bizId");
		RequestCheckUtils.checkNotEmpty(ext, "ext");
	}
	

}