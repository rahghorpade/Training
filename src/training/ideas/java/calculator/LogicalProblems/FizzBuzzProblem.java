package training.ideas.java.calculator.LogicalProblems;

/**
 * Created by idnrah on 11/8/14.
 */
public class FizzBuzzProblem {
    public static String printFizzBuzz(int givenNumber) {

        String FizzBuzzSeries="";

        if(givenNumber==0)
        {
            FizzBuzzSeries+=givenNumber;
        }

            for(int counter=0;counter<givenNumber;counter++) {

            if((counter+1)%3==0 || (counter+1)%5==0 ){
                if((counter+1)%3==0){
                    FizzBuzzSeries+="Fizz";
                }
                if((counter+1)%5==0){
                    FizzBuzzSeries+="Buzz";
                }


            }

            else {
                FizzBuzzSeries+= counter+1+"";
            }

        }
        return FizzBuzzSeries;


    }
}
