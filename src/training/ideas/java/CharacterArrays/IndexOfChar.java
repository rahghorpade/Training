package training.ideas.java.CharacterArrays;

/**
 * Created by idnrah on 16/8/14.
 */
public class IndexOfChar {

    public static int indexFinder(char[] inputArray, char inputChar) {


        for(int i=0;i<inputArray.length;i++)
        {
            if(inputChar==inputArray[i])
            {
              return   i;
            }
        }




        return -1;
    }
}
