package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.corp.dingindex.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CorpDingindexGetResponse extends DingTalkResponse {

	private static final long serialVersionUID = 7727144349762794751L;

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

	
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingIndexVo extends TaobaoObject {
		private static final long serialVersionUID = 3263147969352442873L;
		/**
		 * 月平均钉钉指数
		 */
		@ApiField("avarage_month_index")
		private String avarageMonthIndex;
		/**
		 * 日钉钉指数
		 */
		@ApiField("day_index")
		private String dayIndex;
		/**
		 * 统计时间
		 */
		@ApiField("stat_date")
		private String statDate;
	
		public String getAvarageMonthIndex() {
			return this.avarageMonthIndex;
		}
		public void setAvarageMonthIndex(String avarageMonthIndex) {
			this.avarageMonthIndex = avarageMonthIndex;
		}
		public String getDayIndex() {
			return this.dayIndex;
		}
		public void setDayIndex(String dayIndex) {
			this.dayIndex = dayIndex;
		}
		public String getStatDate() {
			return this.statDate;
		}
		public void setStatDate(String statDate) {
			this.statDate = statDate;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 1342442573878163228L;
		/**
		 * result
		 */
		@ApiListField("ding_index_list")
		@ApiField("ding_index_vo")
		private List<DingIndexVo> dingIndexList;
		/**
		 * dingOpenErrcode
		 */
		@ApiField("ding_open_errcode")
		private Long dingOpenErrcode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	
		public List<DingIndexVo> getDingIndexList() {
			return this.dingIndexList;
		}
		public void setDingIndexList(List<DingIndexVo> dingIndexList) {
			this.dingIndexList = dingIndexList;
		}
		public Long getDingOpenErrcode() {
			return this.dingOpenErrcode;
		}
		public void setDingOpenErrcode(Long dingOpenErrcode) {
			this.dingOpenErrcode = dingOpenErrcode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
