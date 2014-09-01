package training.ideas.java.Collections;

import junit.framework.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import static org.junit.Assert.*;
import java.util.Iterator;

/**
 * Created by idnrah on 27/8/14.
 */
public class HashMapTest {

    @Test
    public void hashMapTest() throws ParseException {

        HashMap<Date,String> dateDow=new HashMap<Date, String>();

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        String input1="2013-03-01";
        String dow1="Fri";

        dateDow.put(ft.parse(input1),dow1);

        Assert.assertEquals(dateDow,HashMapClass.hashMapImpl(input1, dow1));
        assertTrue(dateDow.equals(HashMapClass.hashMapImpl(input1, dow1)));


}


  /* @Test
    public void hashMapTest1() throws ParseException {

        HashMap<Date,HashMap<String,Integer>> dateWiseData=new HashMap<Date,HashMap<String,Integer>>();
        HashMap<String,Integer> data=new HashMap<String, Integer>();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        String date1="2013-03-01";



        data.put("A",50);
        data.put("B",60);
        data.put("C",80);


        dateWiseData.put(ft.parse(date1),data);
        data=new HashMap<String, Integer>();
        date1="2013-03-02";
        data.put("A",50);
        data.put("B",60);
        data.put("C",70);
        dateWiseData.put(ft.parse(date1),data);

        System.out.println("x");




     Assert.assertEquals(,HashMapClass.hashMapImpl(date1, dow1));
     //   assertTrue(dateDow.equals(HashMapClass.hashMapImpl(date1, dow1)));
*/

    }

