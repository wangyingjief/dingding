package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiOrgSetscreenResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.setscreen request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiOrgSetscreenRequest extends BaseDingTalkRequest<OapiOrgSetscreenResponse> {
	
	

	/** 
	* yyyy-MM-dd显示截止时间
	 */
	private String endTime;

	/** 
	* 点击开机图片跳转地址
	 */
	private String jumpUrl;

	/** 
	* 开机图片资源id，可以通过/media/upload接口上传图片获取
	 */
	private String mediaId;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaId() {
		return this.mediaId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.org.setscreen";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("endTime", this.endTime);
		txtParams.put("jumpUrl", this.jumpUrl);
		txtParams.put("mediaId", this.mediaId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiOrgSetscreenResponse> getResponseClass() {
		return OapiOrgSetscreenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(mediaId, "mediaId");
	}
	

}