package training.ideas.java.StringOperations;

import  org.junit.Assert;
import org.junit.Test;
import training.ideas.java.calculator.StringOperations.StringCombinations;

/**
 * Created by idnrah on 13/8/14.
 */
public class StringCombinationsTest {

    @Test
    public void stringCombinationTest()
    {
        String inputString="ABC";
        String[] expectedOutput={"ABC","BCA","CAB"};

        Assert.assertArrayEquals(expectedOutput, StringCombinations.converter(inputString));

        }

    @Test
    public void stringCombinationTest2()
    {
        String inputString="AB";
        String[] expectedOutput={"AB","BA"};

        Assert.assertArrayEquals(expectedOutput, StringCombinations.converter(inputString));

    }


    @Test
    public void stringCombinationTest1()
    {
        String inputString="A";
        String[] expectedOutput={"A"};

        Assert.assertArrayEquals(expectedOutput, StringCombinations.converter(inputString));

    }

    @Test
    public void stringCombinationTestEmptyString()
    {
        String inputString="";
        String[] expectedOutput={};

        Assert.assertArrayEquals(expectedOutput, StringCombinations.converter(inputString));

    }

}
