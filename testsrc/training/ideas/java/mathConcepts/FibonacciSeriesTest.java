package training.ideas.java.mathConcepts;

import org.junit.Test;
import junit.framework.Assert;


import training.ideas.java.calculator.mathConcepts.FibonacciSeries;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 6/8/14.
 */
public class FibonacciSeriesTest {


   @Test
   public void testElementCount()
   {
       int fibSeriesFor=5;
       int[] fibSeries= FibonacciSeries.fibonacci(5);

       int[] expectedSeries={0,1,1,2,3};

       Assert.assertEquals(expectedSeries.length,fibSeriesFor);

       assertArrayEquals(expectedSeries,fibSeries);

   }






}


