package training.ideas.java.MultiDimensionalArrays;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 25/8/14.
 */
public class MatrixMultiplicationTest {



    @Test
    public void multiTest()
    {
        int[][] inputArray1={{1,2},{3,4}};

        int[][] inputArray2={{1,2},{3,4}};

        int[][] resultArray={{7,10},{15,22}};

        assertArrayEquals(resultArray, MatrixMultiplication.multiMatrix(inputArray1,inputArray2));


}



}


