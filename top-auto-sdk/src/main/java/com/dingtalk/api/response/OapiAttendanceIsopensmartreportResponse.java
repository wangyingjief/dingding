package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.attendance.isopensmartreport response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAttendanceIsopensmartreportResponse extends DingTalkResponse {

	private static final long serialVersionUID = 5836873574282158218L;

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
	@ApiField("result")
	private IsOpenSmartReportForTopVo result;


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

	public void setResult(IsOpenSmartReportForTopVo result) {
		this.result = result;
	}
	public IsOpenSmartReportForTopVo getResult( ) {
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
	public static class IsOpenSmartReportForTopVo extends TaobaoObject {
		private static final long serialVersionUID = 7865951136788346622L;
		/**
		 * 判断企业是否开启了考勤智能报表，true表示开启
		 */
		@ApiField("smart_report")
		private Boolean smartReport;
	
		public Boolean getSmartReport() {
			return this.smartReport;
		}
		public void setSmartReport(Boolean smartReport) {
			this.smartReport = smartReport;
		}
	}
	


}
