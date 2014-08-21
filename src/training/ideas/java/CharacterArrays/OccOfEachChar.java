package training.ideas.java.CharacterArrays;

import sun.management.resources.agent_ko;

/**
 * Created by idnrah on 17/8/14.
 */
public class OccOfEachChar {
    public static int occurrenceCal(char[] inputArray, char findTheOccOf) {
          int counter=0;
        for(int i=0;i<inputArray.length;i++)
        {


           if ( findTheOccOf==inputArray[i])
            {
                counter++;
            }

        }


        return counter;
    }
}
