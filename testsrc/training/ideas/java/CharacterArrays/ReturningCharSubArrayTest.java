package training.ideas.java.CharacterArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 17/8/14.
 */
public class ReturningCharSubArrayTest {

    @Test
    public void sabArrayTest()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'A','B','C','D'};

        int endIndex=3;

        assertArrayEquals(expectedArray,ReturningCharSubArray.returnArray(array1,endIndex));


    }

    @Test
    public void subArrayTestWithEndIndexAs0()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'A'};

        int endIndex=0;

        assertArrayEquals(expectedArray,ReturningCharSubArray.returnArray(array1,endIndex));


    }

    @Test
    public void subArrayTestWithEndIndexAsLastIndex()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'A','B','C','D','H','K','L'};

        int endIndex=6;

        assertArrayEquals(expectedArray,ReturningCharSubArray.returnArray(array1,endIndex));


    }
}
