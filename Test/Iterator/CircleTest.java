package Iterator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateArea() {
        double radius = 5;
        double realAnswer = (radius * radius) * 3.14;

        Circle circle = new Circle(3,4,5);
        double answer = circle.calculateArea();

        Assert.assertTrue("Area", answer == realAnswer);
    }

    @Test
    public void calculatePerimeter() {
        double radius = 5;
        double realAnswer = 2*(radius*3.14);

        Circle circle = new Circle(3,4,5);
        double answer = circle.calculatePerimeter();

        Assert.assertTrue("Perimeter", answer == realAnswer);
    }
}