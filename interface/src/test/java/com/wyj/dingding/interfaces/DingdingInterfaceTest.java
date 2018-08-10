package com.wyj.dingding.interfaces;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.response.OapiDepartmentListResponse.Department;
import com.dingtalk.api.response.OapiReportListResponse;
import com.dingtalk.api.response.OapiUserListResponse.Userlist;

/**
 * 订订接口测试类
 * @author 英杰
 *
 */
public class DingdingInterfaceTest {

	String corpid = "";

	String corpsecret = "";

	DingdingInterface dingding;

	@Before
	public void initTest() {
		dingding = new DingdingInterfaceImpl(corpid, corpsecret);
	}

	@Test
	public void departmentListTest() {
		List<Department> list = dingding.departmentList("67633223");
		System.out.println(JSON.toJSONString(list));
	}

	@Test
	public void userListTest() {
		List<Userlist> list = dingding.userList(67563475L);
		System.out.println(JSON.toJSONString(list));
	}

	@Test
	public void topapiReportListTest() {
		Date startDate = new Date(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
		Date endDate = new Date();

		OapiReportListResponse report = dingding.topapiReportList("121113145226322425", startDate, endDate);
		System.out.println(JSON.toJSONString(report));
	}
}
