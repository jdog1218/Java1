package edu.orangecoastcollege.cs170.jgordon41.ic16;

/**
 * CS170
 * Gordon, Joel
 * 4/4/2017
 * 
 * IC16_Temperature
 */

public class TemperatureDemo
{

    public static void main(String[] args)
    {
        Temperature tempF = new Temperature(45, TemperatureUnit.FAHRENHEIT);
        Temperature tempC = new Temperature(45, TemperatureUnit.CELSIUS);
        System.out.println(tempF + "\n" + tempC);
        
        System.out.println("~~~~~~Comparing Temps to see if the same~~~~~~");
        
        System.out.println(tempF.convertTo(tempC.getUnit()) ? "They are not the Same, Conversion Possiable": "They are the Same");
        System.out.println("~~~~~~~Converting temperature and comparing");
        
        Temperature temp2 = tempC.inOtherUnit(TemperatureUnit.FAHRENHEIT);
        
        System.out.println(tempF.convertTo(temp2.getUnit()) ? "They are not the Same, Conversion Possiable": "They are the Same");
        
    }

}
