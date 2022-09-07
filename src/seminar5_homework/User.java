package seminar5_homework;

public abstract class User {
    protected static String nickName;
    protected static Integer age;
    protected static String emailAddress;

    public User(String nickName, Integer age, String emailAddress) {
        User.nickName = nickName;
        User.age = age;
        User.emailAddress = emailAddress;
    }

    public static String getNickName(String userNickName) {
        return nickName;
    }

    public static String getEmailAddress(String userEmailAddress) {
        return emailAddress;
    }

    public static Integer getUserAge(Integer userAge) {
        return age;
    }

}
