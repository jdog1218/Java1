package edu.orangecoastcollege.cs170.jgordon41.ic15;
/**
 * Gordon, Joel
 * CS170
 * Mar-21-2017
 * 
 * IC15_Movie
 */

public class Movie
{

    private int mBadNumber, mExcellentNumber, mOkNumber, mTerriableNumber, mGoodNumber;
    private String mDirector, mName, mMPAARating;

	public Movie(int mBadNumber, int mExcellentNumber, int mOkNumber, int mTerriableNumber, int mGoodNumber,
			String mDireactor, String mName, String mMPAARating) {
		this.mBadNumber = mBadNumber;
		this.mExcellentNumber = mExcellentNumber;
		this.mOkNumber = mOkNumber;
		this.mTerriableNumber = mTerriableNumber;
		this.mGoodNumber = mGoodNumber;
		this.mDirector = mDireactor;
		this.mName = mName;
		this.mMPAARating = mMPAARating;
	}
	public Movie(Movie other){
		this.mBadNumber = other.mBadNumber;
		this.mExcellentNumber = other.mExcellentNumber;
		this.mOkNumber = other.mOkNumber;
		this.mTerriableNumber = other.mTerriableNumber;
		this.mGoodNumber = other.mGoodNumber;
		this.mDirector = other.mDirector;
		this.mName = other.mName;
		this.mMPAARating = other.mMPAARating;
	}

	public int getBadNumber() {
		return mBadNumber;
	}

	public int getExcellentNumber() {
		return mExcellentNumber;
	}

	public int getGoodNumber(){
		return mGoodNumber;
	}
	
	public int getTerriableNumber() {
		return mTerriableNumber;
	}

	public String getDireactor() {
		return mDirector;
	}

	public String getName() {
		return mName;
	}

	public String getMPAARating() {
		return mMPAARating;
	}

	public void setExcellentNumber(int mExcellentNumber) {
		this.mExcellentNumber = mExcellentNumber;
	}

	public void setDireactor(String mDireactor) {
		this.mDirector = mDireactor;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public void setMPAARating(String mPAARating) {
		this.mMPAARating = mPAARating;
	}

	public boolean equals(Movie other){
		if (other.mBadNumber == mBadNumber)
			if(other.mDirector.equalsIgnoreCase(mDirector))
				if(other.mExcellentNumber == mExcellentNumber)
					if(other.mGoodNumber == mGoodNumber)
						if(other.mMPAARating == mMPAARating)
							if(other.mName.equalsIgnoreCase(mName))
								if(other.mOkNumber == mOkNumber)
									if(other.mTerriableNumber == mTerriableNumber)
										return true;
		return false;
	}
	
	public String toString(){
		return  "Movie [Name=" + mName + ", Director=" + mDirector + ", MPAA Rating=" + mMPAARating + 
				", Average Rating=" + this.getAverageRating() + "]";
	}
	
	public double getAverageRating(){
		return 0.0;
	}
	
	
	
}
