package training.ideas.java.mathConcepts;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.calculator.mathConcepts.FiboRecursion2;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 9/8/14.
 */
public class FiboRecursion2Test {

    @Test
    public void testFibonacciForNumbers()
    {
        int fibSeriesFor=5;
        int[] fibSeries= FiboRecursion2.fibonacciSeries(5);

        int[] expectedSeries={0,1,1,2,3};

        Assert.assertEquals(expectedSeries.length, fibSeriesFor);


        assertArrayEquals(expectedSeries,fibSeries);

    }

    @Test
    public void testFibonacciForNumber0()
    {
        int fibSeriesFor=1;
        int[] fibSeries= FiboRecursion2.fibonacciSeries(1);

        int[] expectedSeries={0};

        Assert.assertEquals(expectedSeries.length, fibSeriesFor);


        assertArrayEquals(expectedSeries,fibSeries);

    }

    @Test
    public void testFibonacciForNumber2()
    {
        int fibSeriesFor=2;
        int[] fibSeries= FiboRecursion2.fibonacciSeries(2);

        int[] expectedSeries={0,1};

        Assert.assertEquals(expectedSeries.length, fibSeriesFor);


        assertArrayEquals(expectedSeries,fibSeries);

    }
}
