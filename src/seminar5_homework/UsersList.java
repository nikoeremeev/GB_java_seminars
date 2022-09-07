package seminar5_homework;

import java.util.ArrayList;

public class UsersList {
    private ArrayList<UserCategory> userList= new ArrayList<>();

    public void addUser(UserCategory user){
        userList.add(user);
        System.out.println("User "+user.getNickName()+" successfully added;\n");
    }
}
