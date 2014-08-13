package training.ideas.java.calculator.calculator;

/**
 * Created by idnrah on 21/7/14.
 */
public class Addition {


   public static int add(int...a)

    {

        int sum=0;
        for(int i:a)
        {
         sum=sum+i;
        }
        return sum;
    }




    public static double add(double...b)
    {
        double sum=0.0;
        for(double counter:b)
        {
            sum=sum+counter;
        }
         return sum;
    }





}
