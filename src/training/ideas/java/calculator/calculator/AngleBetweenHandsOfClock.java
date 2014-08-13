package training.ideas.java.calculator.calculator;

/**
 * Created by idnrah on 11/8/14.
 */
public class AngleBetweenHandsOfClock {

    public static double angleCalculator(int hour, int minutes) {

        int speedOfMinHandInAngles=6;
        double speedOfHourHandInAngles=0.5;

        double angleCompareHour=hour*30;
        double angleCompareMin=hour/minutes*30;

        Double angle=minutes*speedOfMinHandInAngles-minutes*speedOfHourHandInAngles;

    /*    if (hour/minutes*30<hour/minutes*30)
        {
            angle=360-angle;
        }
        */




       return angle;
    }





}
