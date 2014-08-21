package training.ideas.java.calculator.StringOperations;

/**
 * Created by idnrah on 13/8/14.
 */
public class StringCombinations {
    public static String[] converter(String inputString) {


        int strLength=inputString.length();
        System.out.println(strLength);
        String stringCombination;



        String[] strArray=new String[strLength];

        if(("").equals(inputString))
        {
          return strArray;
        }

        strArray[0]=inputString;

        for(int i=0;i<strLength-1;i++)
        {

            stringCombination=inputString.substring(1)+inputString.substring(0,1);
        //    appendString=inputString.substring(0,1);

            strArray[i+1]=stringCombination;
            inputString=strArray[i+1];

      //  System.out.println(strLength+appendString);
      //  System.out.println(inputString);

        }

        return strArray;
    }
}
