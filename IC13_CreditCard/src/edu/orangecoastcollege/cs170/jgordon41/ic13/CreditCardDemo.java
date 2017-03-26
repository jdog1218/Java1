/**
 * Gordon, Joel
 * CS170
 * Mar-14-2017
 * 
 * IC13_CreditCard
 */
package edu.orangecoastcollege.cs170.jgordon41.ic13;

/**
 * @author Joel
 *
 */
public class CreditCardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CardNetwork network = CardNetwork.AMEX;
		CreditCard card1 = new CreditCard(network, "Joel Gordon", "08/19", "8765343547655654", 768 );
		
		System.out.println(card1.toString());
		CreditCard card2 = new CreditCard(card1);
		
		if(card1.equals(card2)){
			System.out.println("They are the Same");
		}else
			System.out.println("They are not the Same");
		
		System.out.println(card2);

	}

}
