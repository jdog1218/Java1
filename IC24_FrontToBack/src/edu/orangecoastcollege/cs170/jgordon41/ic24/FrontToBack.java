package edu.orangecoastcollege.cs170.jgordon41.ic24;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Gordon,Joel
 * CS A170
 * May 11, 2017
 * IC #24 Front To Back
 */
public class FrontToBack
{
    //check OCCities enum for printing with beginning capital
    public static void main(String[] args)
    {
        //Extinction is the rule. Survival is the exception.
        
        String line;        
        
        try {
            Scanner fileScanner = new Scanner(new File("Input.txt"));
            PrintWriter fileWriter = new PrintWriter("Output.txt"); 
            while(fileScanner.hasNextLine()) {
            
                line = fileScanner.nextLine();                
                String[] words = line.split(" "); //Gives back an array of strings
                              
                String reverseLine = "";
                
                for(int i = words.length-1; i >= 0; i--) {
                  reverseLine += words[i].replace(".","")+" ";
                  
                  
                  
                }
                 System.out.println(reverseLine);
                fileWriter.println(reverseLine);
            }
            fileScanner.close();
            fileWriter.close();              
        }
        catch (IOException e) {
            System.out.println("File not found");
        }       
    }
}