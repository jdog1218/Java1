/**
 * CS170
 * Gordon, Joel
 * 4/6/2017
 * 
 * IC17_FootballGame
 */
package edu.orangecoastcollege.cs170.jgordon41.ic17;

/**
 * @author jgordon41
 *
 */
public class FootballGame
{
    
    private String mHomeTeam, mVisitorTeam;
    private int mHomeScore, mVisitorScore;
    
    public FootballGame(String HomeTeam, String VisitorTeam){
        this.mHomeTeam = HomeTeam;
        this.mVisitorTeam = VisitorTeam;
        mHomeScore = 0;
        mVisitorScore = 0;
    }

    public int getHomeScore()
    {
        return mHomeScore;
    }

    public int getVisitorScore()
    {
        return mVisitorScore;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mHomeScore;
        result = prime * result + ((mHomeTeam == null) ? 0 : mHomeTeam.hashCode());
        result = prime * result + mVisitorScore;
        result = prime * result + ((mVisitorTeam == null) ? 0 : mVisitorTeam.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        FootballGame other = (FootballGame) obj;
        if (mHomeScore != other.mHomeScore) return false;
        if (mHomeTeam == null)
        {
            if (other.mHomeTeam != null) return false;
        }
        else if (!mHomeTeam.equals(other.mHomeTeam)) return false;
        if (mVisitorScore != other.mVisitorScore) return false;
        if (mVisitorTeam == null)
        {
            if (other.mVisitorTeam != null) return false;
        }
        else if (!mVisitorTeam.equals(other.mVisitorTeam)) return false;
        return true;
    }
    
    public void scoreExtraPoint(String name){
         
            if(name.equalsIgnoreCase(mHomeTeam))
                mHomeScore += 1;
            else
                mVisitorScore += 1;
        
    }
        
    public void scoreTouchDown(String name){
        
        if(name.equalsIgnoreCase(mHomeTeam))
            mHomeScore += 6;
        else
            mVisitorScore += 6;
        
    }
    public void scoreFieldGoal(String name){
         
            if(name.equalsIgnoreCase(mHomeTeam))
                mHomeScore += 3;
            else
                mVisitorScore += 3;
        
    }
    public void scoreConversion(String name){
         
            if(name.equalsIgnoreCase(mHomeTeam))
                mHomeScore += 2;
            else
                mVisitorScore += 2;
        
    }
    public void scoreSafety(String name){
         
            if(name.equalsIgnoreCase(mHomeTeam))
                mHomeScore += 1;
            else
                mVisitorScore += 1;
        
    }

    public String toString()
        {
            return "FootballGame [" + mHomeTeam + " = " + mHomeScore + ", " + mVisitorTeam + " = " + mVisitorScore + "~~~"
                    + (mHomeScore> mVisitorScore ? "Home Is WINNING!!]":"Visitors are WINNING!!]");
        }
        



}

