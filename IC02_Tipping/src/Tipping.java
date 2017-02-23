import java.util.Scanner;
public class Tipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double billAmount, tipPercent, taxes, tipAmount, amountPaid;
		Scanner consoleScanner = new Scanner(System.in);
		
		System.out.print("Please enter the amount of resturant bill $");
		billAmount = consoleScanner.nextDouble();
		System.out.print("Please enter your tip percentage (%) ");
		tipPercent = consoleScanner.nextDouble();
		tipPercent = tipPercent/100;
		taxes = (double)Math.round((billAmount*.08)*100)/100;
		
		System.out.println("Total Tax amount are $" + taxes);
		tipAmount = (double)Math.round(((billAmount+taxes) * tipPercent)*100)/100;
		
		System.out.println("Total tip amount is $" + tipAmount);
		
		amountPaid = taxes + tipAmount + billAmount;
		System.out.println("Total amount to pay is $" + amountPaid);
	}

}
