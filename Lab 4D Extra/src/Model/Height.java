package Model;

/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * Height.java
 * Used by the Student class
 */

public class Height
{
    // attributes
    private int feet;
    private int inches;

    //constructor that takes parameters and assigns to class attributes
    public Height(int inf_feet, int inf_inches)
    {
        feet = inf_feet;
        inches = inf_inches;
    }

    //empty constructor that assigns no parameters but initializes attributes
    public Height()
    {
        feet = 0;
        inches = 0;
    }
    
    //getter and setter methods for feet attribute
    public int getFeet()
    {
        return feet;
    }

    public void setFeet(int inf_feet)
    {
        feet = inf_feet;
    }
    
    //getter and setter methods for inches attribute
    public int getInches()
    {
        return inches;
    }

    public void setInches(int inf_inches)
    {
        inches = inf_inches;
    }

    //gets height in the form of a string
    //may be redundant with toString() method below
    public String getHeight()
    {
        String heightString = feet + " feet" + ", " + inches + " inches";
        return heightString;
    }

    //gets height in the form of the total numbers of inches
    public int getTotalInches()
    {
        int totalInches = (feet * 12) + inches;
        return totalInches;
    }
    
    //Overrides object class to return object data as string
    @Override
    public String toString()
    {
        String toString = feet + "'" + inches + "\"";
        return toString;
        
    }

}
