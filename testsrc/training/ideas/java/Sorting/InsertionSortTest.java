package training.ideas.java.Sorting;

import org.junit.Test;
import training.ideas.java.calculator.Sorting.InsertionSort;


import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 5/8/14.
 */
public class InsertionSortTest {


        @Test

        public void insertionSort()
        {
            int[] inputArray={2,3,14,6,4,7};

            int[] result= InsertionSort.sort(inputArray);

            int[] ascSortedList={2,3,4,6,7,14};



            assertArrayEquals(ascSortedList,result);




    }





}
