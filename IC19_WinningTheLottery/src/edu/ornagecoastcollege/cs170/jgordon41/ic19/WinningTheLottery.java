package edu.ornagecoastcollege.cs170.jgordon41.ic19;

import java.util.Random;

/*
 * Gordon, Joel
 * cs170
 * 4/13/2017
 * 
 * IC19
 */

public class WinningTheLottery
{

    public static void main(String[] args)
    {
        int[] winningNumbers = new int[5];
        int[] guessNumbers = new int[winningNumbers.length -1];
        Random rng = new Random();
        int digitsCorrect = 0;
        int moneySpent = 1;
        
        for(int i = 0; i < winningNumbers.length; i++){
            winningNumbers[i] = rng.nextInt(36)+1;
            System.out.print(winningNumbers[i] + " ");
        }
        do{
            moneySpent++;
            digitsCorrect = 0;
            for(int i = 0; i < guessNumbers.length; i++){
                guessNumbers[i] = rng.nextInt(36)+1;
                if(guessNumbers[i] == winningNumbers[i]){
                    digitsCorrect++;
                }
            }
        }while(digitsCorrect < 5);
        
        System.out.println("Money Spent: $" + moneySpent);
        
    }

}
