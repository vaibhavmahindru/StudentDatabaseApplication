package StudentDatababseApplication;

import java.util.*;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students to be added in the database");
        int n = in.nextInt();
        Student st = new Student(n);

        in.close();
    }
}