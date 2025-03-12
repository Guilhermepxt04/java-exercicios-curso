package edu.gui.study.herancaEpolimorfismo.entities;

import edu.gui.study.herancaEpolimorfismo.entities.enums.Color;

public final class Circle extends Shape{

    private Double radius;

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public final Double area() {
        return 3.14 * Math.pow(radius, 2);
    }
}
