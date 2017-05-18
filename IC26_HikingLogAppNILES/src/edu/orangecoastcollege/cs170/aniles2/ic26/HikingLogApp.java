package edu.orangecoastcollege.cs170.aniles2.ic26;
import java.util.HashMap;
import java.util.Scanner;

public class HikingLogApp
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        String hikeName="";
        Scanner consoleScanner = new Scanner(System.in);
        HashMap <String, Integer> hikingLog = new HashMap <>();
        
        System.out.println("~~~~~~~~~~~~~~~~~~Welcome to the Hiking Log~~~~~~~~~~~~~~~~~~");
        
        do{
        System.out.print("\nPlease enter name of hike completed (or \"quit\" to exit): ");
        hikeName = consoleScanner.nextLine();
        
        if (hikeName.equalsIgnoreCase("quit")) {
            break;
        }
        
        if (hikingLog.containsKey(hikeName)) {
            
           int value = hikingLog.get(hikeName);
           value++;
           hikingLog.put(hikeName, value);
        } 
        else {
            hikingLog.put(hikeName, 1);
        }
        
        } while (!hikeName.equalsIgnoreCase("quit"));
        
        consoleScanner.close();
        
        int totalHikes = 0;
        for (int numHikes : hikingLog.values()) {
         totalHikes += numHikes;
        }
        
        
        int max = Integer.MIN_VALUE;
        String maxHikeName = "";
        for(String hike : hikingLog.keySet()) {
        if (hikingLog.get(hike) > max) {
            max = hikingLog.get(hike);
            maxHikeName = hike;
        }
        }
       
        System.out.println("\n~~~~~~~~~~~~~~~~~~Hiking Statistics~~~~~~~~~~~~~~~~~~");
        System.out.println("\nUnique Hikes Completed:\t"+(hikingLog.size()));
        System.out.println("Total Hikes Completed:\t"+(totalHikes));
        System.out.println("Most Frequent Hike:\t"+maxHikeName);
        
    }
  }