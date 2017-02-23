import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * Gordon, Joel
 * Cs A170
 * Febuarary 9th, 2017
 * IC #04
 */
public class TestNumberFormats {

	public static void main(String[] args) {

		// define a double varibale
		double number = 12345.6789;
		System.out.println("Original: " + number);
		// two numberFormats built into java
		// 1)currency - puts currency symbol and amount with 2 decimlas places
		// (rounds)
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Currency Format: " + currency.format(number));
		// 2) percent - multiples number by 100 and puts % symbol after it
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("Percent: " + percent.format(number));
		// 3)1 decimal place
		DecimalFormat oneDP = new DecimalFormat("#.0");
		System.out.println("1 Decimal Place: " + oneDP.format(number));
	}

}
