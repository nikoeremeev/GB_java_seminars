package seminar5_homework;

public class UserCategory extends User {
    protected UserType userType;

    public UserCategory(String nickName, Integer age, String emailAddress, UserType userType) {
        super(nickName, age, emailAddress);
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getUserNickName(UserCategory userCategory){
        return getNickName(userCategory);
    }

}
