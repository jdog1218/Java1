/**
 * Gordon, Joel
 * CS170
 * Mar-16-2017
 * 
 * IC13_RatingScore
 */
package edu.orangecoastcollege.cs170.jgordon41.ic13;

import java.text.DecimalFormat;

public class RatingScore {

	private String mDescription, mComments;
	private double mRating, mMaximumRating;
	private DecimalFormat m2Dp;
	
	
	public RatingScore(String mDescription, String mComments, int mRating, int mMaximumRating) {
		this.mDescription = mDescription;
		this.mComments = mComments;
		this.mRating = mRating;
		this.mMaximumRating = mMaximumRating;
		this.m2Dp = new DecimalFormat("#.00");
	}

	public RatingScore(RatingScore otherScore) {
		this.mDescription = otherScore.getDescription();
		this.mComments = otherScore.getComments();
		this.mMaximumRating = otherScore.getMaximumRating();
		this.mRating = otherScore.getRating();
		this.m2Dp = new DecimalFormat("#.00");
	}
	
	public String getDescription() {
		return mDescription;
	}


	
	public void setDescription(String mDescription) {
		this.mDescription = mDescription;
	}


	
	public String getComments() {
		return mComments;
	}


	
	public void setComments(String mComments) {
		this.mComments = mComments;
	}


	
	public double getRating() {
		return mRating;
	}


	
	public void setRating(double mRating) {
		this.mRating = mRating;
	}


	
	public double getMaximumRating() {
		return mMaximumRating;
	}


	
	public void setMaximumRating(double mMaximumRating) {
		this.mMaximumRating = mMaximumRating;
	}


	public boolean equals(RatingScore obj) {
		
		if(mDescription.equalsIgnoreCase(obj.getDescription()))
				if(mComments.equalsIgnoreCase(obj.getComments()))
					if (mRating == obj.getRating()) 
						if(mMaximumRating == obj.getMaximumRating())
							return true;
		
			return false;
	}



	public String toString(){
		return "Rating Score [" + mDescription + ", " + m2Dp.format(mRating) + ", " + m2Dp.format(mMaximumRating) + ", " + mComments + ".]";
	}
}
