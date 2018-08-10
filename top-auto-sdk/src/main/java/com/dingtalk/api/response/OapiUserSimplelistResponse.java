package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.simplelist response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserSimplelistResponse extends DingTalkResponse {

	private static final long serialVersionUID = 4158419421992729835L;

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
	 * hasMore
	 */
	@ApiField("hasMore")
	private Boolean hasMore;

	/** 
	 * userlist
	 */
	@ApiField("userlist")
	private Userlist userlist;


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

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setUserlist(Userlist userlist) {
		this.userlist = userlist;
	}
	public Userlist getUserlist( ) {
		return this.userlist;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * userlist
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Userlist extends TaobaoObject {
		private static final long serialVersionUID = 6139326454781364221L;
		/**
		 * name
		 */
		@ApiField("name")
		private String name;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
