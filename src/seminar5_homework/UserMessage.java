package seminar5_homework;

import java.util.Date;

public class UserMessage extends Message{

    private Integer messageID;

    public UserMessage(Integer messageID, Date date, UserCategory user, String text) {
        super(date, user, text);
        this.messageID = messageID;
    }

    public Integer getMessageID() {
        return messageID;
    }

    @Override
    public String toString() {
        return "Message ID: " + getMessageID()+ ";\n" +
                user +
                "User message text is:" + text + "\n";
    }
}
