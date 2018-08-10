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
import com.dingtalk.api.response.OapiChatSendResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.chat.send request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiChatSendRequest extends BaseDingTalkRequest<OapiChatSendResponse> {
	
	

	/** 
	* actionCard消息
	 */
	private String actionCard;

	/** 
	* 群会话id
	 */
	private String chatid;

	/** 
	* 文件消息
	 */
	private String file;

	/** 
	* 图片消息
	 */
	private String image;

	/** 
	* 链接消息
	 */
	private String link;

	/** 
	* markdown消息
	 */
	private String markdown;

	/** 
	* 消息类型
	 */
	private String msgtype;

	/** 
	* OA消息
	 */
	private String oa;

	/** 
	* 文本消息
	 */
	private String text;

	/** 
	* 语音消息
	 */
	private String voice;

	public void setActionCard(String actionCard) {
		this.actionCard = actionCard;
	}

	public void setActionCard(ActionCard actionCard) {
		this.actionCard = new JSONWriter(false,false,true).write(actionCard);
	}

	public String getActionCard() {
		return this.actionCard;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getChatid() {
		return this.chatid;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setFile(File file) {
		this.file = new JSONWriter(false,false,true).write(file);
	}

	public String getFile() {
		return this.file;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setImage(Image image) {
		this.image = new JSONWriter(false,false,true).write(image);
	}

	public String getImage() {
		return this.image;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setLink(Link link) {
		this.link = new JSONWriter(false,false,true).write(link);
	}

	public String getLink() {
		return this.link;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

	public void setMarkdown(Markdown markdown) {
		this.markdown = new JSONWriter(false,false,true).write(markdown);
	}

	public String getMarkdown() {
		return this.markdown;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgtype() {
		return this.msgtype;
	}

	public void setOa(String oa) {
		this.oa = oa;
	}

	public void setOa(Oa oa) {
		this.oa = new JSONWriter(false,false,true).write(oa);
	}

	public String getOa() {
		return this.oa;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setText(Text text) {
		this.text = new JSONWriter(false,false,true).write(text);
	}

	public String getText() {
		return this.text;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public void setVoice(Voice voice) {
		this.voice = new JSONWriter(false,false,true).write(voice);
	}

	public String getVoice() {
		return this.voice;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.chat.send";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("action_card", this.actionCard);
		txtParams.put("chatid", this.chatid);
		txtParams.put("file", this.file);
		txtParams.put("image", this.image);
		txtParams.put("link", this.link);
		txtParams.put("markdown", this.markdown);
		txtParams.put("msgtype", this.msgtype);
		txtParams.put("oa", this.oa);
		txtParams.put("text", this.text);
		txtParams.put("voice", this.voice);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiChatSendResponse> getResponseClass() {
		return OapiChatSendResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BtnJson extends TaobaoObject {
		private static final long serialVersionUID = 4312829211438586643L;
		/**
		 * 使用独立跳转ActionCard样式时的按钮的链接url
		 */
		@ApiField("action_url")
		private String actionUrl;
		/**
		 * 使用独立跳转ActionCard样式时的按钮的标题
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
	 * actionCard消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActionCard extends TaobaoObject {
		private static final long serialVersionUID = 5186154946832365691L;
		/**
		 * 可选，微应用agentid。默认在角标处显示企业的名称和图标，如果传入agentid则在角标处显示微应用的名称和图标
		 */
		@ApiField("agentid")
		private String agentid;
		/**
		 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
		 */
		@ApiListField("btn_json_list")
		@ApiField("btn_json")
		private List<BtnJson> btnJsonList;
		/**
		 * 使用独立跳转ActionCard样式时的按钮排列方式，竖直排列(0)，横向排列(1)；必须与btn_json_list同时设置
		 */
		@ApiField("btn_orientation")
		private String btnOrientation;
		/**
		 * 消息内容
		 */
		@ApiField("markdown")
		private String markdown;
		/**
		 * 使用整体跳转ActionCard样式时的标题，必须与single_url同时设置
		 */
		@ApiField("single_title")
		private String singleTitle;
		/**
		 * 使用整体跳转ActionCard样式时的链接url，必须与single_title同时设置
		 */
		@ApiField("single_url")
		private String singleUrl;
		/**
		 * 透出到会话列表和通知的文案
		 */
		@ApiField("title")
		private String title;
	
		public String getAgentid() {
			return this.agentid;
		}
		public void setAgentid(String agentid) {
			this.agentid = agentid;
		}
		public List<BtnJson> getBtnJsonList() {
			return this.btnJsonList;
		}
		public void setBtnJsonList(List<BtnJson> btnJsonList) {
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
	 * 消息头部
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Head extends TaobaoObject {
		private static final long serialVersionUID = 5563757695618398659L;
		/**
		 * 消息头部背景颜色
		 */
		@ApiField("bgcolor")
		private String bgcolor;
		/**
		 * 消息头部标题
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
	 * 单行富文本信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Rich extends TaobaoObject {
		private static final long serialVersionUID = 6628866127771972588L;
		/**
		 * 单行富文本信息的单位
		 */
		@ApiField("num")
		private String num;
		/**
		 * 单行富文本信息的数目
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
	 * 消息体的表单，最多显示6个，超过会被隐藏
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Form extends TaobaoObject {
		private static final long serialVersionUID = 1232269263499499986L;
		/**
		 * 消息体的关键字
		 */
		@ApiField("key")
		private String key;
		/**
		 * 消息体的关键字对应的值
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
	 * 消息体
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Body extends TaobaoObject {
		private static final long serialVersionUID = 7756675393277333913L;
		/**
		 * 自定义的作者名字
		 */
		@ApiField("author")
		private String author;
		/**
		 * 消息体的内容，最多显示3行
		 */
		@ApiField("content")
		private String content;
		/**
		 * 自定义的附件数目。此数字仅供显示，钉钉不作验证
		 */
		@ApiField("file_count")
		private String fileCount;
		/**
		 * 消息体的表单，最多显示6个，超过会被隐藏
		 */
		@ApiListField("form")
		@ApiField("form")
		private List<Form> form;
		/**
		 * 消息体中的图片media_id
		 */
		@ApiField("image")
		private String image;
		/**
		 * 单行富文本信息
		 */
		@ApiField("rich")
		private Rich rich;
		/**
		 * 消息体的标题
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
	 * OA消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Oa extends TaobaoObject {
		private static final long serialVersionUID = 4466659873613969117L;
		/**
		 * 消息体
		 */
		@ApiField("body")
		private Body body;
		/**
		 * 消息头部
		 */
		@ApiField("head")
		private Head head;
		/**
		 * 消息链接
		 */
		@ApiField("message_url")
		private String messageUrl;
		/**
		 * pc端消息链接
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
	 * 语音消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Voice extends TaobaoObject {
		private static final long serialVersionUID = 5353412763263785756L;
		/**
		 * 时长
		 */
		@ApiField("duration")
		private String duration;
		/**
		 * 语音mediaId
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
	 * 文件消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 1691499299169837376L;
		/**
		 * 文件mediaId
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
	 * 图片消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Image extends TaobaoObject {
		private static final long serialVersionUID = 6396331561515127473L;
		/**
		 * 图片mediaId
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
		private static final long serialVersionUID = 8483941666126413624L;
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
		 * 消息文本
		 */
		@ApiField("text")
		private String text;
		/**
		 * 消息标题
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
	 * 文本消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 2654456161748378975L;
		/**
		 * 文本消息内容
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
	 * markdown消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 4478152494885869454L;
		/**
		 * markdown格式的消息
		 */
		@ApiField("text")
		private String text;
		/**
		 * 首屏会话透出的展示内容
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
	

}