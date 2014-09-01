package training.ideas.java.Collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by idnrah on 27/8/14.
 */
public class HashMapClass {


    public static HashMap<Date,String> hashMapImpl(String date,String dow) throws ParseException {

        HashMap<Date,String> dateDow=new HashMap<Date, String>();

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        dateDow.put(ft.parse(date),dow);




        return dateDow;
    }
}
