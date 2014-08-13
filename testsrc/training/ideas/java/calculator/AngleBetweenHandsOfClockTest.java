package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.calculator.calculator.AngleBetweenHandsOfClock;

/**
 * Created by idnrah on 11/8/14.
 */
public class AngleBetweenHandsOfClockTest {

    @Test
    public void angleTest()
    {
     int hour=12;
     int minutes=23;
     double expectedAngle=126.5;

     Assert.assertEquals(expectedAngle, AngleBetweenHandsOfClock.angleCalculator(12,23));

    }

    @Test
     public void angleTestGreaterThan180()
    {
        int hour=1;
        int minutes=55;
        double expectedAngle=302.5;

        Assert.assertEquals(expectedAngle, AngleBetweenHandsOfClock.angleCalculator(1,55));

    }

    @Test
    public void angleTestGreaterThan3()
    {
        int hour=3;
        int minutes=00;
        double expectedAngle=270;

        Assert.assertEquals(expectedAngle, AngleBetweenHandsOfClock.angleCalculator(3,0));

    }


  //  @Test
    public void angleTestGreaterThan270()
    {
        int hour=9;
        int minutes=55;
        double expectedAngle=57.5;

        Assert.assertEquals(expectedAngle, AngleBetweenHandsOfClock.angleCalculator(9,55));

    }

    @Test
    public void angleTestGreaterThan220()
    {
        int hour=2;
        int minutes=20;
        double expectedAngle=70;

        Assert.assertEquals(expectedAngle, AngleBetweenHandsOfClock.angleCalculator(2,20));

    }




}
