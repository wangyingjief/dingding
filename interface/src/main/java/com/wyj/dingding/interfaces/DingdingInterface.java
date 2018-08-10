package com.wyj.dingding.interfaces;

import java.util.Date;
import java.util.List;
import com.dingtalk.api.response.OapiDepartmentListResponse.Department;
import com.dingtalk.api.response.OapiReportListResponse;
import com.dingtalk.api.response.OapiUserListResponse.Userlist;
import com.dingtalk.api.response.OapiReportListResponse.JsonObject;

/**
 * 基础接口
 * 
 * @author 英杰
 */
public interface DingdingInterface {

	/**
	 * 获取accessToken
	 * 
	 * @return
	 */
	public String accessToken();

	/**
	 * 获取部门信息
	 * 
	 * @param parentId
	 *            父部门id(如果不传，默认部门为根部门，根部门ID为1)
	 * @return
	 */
	public List<Department> departmentList(String parentId);

	/**
	 * 获取用户信息
	 * 
	 * @param departmentId
	 *            部门ID
	 * @return
	 */
	public List<Userlist> userList(Long departmentId);

	/**
	 * 获取日志
	 * 
	 * @param userId
	 * @param start
	 *            开始时间
	 * @param end
	 *            结束时间
	 * @return
	 */
	public OapiReportListResponse topapiReportList(String userId, Date start, Date end);
}
