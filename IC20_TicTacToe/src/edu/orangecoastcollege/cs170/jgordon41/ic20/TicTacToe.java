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
        int row = 0,col = 0;
        do{
            printBoard();
            System.out.print("Please enter row: ");
            row = consoleScanner.nextInt()-1;
            System.out.print("Please enter column: ");
            col = consoleScanner.nextInt()-1;
            
            board[row][col] = ((moves %2) == 0 ? 'x':'o');
            moves++;
            
        
        
        }while (moves < 9 && !checkWIN(row, col, board));
        printBoard();
        consoleScanner.close();
        System.out.println(moves != 9 ? "Thanks for playing, We have a winner": "ITS A CATS GAME!");
        
    }
    
    
    public static boolean checkWIN(int x, int y, char[][] board){
    	
    	for(int i = 0; i < COLS; i++){
            if(board[x][i] != board[x][y])
                break;
            if(i == COLS-1){
                return true;
            }
        }
    	//check row
        for(int i = 0; i < COLS; i++){
            if(board[i][y] != board[x][y])
                break;
            if(i == COLS-1){
                return true;
            }
        }
        
        //check diag
        if(x == y){
            //we're on a diagonal
            for(int i = 0; i < COLS; i++){
                if(board[i][i] != board[x][y])
                    break;
                if(i == COLS-1){
                    return true;
                }
            }
        }

        //check anti diag (thanks rampion)
        if(x + y == COLS - 1){
            for(int i = 0;i<COLS;i++){
                if(board[i][(COLS-1)-i] != board[x][y])
                    break;
                if(i == COLS-1){
                    return true;
                }
            }

        }

        return false;
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
