package training.ideas.java.CharacterArrays;

import java.util.Arrays;

/**
 * Created by idnrah on 18/8/14.
 */
public class SubArraysFirstOccIndexAfterGivenIndex {


    public static int firstOccIndexOfSubArrayAfterGivenIndex(char[] mainArray, char[] subArray, int index) {


        for(int i=0;i<mainArray.length;i++)
        {

            int lastIndexOfSubArray=subArray.length-1;
            for(int j=index;j<mainArray.length&&lastIndexOfSubArray<mainArray.length;j++)
            {



                if(Arrays.equals(subArray, Arrays.copyOfRange(mainArray, j, j + lastIndexOfSubArray + 1)))

                {
                    return j;
                }

            }
        }
        return -1;



    }
}
