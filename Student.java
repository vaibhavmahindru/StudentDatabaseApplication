package StudentDatababseApplication;

import java.util.*;

public class Student {
    private String fName;
    private String lName;
    private int year;
    private String stuId;
    private String courses = "";
    private int balance;
    private static int id = 1000;
    private static int fee = 500;

    Scanner in = new Scanner(System.in);

    public Student(int n) {
        for (int i = 0; i < n; i++) {
            setNameAndYear();
            this.stuId = setId();
            enroll();
            showInfo();
        }

    }

    private void setNameAndYear() {
        System.out.print("enter the first name: ");
        this.fName = in.nextLine();

        System.out.print("enter the last name: ");
        this.lName = in.nextLine();

        System.out.print("enter the year: ");
        this.year = in.nextInt();
        in.nextLine();

    }

    private String setId() {
        id++;
        return year + "" + id;
    }

    private void showInfo() {
        System.out.print("NAME: " + fName + " " + lName + "\nYEAR: " + year + "\nID: " + stuId + "\nCOURSES ENROLLED: "
                + courses + "\nBALANCE: " + balance);
    }

    public void enroll() {
        int x;
        do {
            System.out.println(
                    "Enter the course you want to enroll in:-\n1 for HISTORY\n2 for COMPUTER SCIENCE\n3 for PSYCHOLOGY\n0 to QUIT");
            x = in.nextInt();
            switch (x) {
                case 1:
                    courses += "\nHISTORY";
                    balance += fee;
                    break;
                case 2:
                    courses += "\nCOMPUTER SCIENCE";
                    balance += fee;
                    break;
                case 3:
                    courses += "\nPSYCHOLOGY";
                    balance += fee;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("INVALID:- Choose again");
            }
        } while (x != 0);
        System.out.println("Courses enrolled in:-\n" + courses);
        System.out.println("Balance: " + balance);
    }

    public void account() {
        System.out.println("Enter your option:-\n1 View Balance\n2 Pay");
        int x = in.nextInt();
        switch (x) {
            case 1:
                System.out.println(balance);

            case 2:
                System.out.println("Amount :");
                int pay = in.nextInt();
                balance -= pay;
                System.out.println("Remaining balance: " + balance);
                break;
        }
    }

}