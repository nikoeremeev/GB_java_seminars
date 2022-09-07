package seminar5_homework;

import java.util.Date;

public abstract class Message {
    Date date;
    User user;
    String text;

    public Message(Date date, User user, String text){
        this.date = date;
        this.user = user;
        this.text = text;
    }
}
