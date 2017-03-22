package edu.orangecoastcollege.cs170.jgordon41.ic15;

/*
 * Gordon, Joel
 * cs170
 * March 21st, 2017
 * 
 * IC14_GradeDistribution
 */

public class GradeDistribution
{

    private int mNumberAs,mNumberBs,mNumberCs,mNumberDs,mNumberFs;

    public GradeDistribution(int mNumberAs, int mNumberBs, int mNumberCs, int mNumberDs, int mNumberFs)
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

    public int getNumberAs()
    {
        return mNumberAs;
    }

    public int getNumberBs()
    {
        return mNumberBs;
    }

    public int getNumberCs()
    {
        return mNumberCs;
    }

    public int getNumberDs()
    {
        return mNumberDs;
    }

    public int getNumberFs()
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
    
    public int getNumberOfGrades(){
    	int result = 0;
    	result += mNumberAs;
    	result += mNumberBs;
    	result += mNumberCs;
    	result += mNumberDs;
    	result += mNumberFs;
    	
    	return result;
    }
    
}
