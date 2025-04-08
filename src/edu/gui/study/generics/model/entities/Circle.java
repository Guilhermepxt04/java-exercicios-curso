package edu.gui.study.generics.model.entities;

import edu.gui.study.generics.model.services.Shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(radius, 2));
    }
}
