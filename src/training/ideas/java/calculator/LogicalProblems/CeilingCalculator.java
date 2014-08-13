package training.ideas.java.calculator.LogicalProblems;

/**
 * Created by idnrah on 12/8/14.
 */
public class CeilingCalculator {


public static double ceilingToUpperFiveCents(double inputAmount) {

    double expectedAmount = 0;

    if(inputAmount*100%5==0)
    {
        return expectedAmount;
    }

    expectedAmount=(inputAmount*100+(5-(inputAmount*100)%5))/100;

    return expectedAmount;



    }

}