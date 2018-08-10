package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.dingtalk.api.BaseDingTalkRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiAlitripBtripCostCenterEntitySetResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.cost.center.entity.set request
 * 
 * @author top auto create
 * @since 1.0, 2018.08.07
 */
public class OapiAlitripBtripCostCenterEntitySetRequest extends BaseDingTalkRequest<OapiAlitripBtripCostCenterEntitySetResponse> {
	
	

	/** 
	* 请求对象
	 */
	private String rq;

	public void setRq(String rq) {
		this.rq = rq;
	}

	public void setRq(OpenCostCenterSetEntityRq rq) {
		this.rq = new JSONWriter(false,false,true).write(rq);
	}

	public String getRq() {
		return this.rq;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.alitrip.btrip.cost.center.entity.set";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("rq", this.rq);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiAlitripBtripCostCenterEntitySetResponse> getResponseClass() {
		return OapiAlitripBtripCostCenterEntitySetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 人员信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenOrgEntityDo extends TaobaoObject {
		private static final long serialVersionUID = 1312272966472844763L;
		/**
		 * 员工/部门/角色id
		 */
		@ApiField("entity_id")
		private String entityId;
		/**
		 * 人员类型:1员工，2部门，3角色
		 */
		@ApiField("entity_type")
		private String entityType;
	
		public String getEntityId() {
			return this.entityId;
		}
		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}
		public String getEntityType() {
			return this.entityType;
		}
		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}
	}
	
	/**
	 * 请求对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterSetEntityRq extends TaobaoObject {
		private static final long serialVersionUID = 5739923218121361771L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 人员信息列表
		 */
		@ApiListField("entity_list")
		@ApiField("open_org_entity_do")
		private List<OpenOrgEntityDo> entityList;
		/**
		 * 第三方成本中心id
		 */
		@ApiField("thirdpart_id")
		private String thirdpartId;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public List<OpenOrgEntityDo> getEntityList() {
			return this.entityList;
		}
		public void setEntityList(List<OpenOrgEntityDo> entityList) {
			this.entityList = entityList;
		}
		public String getThirdpartId() {
			return this.thirdpartId;
		}
		public void setThirdpartId(String thirdpartId) {
			this.thirdpartId = thirdpartId;
		}
	}
	

}