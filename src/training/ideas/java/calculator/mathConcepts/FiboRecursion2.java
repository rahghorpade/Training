package training.ideas.java.calculator.mathConcepts;

/**
 * Created by idnrah on 7/8/14.
 */

public class FiboRecursion2{
    public static int[] fibonacciSeries(int noOfElementsForWhichFibonacciSeriesWants) {

        int fibonacciSeries[] = new int[noOfElementsForWhichFibonacciSeriesWants];


        fibonacciWithRecursion(noOfElementsForWhichFibonacciSeriesWants, fibonacciSeries);
        return fibonacciSeries;
    }


    private static int[]  fibonacciWithRecursion(int counter,int [] fibonacciSeries) {
        if (counter==1){
            fibonacciSeries[0]=0 ;
            return fibonacciSeries;
        }
        else if (counter==2){
            fibonacciSeries[0]=0 ;
            fibonacciSeries[1]=1;
            return fibonacciSeries;
        }


        fibonacciWithRecursion(counter - 1, fibonacciSeries);

        fibonacciSeries[counter-1]=fibonacciSeries[counter-2]+fibonacciSeries[counter-3];
        return fibonacciSeries;

    }
}