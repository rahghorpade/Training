package training.ideas.java.CharacterArrays;
import java.util.*;
import java.lang.reflect.Array;

/**
 * Created by idnrah on 17/8/14.
 */
public class SubArraysFirstOccIndex {

    public static int firstOccIndexOfSubArray( char[] mainArray, char[] subArray) {



        int lastIndexOfSubArray=subArray.length-1;
           for(int j=0;j<mainArray.length&&lastIndexOfSubArray<mainArray.length;j++)
           {



               if(Arrays.equals(subArray,Arrays.copyOfRange(mainArray, j,j+lastIndexOfSubArray+1 )))

               {
                   return j;
               }

           }

        return -1;
    }

}
