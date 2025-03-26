package edu.gui.study.interfaces.model.entities;

public class Vehicle {

    private String model;

    public Vehicle() {

    }

    public Vehicle(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "model= " + model;
    }
}
