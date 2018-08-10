package com.dingtalk.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.dingtalk.api.DingTalkResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.alitrip.btrip.flight.order.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiAlitripBtripFlightOrderSearchResponse extends DingTalkResponse {

	private static final long serialVersionUID = 2187685331766375284L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 机票列表
	 */
	@ApiListField("flight_order_list")
	@ApiField("open_flight_order_rs")
	private List<OpenFlightOrderRs> flightOrderList;

	/** 
	 * 成功标识
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setFlightOrderList(List<OpenFlightOrderRs> flightOrderList) {
		this.flightOrderList = flightOrderList;
	}
	public List<OpenFlightOrderRs> getFlightOrderList( ) {
		return this.flightOrderList;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 发票信息对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenInvoiceDo extends TaobaoObject {
		private static final long serialVersionUID = 6578114139665638154L;
		/**
		 * 商旅发票id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 发票抬头
		 */
		@ApiField("title")
		private String title;
	
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 成本中心对象
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenCostCenterDo extends TaobaoObject {
		private static final long serialVersionUID = 7186231169457285285L;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 商旅成本中心id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 成本中心名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 成本中心编号
		 */
		@ApiField("number")
		private String number;
	
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
	}
	
	/**
	 * 价目信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenPriceInfo extends TaobaoObject {
		private static final long serialVersionUID = 3654435396799655217L;
		/**
		 * 交易类目
		 */
		@ApiField("category")
		private String category;
		/**
		 * 结算方式:1：个人现付，2:企业现付,4:企业月结，8、企业预存
		 */
		@ApiField("pay_type")
		private Long payType;
		/**
		 * 价格
		 */
		@ApiField("price")
		private String price;
		/**
		 * 资金流向:1:支出，2:收入
		 */
		@ApiField("type")
		private Long type;
	
		public String getCategory() {
			return this.category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public Long getPayType() {
			return this.payType;
		}
		public void setPayType(Long payType) {
			this.payType = payType;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	
	/**
	 * 保险信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFlightInsureInfo extends TaobaoObject {
		private static final long serialVersionUID = 6393882517239266734L;
		/**
		 * 保单号
		 */
		@ApiField("insure_no")
		private String insureNo;
		/**
		 * 乘机人(保险人)姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 状态：1已出保 2已退保
		 */
		@ApiField("status")
		private Long status;
	
		public String getInsureNo() {
			return this.insureNo;
		}
		public void setInsureNo(String insureNo) {
			this.insureNo = insureNo;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
	}
	
	/**
	 * 机票列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenFlightOrderRs extends TaobaoObject {
		private static final long serialVersionUID = 1338166567999256336L;
		/**
		 * 商旅申请单id
		 */
		@ApiField("apply_id")
		private String applyId;
		/**
		 * 到达机场
		 */
		@ApiField("arr_airport")
		private String arrAirport;
		/**
		 * 到达城市
		 */
		@ApiField("arr_city")
		private String arrCity;
		/**
		 * 舱位类型
		 */
		@ApiField("cabin_class")
		private String cabinClass;
		/**
		 * 联系人
		 */
		@ApiField("contact_name")
		private String contactName;
		/**
		 * 企业名称
		 */
		@ApiField("corp_name")
		private String corpName;
		/**
		 * 企业id
		 */
		@ApiField("corpid")
		private String corpid;
		/**
		 * 成本中心对象
		 */
		@ApiField("cost_center")
		private OpenCostCenterDo costCenter;
		/**
		 * 出发机场
		 */
		@ApiField("dep_airport")
		private String depAirport;
		/**
		 * 出发城市
		 */
		@ApiField("dep_city")
		private String depCity;
		/**
		 * 出发日期
		 */
		@ApiField("dep_date")
		private Date depDate;
		/**
		 * 部门名称
		 */
		@ApiField("dept_name")
		private String deptName;
		/**
		 * 部门id
		 */
		@ApiField("deptid")
		private String deptid;
		/**
		 * 折扣
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * 航班号
		 */
		@ApiField("flight_no")
		private String flightNo;
		/**
		 * 创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 更新时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 机票订单id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 保险信息
		 */
		@ApiListField("insureInfo_list")
		@ApiField("open_flight_insure_info")
		private List<OpenFlightInsureInfo> insureInfoList;
		/**
		 * 发票信息对象
		 */
		@ApiField("invoice")
		private OpenInvoiceDo invoice;
		/**
		 * 乘机人数量
		 */
		@ApiField("passenger_count")
		private Long passengerCount;
		/**
		 * 乘机人，多个用‘,’分割
		 */
		@ApiField("passenger_name")
		private String passengerName;
		/**
		 * 价目信息
		 */
		@ApiListField("price_info_list")
		@ApiField("open_price_info")
		private List<OpenPriceInfo> priceInfoList;
		/**
		 * 到达日期
		 */
		@ApiField("ret_date")
		private Date retDate;
		/**
		 * 订单状态：0待支付,1出票中,2已关闭,3有改签单,4有退票单,5出票成功,6退票申请中,7改签申请中
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 行程类型。0:单程，1:往返，2:中转
		 */
		@ApiField("trip_type")
		private Long tripType;
		/**
		 * 用户名称
		 */
		@ApiField("user_name")
		private String userName;
		/**
		 * 用户id
		 */
		@ApiField("userid")
		private String userid;
	
		public String getApplyId() {
			return this.applyId;
		}
		public void setApplyId(String applyId) {
			this.applyId = applyId;
		}
		public String getArrAirport() {
			return this.arrAirport;
		}
		public void setArrAirport(String arrAirport) {
			this.arrAirport = arrAirport;
		}
		public String getArrCity() {
			return this.arrCity;
		}
		public void setArrCity(String arrCity) {
			this.arrCity = arrCity;
		}
		public String getCabinClass() {
			return this.cabinClass;
		}
		public void setCabinClass(String cabinClass) {
			this.cabinClass = cabinClass;
		}
		public String getContactName() {
			return this.contactName;
		}
		public void setContactName(String contactName) {
			this.contactName = contactName;
		}
		public String getCorpName() {
			return this.corpName;
		}
		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}
		public String getCorpid() {
			return this.corpid;
		}
		public void setCorpid(String corpid) {
			this.corpid = corpid;
		}
		public OpenCostCenterDo getCostCenter() {
			return this.costCenter;
		}
		public void setCostCenter(OpenCostCenterDo costCenter) {
			this.costCenter = costCenter;
		}
		public String getDepAirport() {
			return this.depAirport;
		}
		public void setDepAirport(String depAirport) {
			this.depAirport = depAirport;
		}
		public String getDepCity() {
			return this.depCity;
		}
		public void setDepCity(String depCity) {
			this.depCity = depCity;
		}
		public Date getDepDate() {
			return this.depDate;
		}
		public void setDepDate(Date depDate) {
			this.depDate = depDate;
		}
		public String getDeptName() {
			return this.deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getDeptid() {
			return this.deptid;
		}
		public void setDeptid(String deptid) {
			this.deptid = deptid;
		}
		public String getDiscount() {
			return this.discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getFlightNo() {
			return this.flightNo;
		}
		public void setFlightNo(String flightNo) {
			this.flightNo = flightNo;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<OpenFlightInsureInfo> getInsureInfoList() {
			return this.insureInfoList;
		}
		public void setInsureInfoList(List<OpenFlightInsureInfo> insureInfoList) {
			this.insureInfoList = insureInfoList;
		}
		public OpenInvoiceDo getInvoice() {
			return this.invoice;
		}
		public void setInvoice(OpenInvoiceDo invoice) {
			this.invoice = invoice;
		}
		public Long getPassengerCount() {
			return this.passengerCount;
		}
		public void setPassengerCount(Long passengerCount) {
			this.passengerCount = passengerCount;
		}
		public String getPassengerName() {
			return this.passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public List<OpenPriceInfo> getPriceInfoList() {
			return this.priceInfoList;
		}
		public void setPriceInfoList(List<OpenPriceInfo> priceInfoList) {
			this.priceInfoList = priceInfoList;
		}
		public Date getRetDate() {
			return this.retDate;
		}
		public void setRetDate(Date retDate) {
			this.retDate = retDate;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getTripType() {
			return this.tripType;
		}
		public void setTripType(Long tripType) {
			this.tripType = tripType;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	


}
