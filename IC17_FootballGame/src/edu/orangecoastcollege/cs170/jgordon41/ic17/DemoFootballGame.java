package edu.orangecoastcollege.cs170.jgordon41.ic17;

import java.util.Scanner;

public class DemoFootballGame
{

    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Please enter home team Name: ");
        String home = consoleScanner.nextLine();
        System.out.print("Please enter visitor team Name: ");
        String visitor = consoleScanner.nextLine();
        FootballGame game1 = new FootballGame(home, visitor);
        
        int input;
        
        do{
            System.out.print("\nEnter Scoring Event (or -1 to end game):\n" + 
                                "1) To score touchdown" + 
                                "\n2) To score extra point" + 
                                "\n3) To score conversion" +
                                "\n4) To score field goal" + 
                                "\n5) To score safety\n\n>>");
            input = consoleScanner.nextInt();
            if(input == -1)
                break;
            System.out.print("Enter Team: " + 
                                "\n\n1) For " + home + " (home)" + 
                                "\n2) For " + visitor + " (visitor)\n\n>>");
            String choice = consoleScanner.nextInt() == 1 ? home:visitor;
            
            switch(input){
                case 1: game1.scoreTouchDown(choice);break; 
                case 2: game1.scoreExtraPoint(choice);break;
                case 3: game1.scoreConversion(choice);break;
                case 4: game1.scoreFieldGoal(choice);break;
                case 5: game1.scoreSafety(choice);break;
            }
            
            
            System.out.println(game1);
            
        }while(true);
        consoleScanner.close();
        
        if(game1.getHomeScore() > game1.getVisitorScore()){
            System.out.println("\n\nThe " + home + " WON!!!!");
        }else if(game1.getHomeScore() == game1.getVisitorScore()){
            System.out.println("\n\nWe have a Tie");
        }else
            System.out.println("\n\nThe " + visitor + " WON!!!!");;
        
    }

}
