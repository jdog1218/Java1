/**
 *Gordon, Joel
 *Mar 31, 2017
 *
 * IC15_Hangman
 */
package edu.orangecoastcollege.cs170.jgordon41.ic15;

public class Hangman {
	
	private String mDisgusedWord = "", mSecretWord;
	private int mIncorrectGuesses, mNumberOfGuesses;
	
	public Hangman(String secretWord){
		this.mSecretWord = secretWord;
		this.mNumberOfGuesses = 7;
		for(int i = 0; mSecretWord.length()-1 >= i; i++){
			
			mDisgusedWord = mDisgusedWord + "?";
		}
	}
	
	public String getDisgusedWord() {
		return mDisgusedWord;
	}
	public String getSecretWord() {
		return mSecretWord;
	}
	public int getIncorrectGuesses() {
		return mIncorrectGuesses;
	}
	public int getNumberOfGuesses() {
		return mNumberOfGuesses;
	}
	
	public String makeGuesses(char letter){
		
		StringBuilder SecretWord = new StringBuilder(mDisgusedWord);
		
		int where = mSecretWord.toLowerCase().indexOf(letter);
		
		if(where >= 0){
			 
			SecretWord.setCharAt(where, letter);
			mDisgusedWord = SecretWord.toString();
			return "Yes that was a letter " + mDisgusedWord; 
			
		}else{
			mIncorrectGuesses++;
			mNumberOfGuesses -= 1;
			return "The letter was not found, you have " + mNumberOfGuesses + " left.";
		}
	}
	
	public boolean isFound(){
		if (mDisgusedWord.indexOf('?') < 0)
			return false;
		else
			return true;
	}
	
}
