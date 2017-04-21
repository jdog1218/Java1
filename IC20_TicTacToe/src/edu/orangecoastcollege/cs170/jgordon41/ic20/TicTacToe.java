package edu.orangecoastcollege.cs170.jgordon41.ic20;

import java.util.Scanner;

public class TicTacToe
{
    final static int ROWS = 3;
    final static int COLS = 3;
    static char[][] board = new char[ROWS][COLS];
    
    public static void main(String[] args)
    {
        int moves = 0;
        Scanner consoleScanner = new Scanner(System.in);
        for (int row = 0; row < ROWS; row++){
            for(int col = 0; col < COLS; col++){
                board[row][col] = ' ';
            }
        }
        System.out.println("Welcome to Tic-Tac-Toe!");
        
        do{
            printBoard();
            System.out.print("Please enter row: ");
            int row = consoleScanner.nextInt()-1;
            System.out.print("Please enter column: ");
            int col = consoleScanner.nextInt()-1;
            
            board[row][col] = ((moves %2) == 0 ? 'x':'o');
            moves++;
            
        
        }while (moves < 9 && !checkWIN());
        
    }
    
    public static boolean checkWIN(){
        //checks for the tictac toe across everyrow
        boolean checks = false;
        for (char[] row : board){
            for (char col : row){
                if(col == 'x'){
                     
                }
            }
        }
        
        
        return checks;
    }
    
    public static void printBoard(){
        System.out.println("-------------");
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|\n-------------");
        }
    }
    

}
