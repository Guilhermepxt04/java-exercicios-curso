package edu.gui.study.arrays.app;

import edu.gui.study.arrays.entities.Person;
import java.util.Scanner;
import java.util.Locale;

public class MediumHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao digitadas?: ");
        int n = sc.nextInt();
        double averageHeight = 0;
        int underAge = 0;

        Person[] array = new Person[n];

        for (int i = 0; i < array.length; i++) {

            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            array[i] = new Person(name, age, height);

            averageHeight += height;

            if (age<16) {
                underAge += 1;
            }
        }

        averageHeight = averageHeight / n;
        double porcentageUnderAge = (double) (underAge * 100) / n;

        System.out.printf("Altura média: %.2f%n", averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f", porcentageUnderAge);
        System.out.println("%");

        for (Person person : array) {
            if (person.getAge()<16) {
                System.out.println(person.getName());
            }
        }


        sc.close();
    }
}
