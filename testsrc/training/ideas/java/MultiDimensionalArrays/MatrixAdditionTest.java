package training.ideas.java.MultiDimensionalArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 26/8/14.
 */
public class MatrixAdditionTest {

    @Test
    public void additionTest()
    {
        int[][] inputArray1={{1,2},{3,4}};

        int[][] inputArray2={{1,2},{3,4}};

        int[][] resultArray={{2,4},{6,8}};

        assertArrayEquals(resultArray, MatrixAddition.addition(inputArray1,inputArray2));
    }
}
