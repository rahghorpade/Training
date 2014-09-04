package training.ideas.java.FPLOSCalculator;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by idnrah on 2/9/14.
 */
public class FPLOSCalculator {




    public Map<Date, Map<String,String>> fplosDecicions(Set<Date> setOfOccupancyDates, Map<Date,List<Double>> lrvMap, Map<String, Double> rateSpectrumMap) {

        Map<Date, Map<String,String>> decision=new TreeMap<Date, Map<String, String>>();


        for(Date D1:setOfOccupancyDates)
        {

            Map<String,String> rateDecision=new HashMap<String, String>();
            //double rate=10.52;
            List<Double> lrvList= lrvMap.get(D1);
            //Iterator entries = rateSpectrumMap.entrySet().iterator();
            //Iterator lrvEntries = lrvMap.entrySet().iterator();

            Set<String> rateCode= rateSpectrumMap.keySet();
            for (String everyRateCode:rateCode )
            {
                double rateCodeValue=  rateSpectrumMap.get(everyRateCode);
                String pattern="";

                //while (entries.hasNext()) {


                double sumLRV = 0;
                int LOSCount=1;

                for(Double currentLRV : lrvList)
                {
                    sumLRV = sumLRV + currentLRV;

                    if((rateCodeValue * LOSCount) >= sumLRV){
                        //  System.out.print("Y");
                        pattern=pattern+"Y";
                    }
                    else
                    {
                        //   System.out.print("N");
                        pattern=pattern+"N";
                    }

                    LOSCount++;
                }



                rateDecision.put(everyRateCode,pattern);
            }
            decision.put(D1,rateDecision);
            //}


            // }





        }





        return decision;
    }
}
