package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
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
import com.dingtalk.api.response.OapiMessageCorpconversationAsyncsendV2Response;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.corpconversation.asyncsend_v2 request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMessageCorpconversationAsyncsendV2Request extends BaseDingTalkRequest<OapiMessageCorpconversationAsyncsendV2Response> {
	
	

	/** 
	* 微应用的id
	 */
	private Long agentId;

	/** 
	* 接收者的部门id列表
	 */
	private String deptIdList;

	/** 
	* 消息体，具体见文档
	 */
	private String msg;

	/** 
	* 是否发送给企业全部用户
	 */
	private Boolean toAllUser;

	/** 
	* 接收者的用户userid列表
	 */
	private String useridList;

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setDeptIdList(String deptIdList) {
		this.deptIdList = deptIdList;
	}

	public String getDeptIdList() {
		return this.deptIdList;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setMsg(Msg msg) {
		this.msg = new JSONWriter(false,false,true).write(msg);
	}

	public String getMsg() {
		return this.msg;
	}

	public void setToAllUser(Boolean toAllUser) {
		this.toAllUser = toAllUser;
	}

	public Boolean getToAllUser() {
		return this.toAllUser;
	}

	public void setUseridList(String useridList) {
		this.useridList = useridList;
	}

	public String getUseridList() {
		return this.useridList;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.message.corpconversation.asyncsend_v2";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agent_id", this.agentId);
		txtParams.put("dept_id_list", this.deptIdList);
		txtParams.put("msg", this.msg);
		txtParams.put("to_all_user", this.toAllUser);
		txtParams.put("userid_list", this.useridList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageCorpconversationAsyncsendV2Response> getResponseClass() {
		return OapiMessageCorpconversationAsyncsendV2Response.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentId, "agentId");
		RequestCheckUtils.checkMaxListSize(deptIdList, 500, "deptIdList");
		RequestCheckUtils.checkMaxListSize(useridList, 5000, "useridList");
	}
	
	/**
	 * 文本消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 8884751666751293198L;
		/**
		 * 文本消息
		 */
		@ApiField("content")
		private String content;
	
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
	}
	
	/**
	 * 图片消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Image extends TaobaoObject {
		private static final long serialVersionUID = 4585233595358411426L;
		/**
		 * 图片消息
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * 链接消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Link extends TaobaoObject {
		private static final long serialVersionUID = 1145175951797627992L;
		/**
		 * messageUrl
		 */
		@ApiField("messageUrl")
		private String messageUrl;
		/**
		 * picUrl
		 */
		@ApiField("picUrl")
		private String picUrl;
		/**
		 * text
		 */
		@ApiField("text")
		private String text;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
	
		public String getMessageUrl() {
			return this.messageUrl;
		}
		public void setMessageUrl(String messageUrl) {
			this.messageUrl = messageUrl;
		}
		public String getPicUrl() {
			return this.picUrl;
		}
		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * file
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 4767334848386576516L;
		/**
		 * media_id
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * 语音消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Voice extends TaobaoObject {
		private static final long serialVersionUID = 8811686359916749728L;
		/**
		 * duration
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * media_id
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public String getDuration() {
			return this.duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getMediaId() {
			return this.mediaId;
		}
		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}
	}
	
	/**
	 * rich
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Rich extends TaobaoObject {
		private static final long serialVersionUID = 8728352195733549686L;
		/**
		 * num
		 */
		@ApiField("num")
		private String num;
		/**
		 * unit
		 */
		@ApiField("unit")
		private String unit;
	
		public String getNum() {
			return this.num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * form
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Form extends TaobaoObject {
		private static final long serialVersionUID = 3413757968834598593L;
		/**
		 * key
		 */
		@ApiField("key")
		private String key;
		/**
		 * value
		 */
		@ApiField("value")
		private String value;
	
		public String getKey() {
			return this.key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return this.value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	/**
	 * body
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Body extends TaobaoObject {
		private static final long serialVersionUID = 3438656912336238955L;
		/**
		 * author
		 */
		@ApiField("author")
		private String author;
		/**
		 * content
		 */
		@ApiField("content")
		private String content;
		/**
		 * file_count
		 */
		@ApiField("file_count")
		private String fileCount;
		/**
		 * form
		 */
		@ApiListField("form")
		@ApiField("form")
		private List<Form> form;
		/**
		 * image
		 */
		@ApiField("image")
		private String image;
		/**
		 * rich
		 */
		@ApiField("rich")
		private Rich rich;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
	
		public String getAuthor() {
			return this.author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getFileCount() {
			return this.fileCount;
		}
		public void setFileCount(String fileCount) {
			this.fileCount = fileCount;
		}
		public List<Form> getForm() {
			return this.form;
		}
		public void setForm(List<Form> form) {
			this.form = form;
		}
		public String getImage() {
			return this.image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public Rich getRich() {
			return this.rich;
		}
		public void setRich(Rich rich) {
			this.rich = rich;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * head
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Head extends TaobaoObject {
		private static final long serialVersionUID = 6727284477979711246L;
		/**
		 * bgcolor
		 */
		@ApiField("bgcolor")
		private String bgcolor;
		/**
		 * text
		 */
		@ApiField("text")
		private String text;
	
		public String getBgcolor() {
			return this.bgcolor;
		}
		public void setBgcolor(String bgcolor) {
			this.bgcolor = bgcolor;
		}
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	
	/**
	 * oa
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OA extends TaobaoObject {
		private static final long serialVersionUID = 2881964591616313317L;
		/**
		 * body
		 */
		@ApiField("body")
		private Body body;
		/**
		 * head
		 */
		@ApiField("head")
		private Head head;
		/**
		 * message_url
		 */
		@ApiField("message_url")
		private String messageUrl;
		/**
		 * pc_message_url
		 */
		@ApiField("pc_message_url")
		private String pcMessageUrl;
	
		public Body getBody() {
			return this.body;
		}
		public void setBody(Body body) {
			this.body = body;
		}
		public Head getHead() {
			return this.head;
		}
		public void setHead(Head head) {
			this.head = head;
		}
		public String getMessageUrl() {
			return this.messageUrl;
		}
		public void setMessageUrl(String messageUrl) {
			this.messageUrl = messageUrl;
		}
		public String getPcMessageUrl() {
			return this.pcMessageUrl;
		}
		public void setPcMessageUrl(String pcMessageUrl) {
			this.pcMessageUrl = pcMessageUrl;
		}
	}
	
	/**
	 * markdown
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 2695481337976156464L;
		/**
		 * text
		 */
		@ApiField("text")
		private String text;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
	
		public String getText() {
			return this.text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * btn_json_list
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BtnJsonList extends TaobaoObject {
		private static final long serialVersionUID = 6531148685557985323L;
		/**
		 * action_url
		 */
		@ApiField("action_url")
		private String actionUrl;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
	
		public String getActionUrl() {
			return this.actionUrl;
		}
		public void setActionUrl(String actionUrl) {
			this.actionUrl = actionUrl;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * action_card
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActionCard extends TaobaoObject {
		private static final long serialVersionUID = 7352167167864395112L;
		/**
		 * btn_json_list
		 */
		@ApiListField("btn_json_list")
		@ApiField("btn_json_list")
		private List<BtnJsonList> btnJsonList;
		/**
		 * btn_orientation
		 */
		@ApiField("btn_orientation")
		private String btnOrientation;
		/**
		 * markdown
		 */
		@ApiField("markdown")
		private String markdown;
		/**
		 * single_title
		 */
		@ApiField("single_title")
		private String singleTitle;
		/**
		 * single_url
		 */
		@ApiField("single_url")
		private String singleUrl;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
	
		public List<BtnJsonList> getBtnJsonList() {
			return this.btnJsonList;
		}
		public void setBtnJsonList(List<BtnJsonList> btnJsonList) {
			this.btnJsonList = btnJsonList;
		}
		public String getBtnOrientation() {
			return this.btnOrientation;
		}
		public void setBtnOrientation(String btnOrientation) {
			this.btnOrientation = btnOrientation;
		}
		public String getMarkdown() {
			return this.markdown;
		}
		public void setMarkdown(String markdown) {
			this.markdown = markdown;
		}
		public String getSingleTitle() {
			return this.singleTitle;
		}
		public void setSingleTitle(String singleTitle) {
			this.singleTitle = singleTitle;
		}
		public String getSingleUrl() {
			return this.singleUrl;
		}
		public void setSingleUrl(String singleUrl) {
			this.singleUrl = singleUrl;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	}
	
	/**
	 * 消息体，具体见文档
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Msg extends TaobaoObject {
		private static final long serialVersionUID = 1848626886183241183L;
		/**
		 * action_card
		 */
		@ApiField("action_card")
		private ActionCard actionCard;
		/**
		 * file
		 */
		@ApiField("file")
		private File file;
		/**
		 * 图片消息
		 */
		@ApiField("image")
		private Image image;
		/**
		 * 链接消息
		 */
		@ApiField("link")
		private Link link;
		/**
		 * markdown
		 */
		@ApiField("markdown")
		private Markdown markdown;
		/**
		 * 消息类型
		 */
		@ApiField("msgtype")
		private String msgtype;
		/**
		 * oa
		 */
		@ApiField("oa")
		private OA oa;
		/**
		 * 文本消息
		 */
		@ApiField("text")
		private Text text;
		/**
		 * 语音消息
		 */
		@ApiField("voice")
		private Voice voice;
	
		public ActionCard getActionCard() {
			return this.actionCard;
		}
		public void setActionCard(ActionCard actionCard) {
			this.actionCard = actionCard;
		}
		public File getFile() {
			return this.file;
		}
		public void setFile(File file) {
			this.file = file;
		}
		public Image getImage() {
			return this.image;
		}
		public void setImage(Image image) {
			this.image = image;
		}
		public Link getLink() {
			return this.link;
		}
		public void setLink(Link link) {
			this.link = link;
		}
		public Markdown getMarkdown() {
			return this.markdown;
		}
		public void setMarkdown(Markdown markdown) {
			this.markdown = markdown;
		}
		public String getMsgtype() {
			return this.msgtype;
		}
		public void setMsgtype(String msgtype) {
			this.msgtype = msgtype;
		}
		public OA getOa() {
			return this.oa;
		}
		public void setOa(OA oa) {
			this.oa = oa;
		}
		public Text getText() {
			return this.text;
		}
		public void setText(Text text) {
			this.text = text;
		}
		public Voice getVoice() {
			return this.voice;
		}
		public void setVoice(Voice voice) {
			this.voice = voice;
		}
	}
	

}