package training.ideas.java.CharacterArrays;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 17/8/14.
 */
public class OccOfEachCharTest {

    @Test
    public void occurrenceNoForGivenChar()
    {
        char[] inputArray={'K','L','K','O','L'};
        char findTheOccOf='K';

        Assert.assertEquals(2,OccOfEachChar.occurrenceCal(inputArray,findTheOccOf));


    }

    @Test
    public void occurrenceNoForGivenCharWhenCharNotPresent()
    {
        char[] inputArray={'K','L','K','O','L'};
        char findTheOccOf='X';

        Assert.assertEquals(0,OccOfEachChar.occurrenceCal(inputArray,findTheOccOf));


    }
}
