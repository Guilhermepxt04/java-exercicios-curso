package edu.gui.study.herancaEpolimorfismo.entities;

import edu.gui.study.herancaEpolimorfismo.entities.enums.Color;

public abstract class Shape {

    protected Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public abstract Double area();

}
