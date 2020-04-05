import org.junit.Assert;
import org.junit.Test;
import sample.Circle;
import sample.Dot;
import sample.Rectangle;
import java.util.ArrayList;


public class HandlerTest {
    /**
     * testing circle perimeter
     */
    @Test
    public void testCirclePerimeter(){
        ArrayList<Dot> dotsCircle = new ArrayList<Dot>();
        dotsCircle.add(new Dot(0,0));
        Circle circle1 = new Circle(dotsCircle, 4);

        double expected = 4 * 2 * 3.14;

        Assert.assertEquals(expected, circle1.getPerimeter(), 0.000001);
    }

    /**
     * testing rectangle perimeter
     */
    @Test
    public void testRectanglePerimeter(){
        ArrayList<Dot> dotsRectangle = new ArrayList<Dot>();
        dotsRectangle.add(new Dot(0,0));
        dotsRectangle.add(new Dot(2,0));
        dotsRectangle.add(new Dot(2,2));
        dotsRectangle.add(new Dot(0,2));

        Rectangle rectangle1 = new Rectangle(dotsRectangle);

        double expected = 2 + 2 + 2 + 2;

        Assert.assertEquals(expected, rectangle1.getPerimeter(), 0.000001);
    }
}

