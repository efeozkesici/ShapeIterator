package Iterator;

import java.text.DecimalFormat;

public class Circle implements Shape {

    //define variables
    private double x;
    private double y;
    private double radius;


    @Override
    public double calculateArea() {
        return (3.14*(radius*radius));
    }

    @Override
    public double calculatePerimeter() {
        return (2*(3.14*radius));
    }

    //constructor
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //getters&setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", area=" + new DecimalFormat("##.##").format(calculateArea())  +
                ", perimeter=" +  new DecimalFormat("##.##").format(calculatePerimeter()) +
                '}';
    }
}
