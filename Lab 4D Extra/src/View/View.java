package View;

import java.util.ArrayList;

/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * View.java
 * passes info from controller to the methods in centerpanel
 */

public class View
{   
    //uninitialized attributes
    private InitialFrame mf;
    
    //constructor
    public View()
    {
        mf = new InitialFrame();
    }

    //getter and setter method for mf
    public InitialFrame getMf()
    {
        return mf;
    }

    public void setMf(InitialFrame mf)
    {
        this.mf = mf;
    }
 
    //sets up the center panel with given rows and columns  
    public void CenterInitialSetup(int x, int y)
    {
        mf.getIp().getCp().initializeLayout(x, y);
    }
    
    //fills center panel with player data and header names
    public void CenterUpdate(ArrayList<ArrayList<String>> playerData,
            ArrayList<String> headerNames)
    {
        mf.getIp().getCp().updateLayout(playerData, headerNames);
    }
}
