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

		int number = 8;
		halfTheFun(11);
		halfTheFun(2-3+2*8);
		halfTheFun(number);
		System.out.println("number = " + number);
		
	}
	
	public static void halfTheFun(int number){
	    number /= 2;
	    for (int count = 1; count <= number; count++){
	        System.out.print(count + " ");
	        
	    }
	    System.out.println();
	    
	}

}
