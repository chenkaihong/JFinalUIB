package little.ant.weixin.bo.message;

/**
 * 回复语音消息
 * @author 董华健
 */
public class ResponseMsgVoice extends ResponseMsgBase{
	
	private String MediaId;	 //是	 通过上传多媒体文件，得到的id

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
