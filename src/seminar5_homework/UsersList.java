package seminar5_homework;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    private static List<UserCategory> userList= new ArrayList<>();

    public void addUser(UserCategory user){
        userList.add(user);
        System.out.println("User "+user.getNickName()+" successfully added;\n");
    }

    public static UserCategory getUser(String userNickname) {
        UserCategory temp = new UserCategory("NULL",0,"noEmail", UserType.USER);
        for (UserCategory item : userList) {
            if (item.getNickName().equals(userNickname)) {
                temp = item;
            }
        }
        return temp;
    }
    public void printUsersList() {
        System.out.println("User nickname" +"  |  "+ "User age" +"  |  "+ "User e-mail" +"  |  "+  "User type");
        for (UserCategory item : userList) {
            System.out.println("        "+item.getNickName()+"   |   "+item.getUserAge()+"   |   "+item.getEmailAddress()+"   |   "+item.getUserType()+"\n");

        }
    }
}
