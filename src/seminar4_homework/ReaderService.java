package seminar4_homework;

import java.io.File;
import java.util.Scanner;

public class ReaderService {
    Scanner sc = new Scanner(System.in);
    public String path = "C:/Users/Admin/Java_projects/GB_java_seminars/src/seminar4_homework";

    public void getChoice() {
        boolean repeatInput = true;
        while (repeatInput) {
            System.out.println("Import from: 1-XML, 2-CSV, 3-JSON");
            switch (sc.next()) {
                case ("1") -> {
                    ReaderFromXML();
                    repeatInput = false;
                }
                case ("2") -> {
                    ReaderFromCSV();
                    repeatInput = false;
                }
                case ("3") -> {
                    ReaderFromJSON();
                    repeatInput = false;
                }
                default -> System.out.println("Noup! That`s not correct! Try again");
            }
        }
    }

    public void ReaderFromXML() {
        path += ".xml";
        ReaderFromXML imp = new ReaderFromXML(new File(path));
    }

    public void ReaderFromCSV() {
        path += ".csv";
        ReaderFromCSV imp = new ReaderFromCSV(new File(path));
    }

    public void ReaderFromJSON() {
        path += ".json";
        ReaderFromJSON imp = new ReaderFromJSON(new File(path));
    }

}
