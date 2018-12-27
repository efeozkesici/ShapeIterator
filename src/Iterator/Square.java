package Iterator;

import java.text.DecimalFormat;

public class Square implements Shape {

    //define variables
    private double x;
    private double y;
    private double width;

    @Override
    public double calculateArea() {
        return width * width;
    }

    @Override
    public double calculatePerimeter() {
        return width * 4;
    }

    //constructor
    public Square(double x, double y, double width) {
        this.x = x;
        this.y = y;
        this.width = width;
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

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", area=" + new DecimalFormat("##.##").format(calculateArea())  +
                ", perimeter=" +  new DecimalFormat("##.##").format(calculatePerimeter()) +
                '}';
    }
}
