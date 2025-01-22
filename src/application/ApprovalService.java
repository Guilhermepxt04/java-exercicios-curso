package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;


public class ApprovalService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student student;
        student = new Student();

        System.out.println("Enter student grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        if (student.finalGrade() >= 60 ) {

            System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
            System.out.println("PASS");

        }
        else {

            System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
            System.out.printf("GRADE NECESSARY: %.2f", 60 - student.finalGrade());

        }

    }

}
