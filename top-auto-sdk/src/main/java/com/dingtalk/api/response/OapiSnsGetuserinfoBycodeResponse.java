package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.sns.getuserinfo_bycode response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSnsGetuserinfoBycodeResponse extends DingTalkResponse {

	private static final long serialVersionUID = 3418525232138724589L;

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
	 * user_info
	 */
	@ApiField("user_info")
	private UserInfo userInfo;


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

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserInfo getUserInfo( ) {
		return this.userInfo;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * user_info
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserInfo extends TaobaoObject {
		private static final long serialVersionUID = 2574846476754435512L;
		/**
		 * nick
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * openid
		 */
		@ApiField("openid")
		private String openid;
		/**
		 * unionid
		 */
		@ApiField("unionid")
		private String unionid;
	
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getOpenid() {
			return this.openid;
		}
		public void setOpenid(String openid) {
			this.openid = openid;
		}
		public String getUnionid() {
			return this.unionid;
		}
		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}
	}
	


}
