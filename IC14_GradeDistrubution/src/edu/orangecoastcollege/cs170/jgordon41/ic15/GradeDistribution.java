package edu.orangecoastcollege.cs170.jgordon41.ic15;

import java.text.DecimalFormat;

/*
 * Gordon, Joel
 * cs170
 * March 21st, 2017
 * 
 * IC14_GradeDistribution
 */

public class GradeDistribution
{

    private double mNumberAs,mNumberBs,mNumberCs,mNumberDs,mNumberFs;

    public GradeDistribution(double mNumberAs, double mNumberBs, double mNumberCs, double mNumberDs, double mNumberFs)
    {
        this.mNumberAs = mNumberAs;
        this.mNumberBs = mNumberBs;
        this.mNumberCs = mNumberCs;
        this.mNumberDs = mNumberDs;
        this.mNumberFs = mNumberFs;
    }
    
    public GradeDistribution(GradeDistribution obj)
    {
        this.mNumberAs = obj.mNumberAs;
        this.mNumberBs = obj.mNumberBs;
        this.mNumberCs = obj.mNumberCs;
        this.mNumberDs = obj.mNumberDs;
        this.mNumberFs = obj.mNumberFs;
    }

    public double getNumberAs()
    {
        return mNumberAs;
    }

    public double getNumberBs()
    {
        return mNumberBs;
    }

    public double getNumberCs()
    {
        return mNumberCs;
    }

    public double getNumberDs()
    {
        return mNumberDs;
    }

    public double getNumberFs()
    {
        return mNumberFs;
    }

    public void setNumberAs(int mNumberAs)
    {
        this.mNumberAs = mNumberAs;
    }

    public void setNumberBs(int mNumberBs)
    {
        this.mNumberBs = mNumberBs;
    }

    public void setNumberCs(int mNumberCs)
    {
        this.mNumberCs = mNumberCs;
    }

    public void setNumberDs(int mNumberDs)
    {
        this.mNumberDs = mNumberDs;
    }

    public void setNumberFs(int mNumberFs)
    {
        this.mNumberFs = mNumberFs;
    }

    public void setAllGrades(int number){
    	this.mNumberAs = number;
        this.mNumberBs = number;
        this.mNumberCs = number;
        this.mNumberDs = number;
        this.mNumberFs = number;
    }

    
    public boolean equals(GradeDistribution obj)
    {
        if (mNumberAs == obj.mNumberAs) return true;
        if (mNumberBs == obj.mNumberBs) return true;
        if (mNumberCs == obj.mNumberCs) return true;
        if (mNumberDs == obj.mNumberDs) return true;
        if (mNumberFs == obj.mNumberFs) return true;
        return false;
    }
    
    public String toString(){
    	String result = "";
    	
    	for(int i = 1; i <= mNumberAs; i++)
    		result += "*";
    	result += " A\n";
    	for(int i = 1; i <= mNumberBs; i++)
    		result += "*";
    	result += " B\n";
    	for(int i = 1; i <= mNumberCs; i++)
    		result += "*";
    	result += " C\n";
    	for(int i = 1; i <= mNumberDs; i++)
    		result += "*";
    	result += " D\n";
    	for(int i = 1; i <= mNumberFs; i++)
    		result += "*";
    	result += " F\n";
    	
    	
    	return result;
    	
    }
    /*
     * @perameter whichGrade Type which grade is needed to be calculated out of the total number of grades
     */
    public double getPercent(String whichGrade){
    	
    	switch(whichGrade){
    	case "a": return (this.mNumberAs/this.getNumberOfGrades()*100);
    	case "b": return (this.mNumberBs/this.getNumberOfGrades()*100);
    	case "c": return (this.mNumberCs/this.getNumberOfGrades()*100);
    	case "d": return (this.mNumberDs/this.getNumberOfGrades()*100);
    	case "e": return (this.mNumberFs/this.getNumberOfGrades()*100);
    	default : return 0.0;
    	}
    }
    
    public double getNumberOfGrades(){
    	double result = 0;
    	result += mNumberAs;
    	result += mNumberBs;
    	result += mNumberCs;
    	result += mNumberDs;
    	result += mNumberFs;
    	
    	return result;
    }
    
public String getPercentAs(){
	DecimalFormat ZeroDp = new DecimalFormat("#");
	
	return ZeroDp.format(this.getPercent("a")) + "%";
}
    
public String getPercentBs(){
	DecimalFormat ZeroDp = new DecimalFormat("#");
	
	return ZeroDp.format(this.getPercent("b")) + "%";
}

public String getPercentCs(){
	DecimalFormat ZeroDp = new DecimalFormat("#");
	
	return ZeroDp.format(this.getPercent("c")) + "%";
}

public String getPercentDs(){
	DecimalFormat ZeroDp = new DecimalFormat("#");
	
	return ZeroDp.format(this.getPercent("d")) + "%";
}

public String getPercentFs(){
	DecimalFormat ZeroDp = new DecimalFormat("#");
	
	return ZeroDp.format(this.getPercent("f")) + "%";
}
}
