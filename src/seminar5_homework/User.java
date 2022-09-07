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

    public  String getNickName(User user) {
        return user.nickName;
    }

    public  String getEmailAddress(User user) {
        return user.emailAddress;
    }

    public  Integer getUserAge(User user) {
        return user.age;
    }


}
