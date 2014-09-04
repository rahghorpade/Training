package training.ideas.java.FPLOSCalculator;

import junit.framework.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnrah on 2/9/14.
 */
public class FPLOSCalculatorTest {


    @Test
    public void testAdvanced() throws Exception
    {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Map<Date,List<Double>> LRVMap = new HashMap<Date,List<Double>>();
        Map<String,Double> RateSpectrumMap = new HashMap<String,Double>();
        Set<Date> setOfOccupancyDates = new HashSet<Date>();

        setOfOccupancyDates.add(df.parse("2010-10-10"));
        setOfOccupancyDates.add(df.parse("2010-10-11"));
        setOfOccupancyDates.add(df.parse("2010-10-12"));

        RateSpectrumMap.put("RATE1",400.0);
        RateSpectrumMap.put("RATE2",20.0);
        RateSpectrumMap.put("RATE3",600.0);

        LRVMap.put(df.parse("2010-10-10"), Arrays.asList(100.0, 20.0, 30.0, 40.0, 50.0, 60.0,70.0));
        LRVMap.put(df.parse("2010-10-11"), Arrays.asList(100.0,20.0,30.0,40.0,50.0,60.0,70.0));
        LRVMap.put(df.parse("2010-10-12"), Arrays.asList(100.0,20.0,30.0,40.0,50.0,60.0,70.0));

        Map<Date,Map<String,String>> FPLOSDecision=new TreeMap<Date, Map<String, String>>();

        Map<String,String> RateCodeWiseDecision=new TreeMap<String, String>();

        RateCodeWiseDecision.put("RATE1","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-10"),RateCodeWiseDecision);

        RateCodeWiseDecision.put("RATE2","NNNNNNY");
        FPLOSDecision.put(df.parse("2010-10-11"),RateCodeWiseDecision);

        RateCodeWiseDecision.put("RATE3","YYYYYYY");
        FPLOSDecision.put(df.parse("2010-10-12"),RateCodeWiseDecision);


      // Map<Date, Map<String,String>> FPLOSDecision = new TreeMap<Date,Map<setOfOccupancyDates,RateSpectrumMap>>();
      //  new FPLOSCalculator().fplosDecicions(setOfOccupancyDates,LRVMap, RateSpectrumMap);

     Assert.assertEquals(FPLOSDecision, new FPLOSCalculator().fplosDecicions(setOfOccupancyDates,LRVMap, RateSpectrumMap));





    }

}

