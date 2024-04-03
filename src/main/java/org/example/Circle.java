package org.example;

public class Circle extends Shape {

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle (){
    }

    double radius = 1.0;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
