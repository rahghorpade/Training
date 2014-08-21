package training.ideas.java.CharacterArrays;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnrah on 18/8/14.
 */
public class SubArraysFirstOccIndexAfterGivenIndexTest {

    @Test
    public void indexTestForSubArray()
    {
        int index=3;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'a','b'};
        int expectedIndex=1;

        Assert.assertEquals(expectedIndex,SubArraysFirstOccIndexAfterGivenIndex.firstOccIndexOfSubArrayAfterGivenIndex(mainArray, subArray,index));


    }

    @Test
    public void indexTestForSubArrayForFirstPosition()
    {
        int index=0;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'s','d'};

        Assert.assertEquals(-1, SubArraysFirstOccIndex.firstOccIndexOfSubArray(mainArray, subArray));


    }

    @Test
    public void indexTestForSubArrayForWhenSubArrayNotPresent()
    {
        int index=-1;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'x','y'};

        Assert.assertEquals(-1, SubArraysFirstOccIndex.firstOccIndexOfSubArray(mainArray, subArray));


    }





}
