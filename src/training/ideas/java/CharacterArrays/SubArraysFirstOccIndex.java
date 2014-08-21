package training.ideas.java.CharacterArrays;
import java.util.*;
import java.lang.reflect.Array;

/**
 * Created by idnrah on 17/8/14.
 */
public class SubArraysFirstOccIndex {

    public static int firstOccIndexOfSubArray( char[] mainArray, char[] subArray) {

     //   char[] mainArray={'s','d','f','g','a','b'};
    //    char[] subArray={'a','b'}

  //       for(int i=0;i<mainArray.length;i++)
     //  {

        int lastIndexOfSubArray=subArray.length-1;
           for(int j=0;j<mainArray.length&&lastIndexOfSubArray<mainArray.length;j++)
           {



               if(Arrays.equals(subArray,Arrays.copyOfRange(mainArray, j,j+lastIndexOfSubArray+1 )))

               {
                   return j;
               }

           }
   //   }
        return -1;
    }

}
