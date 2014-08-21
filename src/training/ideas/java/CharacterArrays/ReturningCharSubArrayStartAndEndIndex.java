package training.ideas.java.CharacterArrays;

/**
 * Created by idnrah on 17/8/14.
 */
public class ReturningCharSubArrayStartAndEndIndex {


    public static char[] returnArray(char[] array1, int startIndex, int endIndex) {

        char[] subArray=new char[endIndex-startIndex+1];

        if(startIndex==endIndex)
        {
            subArray[0]=array1[startIndex];
        }
        else
        {


        for(int i=startIndex,j=0;i<=endIndex-startIndex+1&&j<endIndex-startIndex+1;i++,j++)
        {
            subArray[j]=array1[i];
        }

        }




        return subArray;
    }
}
