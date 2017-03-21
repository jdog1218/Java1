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
public class CreditCard {

	CardNetwork network;
	String mCardHolder, mExpiration, mNumber;
	int mSecCode;
	
	/**
	 * @CreditCard
	 * @param
	 */
	public CreditCard(CardNetwork network, String cardHolder, String expiration, String number, int secCode) {
		this.network = network;
		this.mCardHolder = cardHolder;
		this.mExpiration = expiration;
		this.mNumber = number;
		this.mSecCode = secCode;
	}
	public CreditCard (CreditCard obj){
		
		
		this.network = obj.getNetwork();
		this.mCardHolder = obj.getCardHolder();
		this.mExpiration = obj.getExpiration();
		this.mNumber = obj.getNumber();
		this.mSecCode = obj.mSecCode;
	}

	public String getCardHolder() {
		return mCardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.mCardHolder = cardHolder;
	}

	public CardNetwork getNetwork() {
		return network;
	}

	public String getExpiration() {
		return mExpiration;
	}

	public String getNumber() {
		return mNumber;
	}

	
	public boolean equals(CreditCard other){
		if(mCardHolder.equalsIgnoreCase(other.getCardHolder())){
			return true;
		}
		if(mNumber == other.getNumber()){
			return true;
		}
		if(mExpiration == other.getExpiration())
			return true;
		return false;
	}
	
	public String toString(){
		return "Credit Card [" + this.getNetwork() + ", ************" + mNumber.substring(12) + ", " + this.getCardHolder() + ", " + this.getExpiration() + "]";
	}
	
	
	
}
