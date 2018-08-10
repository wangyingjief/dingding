package com.dingtalk.api.request;

import com.taobao.api.internal.util.json.JSONValidatingReader;
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
import com.dingtalk.api.response.OapiMessageSendToConversationResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.message.send_to_conversation request
 * 
 * @author top auto create
 * @since 1.0, 2018.07.25
 */
public class OapiMessageSendToConversationRequest extends BaseDingTalkRequest<OapiMessageSendToConversationResponse> {
	
	

	/** 
	* ActionCard消息
	 */
	private String actionCard;

	/** 
	* 群消息或者个人聊天会话Id，(通过JSAPI之pickConversation接口唤起联系人界面选择之后即可拿到会话ID，之后您可以使用获取到的cid调用此接口）
	 */
	private String cid;

	/** 
	* file消息
	 */
	private String file;

	/** 
	* image消息
	 */
	private String image;

	/** 
	* link消息
	 */
	private String link;

	/** 
	* markdown消息
	 */
	private String markdown;

	/** 
	* text
	 */
	private String msgtype;

	/** 
	* OA消息
	 */
	private String oa;

	/** 
	* 消息发送者员工ID
	 */
	private String sender;

	/** 
	* text消息
	 */
	private String text;

	/** 
	* voice消息
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

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCid() {
		return this.cid;
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

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSender() {
		return this.sender;
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
		return "dingtalk.oapi.message.send_to_conversation";
	}

	public String getApiCallType() {
    	return DingTalkConstants.CALL_TYPE_OAPI;
    }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("action_card", this.actionCard);
		txtParams.put("cid", this.cid);
		txtParams.put("file", this.file);
		txtParams.put("image", this.image);
		txtParams.put("link", this.link);
		txtParams.put("markdown", this.markdown);
		txtParams.put("msgtype", this.msgtype);
		txtParams.put("oa", this.oa);
		txtParams.put("sender", this.sender);
		txtParams.put("text", this.text);
		txtParams.put("voice", this.voice);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiMessageSendToConversationResponse> getResponseClass() {
		return OapiMessageSendToConversationResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * markdown消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Markdown extends TaobaoObject {
		private static final long serialVersionUID = 4837613897964614433L;
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
	
	/**
	 * 11
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Form extends TaobaoObject {
		private static final long serialVersionUID = 7786451142788453843L;
		/**
		 * 1
		 */
		@ApiField("key")
		private String key;
		/**
		 * 1
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
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Rich extends TaobaoObject {
		private static final long serialVersionUID = 4516362327339991518L;
		/**
		 * 1
		 */
		@ApiField("num")
		private String num;
		/**
		 * 1
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
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Body extends TaobaoObject {
		private static final long serialVersionUID = 1794632926428136932L;
		/**
		 * 1
		 */
		@ApiField("author")
		private String author;
		/**
		 * 1
		 */
		@ApiField("content")
		private String content;
		/**
		 * 1
		 */
		@ApiField("file_count")
		private String fileCount;
		/**
		 * 11
		 */
		@ApiListField("form")
		@ApiField("form")
		private List<Form> form;
		/**
		 * 1
		 */
		@ApiField("image")
		private String image;
		/**
		 * 1
		 */
		@ApiField("rich")
		private Rich rich;
		/**
		 * 1
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
	 * 1
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Head extends TaobaoObject {
		private static final long serialVersionUID = 7187451361619874175L;
		/**
		 * 1
		 */
		@ApiField("bgcolor")
		private String bgcolor;
		/**
		 * 1
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
	 * OA消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Oa extends TaobaoObject {
		private static final long serialVersionUID = 7295688415584471986L;
		/**
		 * 1
		 */
		@ApiField("body")
		private Body body;
		/**
		 * 1
		 */
		@ApiField("head")
		private Head head;
		/**
		 * 客户端点击消息时跳转到的H5地址
		 */
		@ApiField("message_url")
		private String messageUrl;
		/**
		 * 1
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
		public void setMessageUrlString(String messageUrl) {
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
	 * voice消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Voice extends TaobaoObject {
		private static final long serialVersionUID = 4653567297659396958L;
		/**
		 * 语音时长
		 */
		@ApiField("duration")
		private Long duration;
		/**
		 * 语音媒体文件id，可以调用上传媒体文件接口获取。2MB，播放长度不超过60s，AMR格式
		 */
		@ApiField("media_id")
		private String mediaId;
	
		public Long getDuration() {
			return this.duration;
		}
		public void setDuration(Long duration) {
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
	 * file消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class File extends TaobaoObject {
		private static final long serialVersionUID = 3431172798143123321L;
		/**
		 * 媒体文件id，可以调用上传媒体文件接口获取。10MB
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
	 * link消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Link extends TaobaoObject {
		private static final long serialVersionUID = 3359653148836287633L;
		/**
		 * 消息点击链接地址
		 */
		@ApiField("messageUrl")
		private String messageUrl;
		/**
		 * 图片媒体文件id，可以调用上传媒体文件接口获取
		 */
		@ApiField("picUrl")
		private String picUrl;
		/**
		 * 消息描述
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
	 * image消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Image extends TaobaoObject {
		private static final long serialVersionUID = 6425483882497575249L;
		/**
		 * 图片媒体文件id，可以调用上传媒体文件接口获取。建议宽600像素 x 400像素，宽高比3：2
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
	 * text消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Text extends TaobaoObject {
		private static final long serialVersionUID = 7224139962663666258L;
		/**
		 * 消息内容
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
	 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class BtnJson extends TaobaoObject {
		private static final long serialVersionUID = 7826713219934826914L;
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
	 * ActionCard消息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class ActionCard extends TaobaoObject {
		private static final long serialVersionUID = 2432277249376398287L;
		/**
		 * 使用独立跳转ActionCard样式时的按钮列表；必须与btn_orientation同时设置
		 */
		@ApiField("btn_json_list")
		private BtnJson btnJsonList;
		/**
		 * 使用独立跳转ActionCard样式时的按钮排列方式，竖直排列(0)，横向排列(1)；必须与btn_json_list同时设置
		 */
		@ApiField("btn_orientation")
		private String btnOrientation;
		/**
		 * 消息内容，支持markdown，语法参考标准markdown语法。图片举例：![alt text](mediaId)
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
	
		public BtnJson getBtnJsonList() {
			return this.btnJsonList;
		}
		public void setBtnJsonList(BtnJson btnJsonList) {
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
	

}