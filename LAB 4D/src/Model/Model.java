/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * Model.java
 * Creates a FootballPlayerData object and calls the methods from that class to display information about football player
 */
package Model;


import java.util.ArrayList;

public class Model
{ 
    protected FootballPlayerData fpData = new FootballPlayerData(); // Instantiates FootballPlayer Data object
   
    public static ArrayList<ArrayList<String>> lines;

    public Model()
    { 

        
        fpData.setLinesBeingDisplayed(25);
        fpData.setFirstLineToDisplay(0);
    }
    
public FootballPlayerData getFpData(){
return fpData;
}

}

