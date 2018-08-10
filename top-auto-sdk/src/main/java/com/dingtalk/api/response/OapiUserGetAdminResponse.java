package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.get_admin response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiUserGetAdminResponse extends DingTalkResponse {

	private static final long serialVersionUID = 7484198779461132726L;

	/** 
	 * admin_list
	 */
	@ApiListField("admin_list")
	@ApiField("admin_list")
	private List<AdminList> adminList;

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


	public void setAdminList(List<AdminList> adminList) {
		this.adminList = adminList;
	}
	public List<AdminList> getAdminList( ) {
		return this.adminList;
	}

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

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * admin_list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AdminList extends TaobaoObject {
		private static final long serialVersionUID = 4756245853853576591L;
		/**
		 * sys_level
		 */
		@ApiField("sys_level")
		private Long sysLevel;
		/**
		 * userid
		 */
		@ApiField("userid")
		private String userid;
	
		public Long getSysLevel() {
			return this.sysLevel;
		}
		public void setSysLevel(Long sysLevel) {
			this.sysLevel = sysLevel;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
