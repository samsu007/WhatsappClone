package startup.com.whatsapp.Chat;

import java.io.Serializable;
import java.util.ArrayList;

import startup.com.whatsapp.UserObjects;

public class ChatObjects implements Serializable {
    private String chatId;
    private ArrayList<UserObjects> userObjectsArrayList = new ArrayList<>();

    public ChatObjects(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public ArrayList<UserObjects> getUserObjectsArrayList() {
        return userObjectsArrayList;
    }


    public void addUserToArrayList(UserObjects mUser) {
        userObjectsArrayList.add(mUser);
    }
}
