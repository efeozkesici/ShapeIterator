package Iterator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calculateArea() {
        double width = 5;
        double height = 10;
        double realAnswer = width * height;

        Rectangle rectangle = new Rectangle(5,6,5,10);
        double answer = rectangle.calculateArea();

        Assert.assertTrue("Area", answer == realAnswer);
    }

    @Test
    public void calculatePerimeter() {
        double width = 5;
        double height = 10;
        double realAnswer = 2*(width + height);

        Rectangle rectangle = new Rectangle(5,6,5,10);
        double answer = rectangle.calculatePerimeter();

        Assert.assertTrue("Perimeter", answer == realAnswer);
    }


}