package training.ideas.java.calculator;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.calculator.calculator.Addition;

/**
 * Created by idnrah on 21/7/14.
 */
public class AdditionTest {



 /*   @Test
    public void performInt()
    {
        //1  1
      Assert.assertEquals(1+12+3+4, Addition.add(1, 2, 3, 4));
    }
*/
    @Test
    public void performDouble()
    {
        Assert.assertEquals(12.12+12.10+23.21,Addition.add(12.12,12.10,23.21));
    }




   @Test
    public void performIntArray()
   {
       int[] intArray = {10,9,8,7,6,5,4,3,2,1};
       Assert.assertEquals(10+9+8+7+6+5+4+3+2+1,Addition.add(intArray));
   }


    @Test
   public void performDoubleArray()
    {
        double doubleArray[]={10.0,9.0,8.0,7.0,6.0,5.0,4.0,3.0,2.0,1.0};
        Assert.assertEquals(10.0+9.0+8.0+7.0+6.0+5.0+4.0+3.0+2.0+1.0,Addition.add(doubleArray));
    }









}
