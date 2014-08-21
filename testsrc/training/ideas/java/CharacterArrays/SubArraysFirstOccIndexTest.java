package training.ideas.java.CharacterArrays;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnrah on 17/8/14.
 */
public class SubArraysFirstOccIndexTest {

    @Test
    public void indexTestForSubArray()
    {
        int index=4;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'a','b'};

        Assert.assertEquals(index, SubArraysFirstOccIndex.firstOccIndexOfSubArray(mainArray, subArray));


    }

    @Test
    public void indexTestForSubArrayForFirstPosition()
    {
        int index=0;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'s','d'};

        Assert.assertEquals(index, SubArraysFirstOccIndex.firstOccIndexOfSubArray(mainArray, subArray));


    }

    @Test
    public void indexTestForSubArrayForWhenSubArrayNotPresent()
    {
        int index=-1;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'x','y'};

        Assert.assertEquals(-1, SubArraysFirstOccIndex.firstOccIndexOfSubArray(mainArray, subArray));


    }

    @Test
    public void indexTestForSubArrayForWhenSubArrayNotPresentgf()
    {
        int index=1;
        char[] mainArray={'s','d','f','g','a','b'};
        char[] subArray={'d','f','g'};

        Assert.assertEquals(1, SubArraysFirstOccIndex.firstOccIndexOfSubArray(mainArray, subArray));


    }
}
