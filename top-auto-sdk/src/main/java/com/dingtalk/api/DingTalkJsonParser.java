package com.dingtalk.api;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoParser;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.Converter;
import com.taobao.api.internal.parser.json.JsonConverter;
import com.taobao.api.internal.parser.json.SimplifyJsonConverter;

/**
 * 钉钉OAPI - 单个JSON对象解释器
 * @param <T>
 * @author xiaoxuan.lp
 */
public class DingTalkJsonParser<T extends TaobaoResponse> implements TaobaoParser<T> {

	private Class<T> clazz;

	public DingTalkJsonParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T parse(String rsp) throws ApiException {
		Converter converter = new DingTalkJsonConverter();
		return converter.toResponse(rsp, clazz);
	}

	public Class<T> getResponseClass() {
		return clazz;
	}

}
