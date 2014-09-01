package training.ideas.java.MultiDimensionalArrays;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 25/8/14.
 */
public class TransposeMatrixTest {


    @Test
    public void transposeTest()
    {
        int[][] inputArray1={{1,2},{3,4},{6,7}};


        int[][] resultArray={{1,3,6},{2,4,7}};

        assertArrayEquals(resultArray,TransposeMatrix.transpose(inputArray1));
    }





}
