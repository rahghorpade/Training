package training.ideas.java.CharacterArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 17/8/14.
 */
public class ReturningCharSubArrayStartAndEndIndexTest {

    @Test
    public void sabArrayTest()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'B','C','D','H'};

        int startIndex=1;
        int endIndex=4;

        assertArrayEquals(expectedArray,ReturningCharSubArrayStartAndEndIndex.returnArray(array1,startIndex,endIndex));


    }


    @Test
    public void sabArrayTestWithSameStartAndEndIndex()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'B'};

        int startIndex=1;
        int endIndex=1;

        assertArrayEquals(expectedArray,ReturningCharSubArrayStartAndEndIndex.returnArray(array1,startIndex,endIndex));


    }

    @Test
    public void sabArrayTestWithStartAndEndIndexAs0()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'A'};

        int startIndex=0;
        int endIndex=0;

        assertArrayEquals(expectedArray,ReturningCharSubArrayStartAndEndIndex.returnArray(array1,startIndex,endIndex));


    }
    @Test
    public void sabArrayTestWithStartAndEndIndexAs0and1()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'A','B'};

        int startIndex=0;
        int endIndex=1;

        assertArrayEquals(expectedArray,ReturningCharSubArrayStartAndEndIndex.returnArray(array1,startIndex,endIndex));


    }

    @Test
    public void sabArrayTestWithStartAndEndIndexAs0and4()
    {
        char[] array1={'A','B','C','D','H','K','L'};
        char[] expectedArray={'A','B','C','D','H'};

        int startIndex=0;
        int endIndex=4;

        assertArrayEquals(expectedArray,ReturningCharSubArrayStartAndEndIndex.returnArray(array1,startIndex,endIndex));


    }
}
