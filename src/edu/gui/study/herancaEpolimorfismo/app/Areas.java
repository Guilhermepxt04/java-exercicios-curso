package edu.gui.study.herancaEpolimorfismo.app;

import edu.gui.study.herancaEpolimorfismo.entities.Circle;
import edu.gui.study.herancaEpolimorfismo.entities.enums.Color;
import edu.gui.study.herancaEpolimorfismo.entities.Rectangle;
import edu.gui.study.herancaEpolimorfismo.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Areas {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        List<Shape> areas = new ArrayList<>();
        Shape figure;

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.printf("Shape #%d data: %n", i + 1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            Color color = Color.valueOf(sc.nextLine());

            switch (shape) {

                case 'r':
                    System.out.print("Width: ");
                    Double width = sc.nextDouble();
                    System.out.print("Height: ");
                    Double height = sc.nextDouble();
                    figure = new Rectangle(width, height, color);
                    areas.add(figure);
                    break;
                case 'c':
                    System.out.print("Radius: ");
                    Double radius = sc.nextDouble();
                    figure = new Circle(radius, color);
                    areas.add(figure);
            }
        }

        System.out.println("SHAPE AREAS: ");

        for (Shape shape : areas) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
