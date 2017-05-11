package edu.orangecoastcollege.cs170.jgordon41.ic23;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;
/*
 * Gordon,Joel
 * CS A170
 * May 9, 2017
 * IC #23 Presidential Donations
 */
public class PresidentialDonations{	
	public static void displayDonations(String candidateName, String fileName) {
		
        double dollasMakeYaHolla=0.0, averageJoeDaPlumber;
        int numberOfSuckas=0, maxSucka=Integer.MIN_VALUE, minSucka=Integer.MAX_VALUE, donation;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        try{
            Scanner fileScanner = new Scanner(new File(fileName));            
                while (fileScanner.hasNextInt()) {
            //Reads 1 int from file AND moves down 1 line
            donation = fileScanner.nextInt();
            dollasMakeYaHolla += donation;
            numberOfSuckas++;            
            if(donation>maxSucka) {
                maxSucka = donation;
            }            
            if(donation<minSucka) {
                minSucka = donation;
            	}            
            }
            averageJoeDaPlumber = dollasMakeYaHolla/numberOfSuckas;
            System.out.println("For candidate: " 
                                +candidateName+"\nTotal contributions:\t"
                                +currency.format(dollasMakeYaHolla)+
                                "\nAverage donation:\t"+currency.format(averageJoeDaPlumber)+
                                "\nMax Contribution:\t"+currency.format(maxSucka)+
                                "\nMin Contribution:\t"+currency.format(minSucka)+
                                "\nTotal Contributors:\t"+numberOfSuckas+"\n");
            fileScanner.close();            
            }        
        catch (IOException e) {
           System.out.println("File is not found: "+fileName); 
        }
	}
	
    public static void main(String[] args)
    {     
    	displayDonations("Hillary Clinton","clinton2016donations.txt");
    	displayDonations("The Donald","trump2016donations.txt");
    }
}
