package training.ideas.java.calculator.calculator;

/**
 * Created by idnrah on 23/7/14.
 */
public class First {

        public static int add(int a,int b)
        {
            return a+b;

        }

        public static double add(double a,double b)
        {

            return a+b;
        }

        public static double add(int a,double b)
        {

            return a+b;
        }

        public static int add(int intarray[])
        {

            int sum=0;

            for(int i=0;i<intarray.length;i++)
            {
                sum +=intarray[i];

            }


            return sum;
        }

        public static double add(double doublearray[])
        {

            int sum=0;

            for(int i=0;i<doublearray.length;i++)
            {
                sum +=doublearray[i];

            }


            return sum;
        }




        public static void main(String[] args)
        {


            System.out.println("int addition is " + First.add(2,4));

            System.out.println("double addition is " + First.add(12.0, 23.0));

            System.out.println("int and double addition is " + First.add(12, 23.0));

            int intarray[]={10,9,8,7,6,5,4,3,2,1};

            double doublearray[]={10.0,9.0,8.0,7.0,6.0,5.0,4.0,3.0,2.0,1.0};




            System.out.println("Addition of integer array is " + First.add(intarray));

            System.out.println("Additionof double array is  " + First.add(doublearray));

        }





    }



