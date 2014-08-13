package training.ideas.java.calculator.Sorting;

/**
 * Created by idnrah on 5/8/14.
 */
public class InsertionSort {

    public static int[] sort(int[] inputArray)
    {

        for (int unSortedItems=1;unSortedItems<inputArray.length;unSortedItems++)

        {

            int valueToSort=inputArray[unSortedItems];
            int sortedItem;

            for(sortedItem=0;sortedItem>=0 && valueToSort<inputArray[sortedItem];sortedItem--)
            {
                inputArray[sortedItem+1]=inputArray[sortedItem];
                inputArray[sortedItem+1]=valueToSort;

            }

         inputArray[sortedItem]=valueToSort;

        }




        return inputArray;


    }






}
