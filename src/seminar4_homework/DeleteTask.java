package seminar4_homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DeleteTask {
        Scanner sc = new Scanner(System.in);

        private void DeleteTask() {
            boolean repeatInput = true;
            int id = -1;
            while (repeatInput) {
                System.out.println("Input ID of the task you wont to remove: ");
                try {
                    id = sc.nextInt();
                    if (TaskList.getTaskById(id) != -1) {
                        repeatInput = false;
                        TaskList.removeById(id);
                    } else {
                        System.out.println("Invalid ID");
                    }
                } catch (Exception ex) {
                    System.out.println("Invalid ID");
                }

            }
        }


}
