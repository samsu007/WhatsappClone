package startup.com.whatsapp;

import java.io.Serializable;

public class UserObjects implements Serializable {
    private String uid,
                   name,
                   phone,
                    notificationKey;

    public UserObjects(String uid) {

        this.uid = uid;

    }


    public UserObjects(String uid,String name,String phone) {
        this.name = name;
        this.phone = phone;
        this.uid = uid;

    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getUid() {
        return uid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNotificationKey() {
        return notificationKey;
    }

    public void setNotificationKey(String notificationKey) {
        this.notificationKey = notificationKey;
    }
}
