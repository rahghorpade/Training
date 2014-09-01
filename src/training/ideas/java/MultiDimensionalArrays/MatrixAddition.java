package training.ideas.java.MultiDimensionalArrays;

/**
 * Created by idnrah on 26/8/14.
 */
public class MatrixAddition {


    public static int[][] addition(int[][] inputArray1, int[][] inputArray2) {

        int i=inputArray1.length;
        int j=inputArray1[0].length;

        int[][] resultArray=new int[i][j];

        for(i=0;i<inputArray1.length;i++)
        {
            for(j=0;j<inputArray1[0].length;j++)
            {

        resultArray[i][j]=inputArray1[i][j]+inputArray2[i][j];

            }

        }


        return resultArray;
    }
}
