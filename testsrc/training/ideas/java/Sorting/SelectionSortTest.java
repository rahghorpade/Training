package training.ideas.java.Sorting;

import org.junit.Test;
import training.ideas.java.calculator.Sorting.SelectionSort;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by idnrah on 4/8/14.
 */

public class SelectionSortTest {


    @Test
    public void ascSortCheckWithNegativeValues()
    {
        int[] inputList={43,-1,57,-3};

        int[] result= SelectionSort.sortAsc(inputList);

        int[] ascSortedList={-3,-1,43,57};

        assertArrayEquals(ascSortedList,result);

    }

    @Test
    public void descSortCheckWithNegativeValues()
    {
        int[] inputList={43,-1,57,-3};

        int[] result= SelectionSort.sortDesc(inputList);

        int[] descSortedList={57,43,-1,-3};

        assertArrayEquals(descSortedList,result);

    }





}
