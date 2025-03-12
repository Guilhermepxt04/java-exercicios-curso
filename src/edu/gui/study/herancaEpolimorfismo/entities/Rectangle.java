package edu.gui.study.herancaEpolimorfismo.entities;

import edu.gui.study.herancaEpolimorfismo.entities.enums.Color;

public final class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public final Double area() {
        return width * height;
    }
}
