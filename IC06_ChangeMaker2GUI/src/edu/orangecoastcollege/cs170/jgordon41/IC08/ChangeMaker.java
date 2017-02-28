package edu.orangecoastcollege.cs170.jgordon41.IC08;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * Gordon, Joel
 * CS170
 * Febuaray 13th,2017
 * 
 * IC03_ChangeMaker
 */
public class ChangeMaker extends JFrame
{

    public static void main(String[] args)
    {
        int cents = 0, quarters = 0,dimes = 0,nickels = 0, pennys = 0;
        final int QUARTER = 25,DIME = 10,NICKEL = 5,PENNY = 1;
        String message = "Enter a whole number from 1 to 99\n" + 
                "I will find a combination of coins to equal that amount of change ";
        
        String input = JOptionPane.showInputDialog(null, message, "Input", JOptionPane.QUESTION_MESSAGE);
        cents = Integer.parseInt(input);
        
        quarters = cents/QUARTER;
        cents = cents%QUARTER;
        dimes = cents/DIME;
        cents = cents%DIME;
        nickels = cents/NICKEL;
        cents = cents%NICKEL;
        pennys = cents/PENNY;
        cents = cents%PENNY;
        
        JOptionPane.showMessageDialog(null, input + " cents in coins can be given as:\n" + 
        		quarters + " quarter(s)\n" + 
        		dimes + " dime(s)\n" + 
        		nickels + " nickel(s)\n" + 
        		pennys + " penny(s)","Message", JOptionPane.INFORMATION_MESSAGE);
    }

}
