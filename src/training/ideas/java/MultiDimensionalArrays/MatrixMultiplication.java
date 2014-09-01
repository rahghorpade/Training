package training.ideas.java.MultiDimensionalArrays;

/**
 * Created by idnrah on 25/8/14.
 */
public class MatrixMultiplication {


    public static int[][] multiMatrix(int[][] inputArray1, int[][] inputArray2) {

        int[][] resultArray=new int[2][2];

        for(int i=0;i<inputArray1.length;i++)
        {
            for(int j=0;j<inputArray2.length;j++)
            {
                for(int k=0;k<inputArray2.length;k++)
                {
                    resultArray[i][j]+=(inputArray1[k][j]*inputArray2[i][k]);
                }
            }
        }


        return resultArray;
    }
}
