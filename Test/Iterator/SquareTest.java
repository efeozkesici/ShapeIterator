package Iterator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateArea() {
        double width = 5;
        double realAnswer = width * width;

        Square square = new Square(3,4,5);
        double answer = square.calculateArea();

        Assert.assertTrue("Area", answer == realAnswer);
    }

    @Test
    public void calculatePerimeter() {
        double width = 5;
        double realAnswer = width * 4;

        Square square = new Square(3,4,5);
        double answer = square.calculatePerimeter();

        Assert.assertTrue("Perimeter", answer == realAnswer);
    }
}