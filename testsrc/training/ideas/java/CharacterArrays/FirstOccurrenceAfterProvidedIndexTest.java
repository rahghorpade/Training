package training.ideas.java.CharacterArrays;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnrah on 16/8/14.
 */
public class FirstOccurrenceAfterProvidedIndexTest
{

    @Test
    public void testFirstOccurrenceAfterIndex()
    {
        char[] array={'R','A','F','A','O','L','K','A'};
        int givenIndex=1;

        Assert.assertEquals(3,FirstOccurrenceAfterProvidedIndex.firstOccurrenceFinder(array, givenIndex));

    }

    @Test
    public void testFirstOccurrenceAfterIndexWhenNoOccurrence()
    {
        char[] array={'R','A','F','L','O','L','K','P'};
        int givenIndex=1;

        Assert.assertEquals(-1,FirstOccurrenceAfterProvidedIndex.firstOccurrenceFinder(array, givenIndex));

    }

    @Test
    public void testFirstOccurrenceAfterIndexWhenOccurrenceBeforeIt()
    {
        char[] array={'R','A','F','L','O','L','K','P'};
        int givenIndex=5;

        Assert.assertEquals(-1,FirstOccurrenceAfterProvidedIndex.firstOccurrenceFinder(array, givenIndex));

    }
    @Test
    public void testFirstOccurrenceAfterIndexWhenIndexIsLastElementOfArray()
    {
        char[] array={'R','A','F','L','O','L','K','P'};
        int givenIndex=7;

        Assert.assertEquals(-1,FirstOccurrenceAfterProvidedIndex.firstOccurrenceFinder(array, givenIndex));

    }










}
