/**
 *Gordon, Joel
 *Mar 31, 2017
 *
 * IC15_Hangman
 */
package edu.orangecoastcollege.cs170.jgordon41.ic15;

public class Hangman {
	
	private String mDisgusedWord, mSecretWord;
	private int mIncorrectGuesses, mNumberOfGuesses =6;
	
	public Hangman(String secretWord){
		this.mSecretWord = secretWord;
		
		for(int i = 0; mSecretWord.length() >= i; i++){
			
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
			return "Yes that was a letter " + SecretWord; 
			
		}else{
			mIncorrectGuesses++;
			mNumberOfGuesses--;
			return "The letter was not found, you have " + mNumberOfGuesses + " left.";
		}
	}
	
	public boolean isFound(){
		if (mSecretWord.indexOf('?') < 0)
			return true;
		else
			return false;
	}
	
}
