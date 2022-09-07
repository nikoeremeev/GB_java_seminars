package seminar5_homework;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.print("--------------------------------------------------------------\n");
        UserCategory h = new UserCategory("nick",20,"as@mail.ru",UserType.USER);
        System.out.print(h);
        System.out.print("--------------------------------------------------------------\n");
        UserMessage m = new UserMessage(1, new Date(),h,"TEXT");
        System.out.print(m);
        System.out.print("--------------------------------------------------------------\n");
        UsersList usersList = new UsersList();
        usersList.addUser(h);
        System.out.print("--------------------------------------------------------------\n");
    }

}
