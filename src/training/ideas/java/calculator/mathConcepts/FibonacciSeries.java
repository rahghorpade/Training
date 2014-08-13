package training.ideas.java.calculator.mathConcepts;

/**
 * Created by idnrah on 6/8/14.
 */
public class FibonacciSeries {
    public static int[] fibonacci(int numberForWhichSeriesWants) {

        int[] elementInSeries = new int[numberForWhichSeriesWants];

        elementInSeries[0]=0;
        elementInSeries[1]=1;


       for(int counter=2;counter<numberForWhichSeriesWants;counter++)
        {

            elementInSeries[counter]=elementInSeries[counter-1]+elementInSeries[counter-2];

        }



        return elementInSeries;


    }
}
