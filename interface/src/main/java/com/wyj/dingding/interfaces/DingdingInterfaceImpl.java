package com.wyj.dingding.interfaces;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiDepartmentListRequest;
import com.dingtalk.api.request.OapiReportListRequest;
import com.dingtalk.api.request.OapiUserListRequest;
import com.dingtalk.api.response.OapiDepartmentListResponse;
import com.dingtalk.api.response.OapiReportListResponse;
import com.dingtalk.api.response.OapiDepartmentListResponse.Department;
import com.dingtalk.api.response.OapiReportListResponse.JsonObject;
import com.dingtalk.api.response.OapiUserListResponse;
import com.dingtalk.api.response.OapiUserListResponse.Userlist;
import com.taobao.api.ApiException;
import com.wtds.tools.StringUtil;
import com.wtds.tools.http.HttpUtil;

public class DingdingInterfaceImpl implements DingdingInterface {

	/**
	 * 失效时间
	 */
	private static final Long INACTIVE_TIME = 1000L * 60L * 60L;

	/**
	 * accessToken
	 */
	private static String ACCESS_TOKEN;

	/**
	 * accessToken获取时间
	 */
	private static Long ACCESS_TOKEN_GET_TIME;

	private String corpid = "";

	private String corpsecret = "";

	public DingdingInterfaceImpl(String corpid, String corpsecret) {
		this.corpid = corpid;
		this.corpsecret = corpsecret;
		accessToken();
	}

	@Override
	public String accessToken() {
		String accessToken = ACCESS_TOKEN;
		boolean flag = false;
		if (!StringUtil.isEmpty(ACCESS_TOKEN)) {
			if (System.currentTimeMillis() > (ACCESS_TOKEN_GET_TIME + INACTIVE_TIME)) {
				flag = true;
			}
		} else {
			flag = true;
		}

		if (flag) {
			String json = HttpUtil.sendGet(DingdingUri.GETTOKEN + "?corpid=" + corpid + "&corpsecret=" + corpsecret);
			if (!StringUtil.isEmpty(json)) {
				ACCESS_TOKEN = JSON.parseObject(json).getString("access_token");
				ACCESS_TOKEN_GET_TIME = System.currentTimeMillis();
				System.out.println("Send access_token ok : " + ACCESS_TOKEN);
			}
		}
		return accessToken;
	}

	@Override
	public List<Department> departmentList(String parentId) {
		DingTalkClient client = new DefaultDingTalkClient(DingdingUri.DEPARTMENT_LIST);
		OapiDepartmentListRequest req = new OapiDepartmentListRequest();
		req.setId(parentId);
		req.setHttpMethod("GET");
		OapiDepartmentListResponse idsResponse = null;
		try {
			idsResponse = client.execute(req, ACCESS_TOKEN);
		} catch (ApiException e) {
			e.printStackTrace();
		}
		return idsResponse.getDepartment();
	}

	@Override
	public List<Userlist> userList(Long departmentId) {
		DingTalkClient client = new DefaultDingTalkClient(DingdingUri.USER_LIST);
		OapiUserListRequest req = new OapiUserListRequest();
		req.setDepartmentId(departmentId);
		req.setOffset(0L);
		req.setSize(100L);
		req.setHttpMethod("GET");
		OapiUserListResponse res = null;
		try {
			res = client.execute(req, ACCESS_TOKEN);
		} catch (ApiException e) {
			e.printStackTrace();
		}
		return res.getUserlist();
	}

	@Override
	public OapiReportListResponse topapiReportList(String userId, Date start, Date end) {
		DingTalkClient client = new DefaultDingTalkClient(DingdingUri.TOPAPI_REPORT_LIST);
		OapiReportListRequest req = new OapiReportListRequest();
		req.setUserid(userId);
		req.setCursor(0L);
		req.setSize(100L);
		req.setStartTime(start.getTime());
		req.setEndTime(end.getTime());
		OapiReportListResponse res = null;
		try {
			res = client.execute(req, ACCESS_TOKEN);
		} catch (ApiException e) {
			e.printStackTrace();
		}
		return res;
	}

}
