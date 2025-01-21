package entities;

public class Rectangle {

    public double width;
    public double height;

    public double Area() {

        return width * height;

    }

    public double Perimeter() {

        return width + height;

    }

    public double diagonal() {

        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

    }

}
