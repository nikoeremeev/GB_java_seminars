package seminar4_homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AddTask {
    Scanner sc = new Scanner(System.in);

    public void addTask() {
        boolean repeatInput = true;
        String author;
        String description = new String();
        String priority = new String();
        LocalDate deadline = LocalDate.now();
        while (repeatInput) {
            System.out.println("Input deadline date (YYYY-MM-DD):");
            try {
                deadline = LocalDate.parse(sc.nextLine());
                repeatInput = false;
            } catch (Exception ex) {
                System.out.println("Invalid date!!!");
            }
        }
        System.out.println("Input author of the task");
        author = sc.nextLine();
        System.out.println("Input description of the task");
        description = sc.nextLine();
        System.out.println("Input priority of the task");
        priority = sc.nextLine();
        TaskPriority taskPriority = TaskPriority.valueOf(priority);
        String time = String.valueOf(LocalTime.now().getHour()) + ":" + String.valueOf(LocalTime.now().getMinute());
        TaskList.add(new Task(LocalDate.now(), LocalTime.parse(time), deadline, author, description, taskPriority));

    }

}
