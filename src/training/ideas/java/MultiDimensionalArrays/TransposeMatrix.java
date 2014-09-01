package training.ideas.java.MultiDimensionalArrays;

/**
 * Created by idnrah on 25/8/14.
 */
public class TransposeMatrix {


    public static int[][] transpose(int[][] inputArray) {

        int i,j;

        i=inputArray.length;
        j=inputArray[0].length;



      int[][] resultArray=new int[j][i];




        for(i=0;i<inputArray.length;i++)
        {
            for (j=0;j<inputArray[0].length;j++)
            {
                resultArray[j][i]=inputArray[i][j];
            }
        }










        return resultArray;
    }
}
