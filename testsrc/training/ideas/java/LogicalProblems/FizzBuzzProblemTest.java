package training.ideas.java.LogicalProblems;

import org.junit.Assert;
import org.junit.Test;
import training.ideas.java.calculator.LogicalProblems.FizzBuzzProblem;

/**
 * Created by idnrah on 11/8/14.
 */
public class FizzBuzzProblemTest {

    @Test
    public void printFizBuzzString(){
        int givenNumber=20;
        String expectedFizzBuzzString="12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";
        Assert.assertEquals(expectedFizzBuzzString,FizzBuzzProblem.printFizzBuzz(givenNumber));

    }

    @Test
    public void printFizBuzzStringFor1(){
        int givenNumber=1;
        String expectedFizzBuzzString="1";
        Assert.assertEquals(expectedFizzBuzzString,FizzBuzzProblem.printFizzBuzz(givenNumber));

    }

    @Test
    public void printFizBuzzStringFor0(){
        int givenNumber=0;
        String expectedFizzBuzzString="0";
        Assert.assertEquals(expectedFizzBuzzString,FizzBuzzProblem.printFizzBuzz(givenNumber));

    }

}
