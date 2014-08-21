package training.ideas.java.CharacterArrays;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

/**
 * Created by idnrah on 17/8/14.
 */
public enum CaseConverter {
    Upper,Lower;


    public static char[] caseConverter(char[] array, CaseConverter input) {


        for(int i=0;i<array.length;i++)

        {
            if(input==CaseConverter.Upper)
            {
            char ch=array[i];
            array[i]=toUpperCase(ch);
            }
            if(input==CaseConverter.Lower)
            {
                char ch=array[i];
                array[i]=toLowerCase(ch);
            }
        }

        return array;
    }



    }

