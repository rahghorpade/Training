package training.ideas.java.mathConcepts;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.calculator.mathConcepts.FibonacciRecursion;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 6/8/14.
 */
public class FibonacciRecursionTest {

    @Test
    public void testFibonacciForNumbers()
    {
        int fibSeriesFor=5;
        int[] fibSeries= FibonacciRecursion.fibonacciSeries(5);

        int[] expectedSeries={0,1,1,2,3};

        Assert.assertEquals(expectedSeries.length, fibSeriesFor);

        assertArrayEquals(expectedSeries,fibSeries);

    }
    @Test
    public void testFibonacciForZero()
    {
        int fibSeriesFor=0;
        int[] fibSeries= FibonacciRecursion.fibonacciSeries(0);

        int[] expectedSeries={};

        Assert.assertEquals(expectedSeries.length, fibSeriesFor);

        assertArrayEquals(expectedSeries,fibSeries);

    }



}
