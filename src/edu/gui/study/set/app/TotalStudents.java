package edu.gui.study.set.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TotalStudents {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> totalStudents = new HashSet<>();
        char[] courses = new char[]{'A', 'B', 'C'};

        for (char c: courses) {

            System.out.printf("How many students for course %c?", c);
            int quantityStudent = sc.nextInt();

            for (int i = 0; i < quantityStudent; i++) {

                int idStudent = sc.nextInt();
                totalStudents.add(idStudent);

            }
        }
        System.out.println("Total studentes: " + totalStudents.size());

    }
}
