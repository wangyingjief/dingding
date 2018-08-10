package com.dingtalk.api;

import com.taobao.api.ApiException;

/**
 * 钉钉客户端接口。
 * @author chaohui.zch 2016年11月8日下午2:16:43
 */
public interface DingTalkClient {

	/**
	 * 执行公开API请求。
	 * 
	 * @param <T> 具体的API响应类
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request) throws ApiException;

	/**
	 * 执行隐私API请求。
	 * 
	 * @param <T> 具体的API响应类
	 * @param request 具体的API请求类
	 * @param accessToken 用户授权码
	 * @return 具体的API响应
	 */
	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessToken) throws ApiException;

	/**
	 * 使用签名方式访问
	 * @param request
	 * @param accessKey
	 * @param accessSecret
	 * @param <T>
	 * @return
	 * @throws ApiException
	 */
	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessKey, String accessSecret) throws ApiException;
	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessKey, String accessSecret, String suiteTicket) throws ApiException;
	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String accessKey, String accessSecret, String suiteTicket, String corpId) throws ApiException;

}
