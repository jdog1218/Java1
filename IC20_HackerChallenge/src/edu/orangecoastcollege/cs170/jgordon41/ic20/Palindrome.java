package edu.orangecoastcollege.cs170.jgordon41.ic20;

import java.util.Scanner;

/* 
 * Gordon, Joel
 * cs170
 * 4/18/2017
 * 
 * IC20_Palindrome
 */

public class Palindrome
{

    public static void main(String[] args)
    {
        String word= "", reversedWord = "";
        Scanner consoleScanner = new Scanner(System.in);
        String copyWord = "";
        
        do{
            
            System.out.print("Please enter word or phrase to see if it's a palindrome (type quit to end the program):");
            word = consoleScanner.nextLine();
            if(word.equalsIgnoreCase("quit"))
                break;
            copyWord = word;
            word = word.replaceAll("[\\W]", "");
            for(int i = word.length()-1;i >= 0; i--){
                reversedWord += word.charAt(i);
            }
            if(reversedWord.equalsIgnoreCase(word))
                System.out.println(copyWord +  " is a Palindrome.\n");
            else
                System.out.println(copyWord + " is not a Palindrome\n");
            reversedWord = "";
        }while(!word.equalsIgnoreCase("quit"));
        System.out.println("Thank You, Goodbye");
        consoleScanner.close();
    }

}
