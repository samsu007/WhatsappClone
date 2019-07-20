package startup.com.whatsapp.Chat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MessageObjects {
    String messageId, senderId,message;

    ArrayList<String> mediaUrlList;

    public MessageObjects(String messageId, String senderId, String message, ArrayList<String> mediaUrlList) {
        this.messageId = messageId;
        this.senderId = senderId;;
        this.message = message;
        this.mediaUrlList = mediaUrlList;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getMediaUrlist() { return mediaUrlList; }
}
