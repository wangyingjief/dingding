package com.qimencloud.api;

import com.taobao.api.ApiException;

public interface QimenCloudClient {
	
	/**
	 * 执行API请求。
	 * 
	 * @param <T> 具体的API响应类
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	<T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request) throws ApiException;
	
	/**
	 * 
	 * @param request
	 * @param session
	 * @return
	 * @throws ApiException
	 */
	<T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request, String session) throws ApiException;
	
	/**
	 * 执行API请求。
	 * 
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	QimenCloudResponse execute(QimenCloudRequest request) throws ApiException;

    /**
     * 执行隐私API请求。
     * @param request 具体的API请求类
     * @param session 用户授权码
     * @return 具体的API响应
     * @throws ApiException
     */
    QimenCloudResponse execute(QimenCloudRequest request, String session) throws ApiException;
}
