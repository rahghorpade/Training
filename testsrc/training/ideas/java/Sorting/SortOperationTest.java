package training.ideas.java.Sorting;

import static org.junit.Assert.*;

import org.junit.Test;
import training.ideas.java.calculator.Sorting.SortOperation;

/**
 * Created by idnrah on 29/7/14.
 */
public class SortOperationTest {

    @Test
    public void sortCheckOneElementCheck()
    {
        int[] inputList={43};


        int[] ascResult= SortOperation.sortAsc(inputList);
        int[] descResult= SortOperation.sortDesc(inputList);

        int[] ascSortedList={43};
        int[] descSortedList={43};

        assertArrayEquals(ascSortedList,ascResult);
        assertArrayEquals(descSortedList,descResult);


    }


    @Test
            public void sortAscCheck()
    {
        int[] inputList={43,13};


        int[] ascResult= SortOperation.sortAsc(inputList);


        int[] ascSortedList={13,43};


       assertArrayEquals(ascSortedList,ascResult);


    }


    @Test
    public void descSortCheck()
    {
        int[] inputList={43,13};


        int[] descResult= SortOperation.sortDesc(inputList);


        int[] descSortedList={43,13};


        assertArrayEquals(descSortedList,descResult);


    }

    @Test
    public void ascSortCheckWithNegativeValues()
    {
        int[] inputList={43,-1,57,-3};

        int[] result= SortOperation.sortAsc(inputList);

        int[] ascSortedList={-3,-1,43,57};

        assertArrayEquals(ascSortedList,result);

    }

    @Test
    public void descSortCheckWithNegativeValues()
    {
        int[] inputList={43,-1,57,-3};

        int[] result= SortOperation.sortDesc(inputList);

        int[] descSortedList={57,43,-1,-3};

        assertArrayEquals(descSortedList,result);

    }

    @Test
    public void ascSortCheckForAllReadySortedList()
    {
        int[] inputList={1,2,3,4};


        int[] result= SortOperation.sortAsc(inputList);

        int[] ascSortedList={1,2,3,4};

        assertArrayEquals(ascSortedList,result);

    }

    @Test
    public void descSortCheckForAllReadySortedList()
    {
        int[] inputList={1,2,3,4};


        int[] result= SortOperation.sortDesc(inputList);

        int[] descSortedList={4,3,2,1};

        assertArrayEquals(descSortedList,result);

    }

    @Test
    public void sortCheckForRandomNumbers()
    {
        int[] inputList={13,12,11,10,34,56,21};


        int[] result= SortOperation.sortAsc(inputList);

        int[] ascSortedList={10,11,12,13,21,34,56};

        assertArrayEquals(ascSortedList,result);

    }


    @Test
    public void ascSortCheckForSomeEqualNumbers()
    {
        int[] inputList={22,22,11,11,34,56,21};

        int[] result= SortOperation.sortAsc(inputList);

        int[] ascSortedList={11,11,21,22,22,34,56};

        assertArrayEquals(ascSortedList,result);
    }

    @Test
    public void descSortCheckForSomeEqualNumbers()
    {
        int[] inputList={22,22,11,11,34,56,21};

        int[] result= SortOperation.sortDesc(inputList);

        int[] descSortedList={56,34,22,22,21,11,11};

        assertArrayEquals(descSortedList,result);
    }




}
