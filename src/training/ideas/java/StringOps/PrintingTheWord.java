package training.ideas.java.StringOps;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by idnrah on 19/8/14.
 */
public class PrintingTheWord {

    public static void printWord(String inputWord)
    {

      //  inputWord="RAHULGHORPADE";
        int length=inputWord.length();
        String sub;
        String result="";
        String space;
        String spacefordownword;


        for(int i=0;i<length;i++)
        {
            space="";
            spacefordownword="";
            sub=inputWord.substring(i,i+1);
            result=sub+result+sub;
            for(int j=length-1;j>i;j--)
            {

                space=space+" ";


            }

           System.out.println(space+result+space);


        }

        for(int x=1;x<length-1;x++)
        {

            spacefordownword="";
            sub=inputWord.substring(x,x+1);
            result=sub+result+sub;

            for(int k=1;k<length;k++)
            {

                spacefordownword=spacefordownword+" ";


            }

            System.out.println(spacefordownword+result+spacefordownword);


        }



    }

    public  static void main(String[] args)
    {
        String inputWord="ABC";

        printWord(inputWord);
    }
}
