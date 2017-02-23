import java.util.Scanner;
/*
 * Joel Gordon
 * IC02_AverageOfThree
 * CS170
 * 2/2/2017
 */
public class AverageOfThree
{

    
    
    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        double average;
        
        System.out.println("Please Enter Number 1: ");
        //Use consoleScanner to read one integer from user
        number1= consoleScanner.nextInt();
        System.out.println("Please Enter Number 2: ");
        number2= consoleScanner.nextInt();
        System.out.println("Please Enter Number 3: ");
        number3= consoleScanner.nextInt();
        //calculate Average
        average = (number1+number2+number3)/3.0;
        System.out.println("The average of the three numbers is: "+ average);
        //always close console scanner
        consoleScanner.close();
    }
    
}
