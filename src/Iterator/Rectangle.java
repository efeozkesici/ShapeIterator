package Iterator;

import java.text.DecimalFormat;

public class Rectangle implements Shape {

    //define variables
    private double x;
    private double y;
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    //constructor
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", area=" + new DecimalFormat("##.##").format(calculateArea())  +
                ", perimeter=" +  new DecimalFormat("##.##").format(calculatePerimeter()) +
                '}';
    }
}
