package seminar5_homework;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.print("--------------------------------------------------------------\n");
        UserCategory h = new UserCategory("nick",20,"as@mail.ru",UserType.USER);
        UserCategory h1 = new UserCategory("John",10,"ad@mail.ru",UserType.ADMIN);
        UserCategory h2 = new UserCategory("Boris",20,"da@mail.ru",UserType.GUEST);
        UserCategory h3 = new UserCategory("Ivan",30,"sf@mail.ru",UserType.MODERATOR);
        System.out.print(h);
        System.out.print("--------------------------------------------------------------\n");
        UserMessage m = new UserMessage(1, new Date(),h,"TEXT");
        System.out.print(m);
        System.out.print("--------------------------------------------------------------\n");
        UsersList usersList = new UsersList();
        usersList.addUser(h);
        usersList.addUser(h1);
        usersList.addUser(h2);
        usersList.addUser(h3);
        usersList.printUsersList();
        System.out.print("--------------------------------------------------------------\n");
    }

}
