import java.text.DecimalFormat;
import java.util.Scanner;

public class BasalMetaBolicRate
{
    
    public static void main(String[] args)
    {
        Scanner consoleScanner = new Scanner (System.in);
        DecimalFormat oneDP = new DecimalFormat("#.0");
        DecimalFormat zeroDP = new DecimalFormat("#");
        
        double weight,height, age;
        double caloriesMale, caloriesFemale, barsFemale, barsMale;//must use Rounding method
        final double CALORIES_PER_BAR = 230;
        
        System.out.print("Please enter your weight (lb): ");
        weight = consoleScanner.nextDouble();
        System.out.print("Please enter your height (in): ");
        height = consoleScanner.nextDouble();
        System.out.print("Please enter your age: ");
        age = consoleScanner.nextDouble();
        
        caloriesFemale = 655 + (4.35*weight)+(4.7*height)-(4.7*age);//remeber to Round for final value
        caloriesMale = 66 + (6.23*weight)+(12.7*height)-(6.8*age);
        
        System.out.println("\nBmr (female): " + zeroDP.format(caloriesFemale) + " calories");
        System.out.println("Bmr (male): " + zeroDP.format(caloriesMale) + " calories");
        
        barsFemale = caloriesFemale / CALORIES_PER_BAR;
        barsMale = caloriesMale / CALORIES_PER_BAR;
        
        System.out.println("\nIf you are female, you need to consume " + oneDP.format(barsFemale) + " chocolate bars to maintain weight.");
        System.out.println("If you are male, you need to consume " + oneDP.format(barsMale) + " chocolate bars to maintain weight.");
        consoleScanner.close();
    }

}
