package com.wyj.dingding.interfaces;

/**
 * 所有钉钉的请求地址
 * 
 * @author 英杰
 *
 */
public class DingdingUri {
	
	/**
	 * 主地址
	 */
	public static final String BASE = "https://oapi.dingtalk.com";
	/**
	 * 获取AccessToken
	 */
	public static final String GETTOKEN = BASE + "/gettoken";
	/**
	 * 获取部门列表
	 */
	public static final String DEPARTMENT_LIST = BASE + "/department/list";
	/**
	 * 获取部门成员（详情）
	 */
	public static final String USER_LIST = BASE + "/user/list";
	/**
	 * 获取用户日志数据
	 */
	public static final String TOPAPI_REPORT_LIST = BASE + "/topapi/report/list";
}
