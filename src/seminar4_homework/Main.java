package seminar4_homework;

import java.io.File;
import java.util.Scanner;

public class Main {
    public String path = "C:/Users/Admin/Java_projects/GB_java_seminars/src/seminar4_homework";
    Scanner sc = new Scanner(System.in);

    public void exportToXML() {
        path += ".xml";
        WriteToXML exp = new WriteToXML(new File(path));
    }

    public void exportToCSV() {
        path += ".csv";
        WriteToCSV exp = new WriteToCSV(new File(path));
    }

    public void exportToJSON() {
        path += ".json";
        WriteToJSON exp = new WriteToJSON(new File(path));
    }
}
