package training.ideas.java.CharacterArrays;

/**
 * Created by idnrah on 16/8/14.
 */
public class FirstOccurrenceAfterProvidedIndex {


    public static int firstOccurrenceFinder(char[] array, int givenIndex) {

        for(int i=givenIndex+1;i<array.length;i++)
        {
            if(array[givenIndex]==array[i])
            {
                return i;
            }


        }


        return -1;
    }
}
