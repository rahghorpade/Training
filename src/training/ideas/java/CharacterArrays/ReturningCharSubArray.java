package training.ideas.java.CharacterArrays;

/**
 * Created by idnrah on 17/8/14.
 */


public class ReturningCharSubArray {



    public static char[] returnArray(char[] array1, int endIndex) {

        char[] subArray=new char[endIndex+1];

        for(int i=0;i<=endIndex;i++)
        {
            subArray[i]=array1[i];
        }



       return subArray;
    }
}
