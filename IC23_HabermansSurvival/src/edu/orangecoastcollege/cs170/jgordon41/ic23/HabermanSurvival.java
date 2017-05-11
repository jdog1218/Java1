package edu.orangecoastcollege.cs170.jgordon41.ic23;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Gordon,Joel
 * CS A170
 * May 9, 2017
 * IC #23 Haberman Survival
 */
public class HabermanSurvival
{
    public static void main(String[] args)
    {
        //Some days there won't be a song in your heart. Sing anyway...
        
        DecimalFormat oneDP = new DecimalFormat("#.0");
        String line;
        double totalNodesS=0.0, totalNodesNS=0.0, averageS, averageNS;
        int maxNodesS=Integer.MIN_VALUE, minNodesS=Integer.MAX_VALUE,
                maxNodesNS=Integer.MIN_VALUE, minNodesNS=Integer.MAX_VALUE,
                countS=0, countNS=0;
        

        try {            
            Scanner fileScanner = new Scanner(new File("Haberman.csv"));   
            
            while (fileScanner.hasNextLine()) { 
                line = fileScanner.nextLine();                
                String[] data = line.split(",");      
                
                int status = Integer.parseInt(data[3]);         
                int nodes = Integer.parseInt(data[2]);      
                
                //For Survivors
                if (status==1) {
                    countS++;
                    totalNodesS += nodes;
                    if(nodes<minNodesS) {
                        minNodesS = nodes;
                    }
                    if (nodes>maxNodesS) {
                        maxNodesS = nodes;
                    }
                } else { //For non-survivors
                    countNS++;
                    totalNodesNS += nodes;
                    if(nodes<minNodesNS) {
                        minNodesNS = nodes;
                    }
                    if (nodes>maxNodesNS) {
                        maxNodesNS = nodes;
                    }
                }               
            }
            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        averageS=totalNodesS/countS;
        averageNS=totalNodesNS/countNS;        
        System.out.println("Min # of nodes for patients who survived 5+ years:\t"
                            +minNodesS+"\nAve nodes # for patients who survived 5+ years:\t"
                            +oneDP.format(averageS)+"\n"+
                            "Max # nodes for patients who survived 5+ years:\t"
                            +maxNodesS+"\n\nMin # of nodes for patients who did not survive 5+ years:\t"
                            +minNodesNS+"\n"+
                            "Ave nodes # for patients who did not survive 5+ years:\t"
                            +oneDP.format(averageNS)+"\nMax # nodes for patients who did not survive 5+ years:\t"
                            +maxNodesNS+"\n");
    }
}