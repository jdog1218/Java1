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
    private String mDireactor, mName, mMPAARating;
    
    public Movie()
    {
        
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
		return mDireactor;
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
		this.mDireactor = mDireactor;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public void setMPAARating(String mPAARating) {
		this.mMPAARating = mPAARating;
	}

	public boolean equals(Movie other){
		if (other.mBadNumber == mBadNumber)
			if(other.mDireactor.equalsIgnoreCase(mDireactor))
				if(other.mExcellentNumber == mExcellentNumber)
					if(other.mGoodNumber == mGoodNumber)
						if(other.mMPAARating == mMPAARating)
							if(other.mName.equalsIgnoreCase(mName))
								if(other.mOkNumber == mOkNumber)
									if(other.mTerriableNumber == mTerriableNumber)
										return true;
		return false;
	}
	
}
