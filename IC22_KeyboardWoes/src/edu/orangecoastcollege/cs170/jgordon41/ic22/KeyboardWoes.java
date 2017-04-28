package edu.orangecoastcollege.cs170.jgordon41.ic22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardWoes
{

    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        int input = 0;
        boolean error;
        do{
	        try {
	            System.out.print("Please enter a number between 1-100: ");
	            input = consoleScanner.nextInt();
	            //if only an eception occurs, jumps straight to a catch
	            //bypasses all the code below
	            //if normal than runs correctly
	            error = (input < 0 || input > 100);   
	            
	        }catch(InputMismatchException e){
	            //inputmismatch occured; user typed text instead of number
	            //automatic error, so set error to true
	            error = true;
	            //get rid of the bogos text of the console Scanner
	            consoleScanner.nextLine();
	        }
	        if(error)
	            System.out.println("Error: input is not a number between 0 and 100.");
        }while(error);
        consoleScanner.close();
        System.out.println("The Number is " + input);
    }

}
