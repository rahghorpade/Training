package training.ideas.java.CharacterArrays;

/**
 * Created by idnrah on 15/8/14.
 */
public class StringConcatenation {
    public static char[] concatenate(char[] array1, char[] array2) {

        int lengthOfArray=array1.length+array2.length;

        char[] concatenatedString=new char[array1.length+array2.length];

        int i;
        int j;

        if(array1.length==0)
        {
            concatenatedString=array2;
        }
        else if (array2.length==0)
        {
            concatenatedString= array1;
        }
        else
        {
            for( i=0,j=array1.length;i<array1.length&&j<lengthOfArray;i++,j++)
            {


                concatenatedString[i]=array1[i];
                concatenatedString[j]=array2[i];

            }
        }










        return concatenatedString;
    }
}
