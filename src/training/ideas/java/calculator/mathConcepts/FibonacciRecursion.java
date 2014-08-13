package training.ideas.java.calculator.mathConcepts;

/**
 * Created by idnrah on 6/8/14.
 */
public class FibonacciRecursion {
    public static int[] fibonacciSeries(int numberForWhichSeriesWants) {

        int[] elementsInSeries=new int[numberForWhichSeriesWants];

        for(int counter=0;counter<elementsInSeries.length;counter++)

        {
            elementsInSeries[counter]=fibonacci(counter);
        }

        return elementsInSeries;

    }




    public static int fibonacci(int numberForWhichSeriesWants)
    {
        if(numberForWhichSeriesWants==0)
        return  0;
        else if (numberForWhichSeriesWants==1)
            return 1;
        else
            return (fibonacci(numberForWhichSeriesWants - 1)+fibonacci(numberForWhichSeriesWants - 2));
    }
}
