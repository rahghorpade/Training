package training.ideas.java.mathConcepts;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.calculator.mathConcepts.Triangle;

/**
 * Created by idnrah on 14/8/14.
 */
public class TriangleTest {


    @Test
    public void equilateralTest()
    {
        int angle1=60;
        int angle2=60;
        int angle3=60;

  Assert.assertEquals(Triangle.EQUILATERAL, Triangle.triangleType(angle1, angle2, angle3));

    }

    @Test
    public void rightAngleTriangleTest()
    {
        int angle1=90;
        int angle2=60;
        int angle3=30;

        Assert.assertEquals(Triangle.RIGHT_ANGLE_TRIANGLE, Triangle.triangleType(angle1, angle2, angle3));

    }

    @Test
    public void isoscelesTriangleTest()
    {
        int angle1=90;
        int angle2=45;
        int angle3=45;

        Assert.assertEquals(Triangle.ISOSCELES, Triangle.triangleType(angle1, angle2, angle3));

    }




}
