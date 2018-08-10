package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.org.listshortcut response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOrgListshortcutResponse extends DingTalkResponse {

	private static final long serialVersionUID = 1854758772227124592L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OrgShortcutVO extends TaobaoObject {
		private static final long serialVersionUID = 6411778142776336898L;
		/**
		 * 类型，1表示工作台微应用
		 */
		@ApiField("type")
		private Long type;
		/**
		 * 微应用的agentId
		 */
		@ApiField("value")
		private String value;
	
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 5539237353694186956L;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * errorMsg
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * result
		 */
		@ApiListField("shortcuts")
		@ApiField("org_shortcut_v_o")
		private List<OrgShortcutVO> shortcuts;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public List<OrgShortcutVO> getShortcuts() {
			return this.shortcuts;
		}
		public void setShortcuts(List<OrgShortcutVO> shortcuts) {
			this.shortcuts = shortcuts;
		}
	}
	


}
