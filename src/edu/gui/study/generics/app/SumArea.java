package edu.gui.study.generics.app;


import edu.gui.study.generics.model.entities.Circle;
import edu.gui.study.generics.model.entities.Rectangle;
import edu.gui.study.generics.model.services.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SumArea {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static String totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return String.format("%.2f", sum);
    }

}
