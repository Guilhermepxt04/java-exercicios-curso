package edu.gui.study.arrays.app;

import java.util.Scanner;
import edu.gui.study.arrays.entities.Student;

public class Pensionato {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Student[] array = new Student[10];
        Student student;
        String name;
        String email;
        int room;

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();

            student = new Student(name, email, room);

            array[room] = student;

        }

        System.out.println(" ");

        System.out.println("Busy rooms:");

        for (Student j : array) {

            if (j != null) {

                System.out.println(array[j.getRoom()]);

            }

        }

        sc.close();
    }
}
