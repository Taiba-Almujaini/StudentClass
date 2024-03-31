import object.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String sName = scanner.nextLine();

        System.out.print("Enter student age: ");
        int sAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student grade: ");
        String sGrade = scanner.nextLine();

        Student student = new Student(sName, sAge, sGrade);

        System.out.println("\nStudent's Information:");
        student.displayInformation();
    }
}