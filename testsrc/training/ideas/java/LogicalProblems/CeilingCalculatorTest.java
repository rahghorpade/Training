package training.ideas.java.LogicalProblems;

import junit.framework.Assert;
import org.junit.Test;
import training.ideas.java.calculator.LogicalProblems.CeilingCalculator;

/**
 * Created by idnrah on 12/8/14.
 */
public class CeilingCalculatorTest {


    @Test
    public void ceilingTestForNumberWhichIsNotRoundedTo5Cents()
    {
        double inputAmount=12.32;

        double expectedAmount=12.35;

        Assert.assertEquals(12.35, CeilingCalculator.ceilingToUpperFiveCents(inputAmount));
    }


    @Test
    public void ceilingTestForNumberWhichIsAllReadyRoundedTo5Cents()
    {
        double inputAmount=12.35;

        double expectedAmount=12.35;

        Assert.assertEquals(12.35, CeilingCalculator.ceilingToUpperFiveCents(inputAmount));
    }
}
