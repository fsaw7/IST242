package Model;

/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * Model.java
 * Creates a FootballPlayerData object and calls the methods from that class to display information about football player
 */


public class Model
{ 
    //uninitialized attributes
    private FootballPlayerData fpData;
    
    //constructor
    public Model()
    {
        fpData = new FootballPlayerData();
    }
    
    //getter and setter method for fpData
    public FootballPlayerData getFpData()
    {
        return fpData;
    }
    
    public void setFpData(FootballPlayerData fpData)
    {
        this.fpData = fpData;
    }
}
