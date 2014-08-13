package training.ideas.java.calculator.Sorting;

/**
 * Created by idnrah on 29/7/14.
 */
public class SortOperation {


    public static int[] sort(int[] inputArray, int sortType)
    {
        int lengthOfArray = inputArray.length;
        for(int i=0;i<lengthOfArray-1;i++)
        {
            for(int j=0;j<lengthOfArray-1;j++)
            {

                boolean sortCondition;
                if(sortType==1)
                {
                   sortCondition = inputArray[j]>inputArray[j+1];
                }
                else
                {
                    sortCondition = inputArray[j]<inputArray[j+1];
                }
                if(sortCondition)
                {
                    int temp=inputArray[j];
                    inputArray[j]=inputArray[j+1];
                    inputArray[j+1]=temp;
                }
            }
        }
        return inputArray;

    }


    public static int[] sortAsc(int[] inputArray) {
      /* int lengthOfArray = inputArray.length;

       for(int i=0;i<lengthOfArray-1;i++)
        {
            for(int j=0;j<lengthOfArray-1;j++)
            {
                if(inputArray[j]>inputArray[j+1])
                {
                    int temp=inputArray[j];
                    inputArray[j]=inputArray[j+1];
                    inputArray[j+1]=temp;
                }
            }
        }*/
        return sort(inputArray,1);

    }


    public static int[] sortDesc(int[] inputArray) {
     /*   int lengthOfArray = inputArray.length;
        for(int i=0;i<lengthOfArray-1;i++)
        {
            for(int j=0;j<lengthOfArray-1;j++)
            {
                if(inputArray[j]<inputArray[j+1])
                {
                    int temp=inputArray[j];
                    inputArray[j]=inputArray[j+1];
                    inputArray[j+1]=temp;
                }
            }
        }*/
        return sort(inputArray,0);

    }


}

