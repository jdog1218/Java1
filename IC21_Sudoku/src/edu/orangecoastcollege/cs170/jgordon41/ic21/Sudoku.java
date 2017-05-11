package edu.orangecoastcollege.cs170.jgordon41.ic21;

import java.util.Scanner;

public class Sudoku
{
    public static final int[][] initialPuzzle = {

            {9,0,0,8,0,5,0,0,6},

            {1,0,3,0,0,0,5,0,4},

            {0,6,0,0,2,0,0,7,0},

            {0,0,7,1,0,8,6,0,0},

            {4,0,0,0,0,0,0,0,9},

            {0,0,9,7,0,3,1,0,0},

            {0,9,0,0,1,0,0,6,0},

            {3,0,2,0,0,0,4,0,7},

            {5,0,0,3,0,2,0,0,1}

            };
    
    public static final int[][] solvedPuzzle = {

            {9,7,4,8,3,5,2,1,6},

            {1,2,3,9,6,7,5,8,4},

            {8,6,5,4,2,1,9,7,3},

            {2,3,7,1,9,8,6,4,5},

            {4,8,1,2,5,6,7,3,9},

            {6,5,9,7,4,3,1,2,8},

            {7,9,8,5,1,4,3,6,2},

            {3,1,2,6,8,9,4,5,7},

            {5,4,6,3,7,2,8,9,1}

            };
    
    public static final int ROWS = 9;
    public static final int COLS = 9;
    
    public static int[][] workingPuzzle = new int [ROWS][COLS];
    
    
    public static void resetPuzzle(){
        //reset all values of working puzzle
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                workingPuzzle[row][col] = initialPuzzle[row][col];
            }
        }
    }

    public static void printPuzzle(){
        System.out.println("  C  1  2  3  4  5  6  7  8  9");
        System.out.println("R  ---------------------------");
        
        for(int row = 0; row <ROWS; row++){
            System.out.print((row+1) + "  |");
            for(int col = 0; col < COLS; col++){
                System.out.print(" " +(workingPuzzle[row][col] == 0 ? ".": workingPuzzle[row][col]) + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean gameISWon(){
        for (int row = 0; row <ROWS; row++){
            for (int col = 0; col < COLS; col++){
                return solvedPuzzle[row][col] == workingPuzzle[row][col] ? true:false;
            }
        }
        return false;
    }

    
    
    public static void main(String[] args)
    {
        String input = "";
        Scanner consoleScanner = new Scanner(System.in);
        int row = 0;
        int col = 0;
        resetPuzzle();
        System.out.println("Sudoku Game: \n The puzzle is:");
        
        do{
            row = 0;
            col = 0;
            int valueChange = 0;
        printPuzzle();
        System.out.println("What would you like to do?");
        System.out.println("Set Square(S), Reset Puzzle (R) or Quit (Q)");
        input = consoleScanner.next().toUpperCase();
        
        switch(input){
            case "S":System.out.println("Which Row (1-9) and Column (1-9) do you want to change?)");
                        row = consoleScanner.nextInt()-1;
                        col = consoleScanner.nextInt()-1;
                    System.out.println("What should the Value (1-9) be?");
                        valueChange = consoleScanner.nextInt();
                        workingPuzzle[row][col] = valueChange;
                break;
            case "R": resetPuzzle();break;
            case "Q": System.out.println("Thanks for Playing!");break;
            default: System.out.println("Sorry i dont recognize that.");break;
        }
        }while(!input.equalsIgnoreCase("Q")&& !gameISWon());
    }
    
    

}
