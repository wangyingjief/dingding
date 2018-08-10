package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.getDeptMember response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetDeptMemberResponse extends DingTalkResponse {

	private static final long serialVersionUID = 3361779191195453492L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * userIds
	 */
	@ApiListField("userIds")
	@ApiField("number")
	private List<Long> userIds;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}
	public List<Long> getUserIds( ) {
		return this.userIds;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
