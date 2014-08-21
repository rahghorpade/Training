package training.ideas.java.CharacterArrays;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by idnrah on 16/8/14.
 */
public class IndexOfCharTest {


   @Test
           public void testIndex()
   {
        char[] array={'A','B','a','C','a','E','g'};
       char inputChar='a';

       Assert.assertEquals(2,IndexOfChar.indexFinder(array,inputChar));

   }

    @Test
    public void testIndexForFirstIndex()
    {
        char[] array={'A','B','a','C','a','E','g'};
        char inputChar='A';

        Assert.assertEquals(0,IndexOfChar.indexFinder(array,inputChar));

    }

    @Test
    public void testIndexForLAstIndex()
    {
        char[] array={'A','B','a','C','a','E','g'};
        char inputChar='g';

        Assert.assertEquals(6,IndexOfChar.indexFinder(array,inputChar));

    }




    @Test
    public void testIndexWhenCharacterIsNotPresent()
    {
        char[] array={'A','B','a','C','a','E','g'};
        char inputChar='x';

        Assert.assertEquals(-1,IndexOfChar.indexFinder(array,inputChar));

    }
}
