package training.ideas.java.CharacterArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 17/8/14.
 */
public class CaseConverterTest {


    @Test

    public void testUpperCaseConvertedArray()
    {
        char[] array={'c','r','F','v','b','l'};
        char[] convertedArray={'C','R','F','V','B','L'};

        assertArrayEquals(convertedArray, CaseConverter.caseConverter(array, CaseConverter.Upper));
    }

    @Test

    public void testUpperCaseConvertedArrayWithNumbers()
    {
        char[] array={'c','r','F','v','b','l','2'};
        char[] convertedArray={'C','R','F','V','B','L','2'};

        assertArrayEquals(convertedArray,CaseConverter.caseConverter(array, CaseConverter.Upper));
    }
    @Test

    public void testUpperCaseConvertedArrayWithSingleCharinArray()
    {
        char[] array={'c'};
        char[] convertedArray={'C'};

        assertArrayEquals(convertedArray, CaseConverter.caseConverter(array, CaseConverter.Upper));
    }

    public void testUpperCaseConvertedArrayWithEmptyArray()
    {
        char[] array={};
        char[] convertedArray={};

        assertArrayEquals(convertedArray,  CaseConverter.caseConverter(array, CaseConverter.Upper));
    }

    public void testLowerCaseConvertedArray()
    {
        char[] array={'a','B','c'};
        char[] convertedArray={'a','b','c'};

        assertArrayEquals(convertedArray, CaseConverter.caseConverter(array, CaseConverter.Lower));
    }

    public void testLowerCaseConvertedWithEmptyArray()
    {
        char[] array={};
        char[] convertedArray={};

        assertArrayEquals(convertedArray, CaseConverter.caseConverter(array, CaseConverter.Lower));
    }





}
