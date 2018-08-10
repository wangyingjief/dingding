package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.report.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiReportListResponse extends DingTalkResponse {

	private static final long serialVersionUID = 2684375697274719272L;

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
	 * result
	 */
	@ApiField("result")
	private PageVo result;


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

	public void setResult(PageVo result) {
		this.result = result;
	}
	public PageVo getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 日志内容
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JsonObject extends TaobaoObject {
		private static final long serialVersionUID = 6221858718725751345L;
		/**
		 * 模板内容
		 */
		@ApiField("key")
		private String key;
		/**
		 * 排序
		 */
		@ApiField("sort")
		private String sort;
		/**
		 * 类型
		 */
		@ApiField("type")
		private String type;
		/**
		 * 用户填写的内容
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getSort() {
			return this.sort;
		}
		public void setSort(String sort) {
			this.sort = sort;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
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
	 * 日志列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ReportOapiVo extends TaobaoObject {
		private static final long serialVersionUID = 3237194361665888192L;
		/**
		 * 日志内容
		 */
		@ApiListField("contents")
		@ApiField("json_object")
		private List<JsonObject> contents;
		/**
		 * 日志创建时间
		 */
		@ApiField("create_time")
		private Long createTime;
		/**
		 * 日志创建人userid
		 */
		@ApiField("creator_id")
		private String creatorId;
		/**
		 * 日志创建人
		 */
		@ApiField("creator_name")
		private String creatorName;
		/**
		 * 部门
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 日志图片列表
		 */
		@ApiListField("images")
		@ApiField("string")
		private List<String> images;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 日志唯一id
		 */
		@ApiField("report_id")
		private String reportId;
		/**
		 * 日志模板名
		 */
		@ApiField("template_name")
		private String templateName;
	
		public List<JsonObject> getContents() {
			return this.contents;
		}
		public void setContents(List<JsonObject> contents) {
			this.contents = contents;
		}
		public Long getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public String getCreatorId() {
			return this.creatorId;
		}
		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}
		public String getCreatorName() {
			return this.creatorName;
		}
		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public List<String> getImages() {
			return this.images;
		}
		public void setImages(List<String> images) {
			this.images = images;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getReportId() {
			return this.reportId;
		}
		public void setReportId(String reportId) {
			this.reportId = reportId;
		}
		public String getTemplateName() {
			return this.templateName;
		}
		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PageVo extends TaobaoObject {
		private static final long serialVersionUID = 8199513127333724543L;
		/**
		 * 日志列表
		 */
		@ApiListField("data_list")
		@ApiField("report_oapi_vo")
		private List<ReportOapiVo> dataList;
		/**
		 * 是否还有下一页
		 */
		@ApiField("has_more")
		private Boolean hasMore;
		/**
		 * nextCursor
		 */
		@ApiField("next_cursor")
		private Long nextCursor;
		/**
		 * 分页大小
		 */
		@ApiField("size")
		private Long size;
	
		public List<ReportOapiVo> getDataList() {
			return this.dataList;
		}
		public void setDataList(List<ReportOapiVo> dataList) {
			this.dataList = dataList;
		}
		public Boolean getHasMore() {
			return this.hasMore;
		}
		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}
		public Long getNextCursor() {
			return this.nextCursor;
		}
		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}
		public Long getSize() {
			return this.size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
	}
	


}
