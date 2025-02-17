package edu.gui.study.arrays.entities;

public class Person {

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", height=" + String.format("%.2f", height) + "}";
    }
}
