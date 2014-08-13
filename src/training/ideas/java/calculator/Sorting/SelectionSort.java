package training.ideas.java.calculator.Sorting;

/**
 * Created by idnrah on 4/8/14.
 */
public class SelectionSort {



    public static int[] sort(int[] inputArray,int sortType)
    {

        int lengthOfArray=inputArray.length;
        for(int i=0;i<lengthOfArray-1;i++)
        {
            int minorMaxPos=i;

            for(int j=i+1;j<lengthOfArray;j++)
            {
                boolean sortCondition;
                if(sortType==1)
                {
                    sortCondition=(inputArray[j] < inputArray[i]);

                }
                else
                {
                    sortCondition=(inputArray[j] > inputArray[i]);
                }

                if(sortCondition)
                {
                    minorMaxPos=j;

                    int temp=inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=temp;

                }


            }

        }
        return inputArray;

    }


    public static int[] sortAsc(int[] inputArray) {

        return sort(inputArray,1);

    }


    public static int[] sortDesc(int[] inputArray) {

        return sort(inputArray,0);

    }

}