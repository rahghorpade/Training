package training.ideas.java.calculator.mathConcepts;

/**
 * Created by idnrah on 14/8/14.
 */
public enum  Triangle {


   EQUILATERAL,ISOSCELES,RIGHT_ANGLE_TRIANGLE,SCALENE;

    public static Triangle triangleType(int angle1, int angle2, int angle3) {

      //  String type="";

        if(angle1==angle2 && angle2==angle3)
        {
            return EQUILATERAL;
        }
        if(angle1==90||angle2==90||angle3==90)

        {
            return RIGHT_ANGLE_TRIANGLE;
        }

        if(angle1==angle2||angle2==angle3||angle3==angle1)

        {
            return ISOSCELES;
        }


        return SCALENE;
    }



}
