package training.ideas.java.CharacterArrays;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 14/8/14.
 */
public class StringConcatenationTest {


    @Test
    public void stringConcatenationTest()
    {char[] array1={'A','B','C'};
        char[] array2={'D','E','F'};
        char[] concatenatedArray={'A','B','C','D','E','F'};

        assertArrayEquals(concatenatedArray,StringConcatenation.concatenate(array1,array2));
    }
    @Test
    public void stringConcatenationTestWithNumbersAndUpperAndLowerCase()
    {char[] array1={'1','2','c'};
        char[] array2={'D','E','F'};
        char[] concatenatedArray={'1','2','c','D','E','F'};

        assertArrayEquals(concatenatedArray,StringConcatenation.concatenate(array1,array2));
    }
    @Test
    public void stringConcatenationTestWithSpecialChars()
    {char[] array1={' ','*','c'};
        char[] array2={'D','E','F'};
        char[] concatenatedArray={' ','*','c','D','E','F'};

        assertArrayEquals(concatenatedArray,StringConcatenation.concatenate(array1,array2));
    }


    @Test
    public void stringConcatenationTest1()
    {char[] array1={};
        char[] array2={'B'};
        char[] concatenatedArray={'B'};

        assertArrayEquals(concatenatedArray,StringConcatenation.concatenate(array1,array2));
    }

    @Test
    public void stringConcatenationTestWithFirstArrayAsEmpty()
    {char[] array1={};
        char[] array2={'B'};
        char[] concatenatedArray={'B'};

        assertArrayEquals(concatenatedArray,StringConcatenation.concatenate(array1,array2));
    }
  //  @Test
    public void stringConcatenationTestWithSecondArrayAsEmpty()
    {char[] array1={'A'};
        char[] array2={};
        char[] concatenatedArray={'A'};

        assertArrayEquals(concatenatedArray,StringConcatenation.concatenate(array1,array2));
    }


}
