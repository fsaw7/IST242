/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * View.java
 * passes info from controller to the methods in centerpanel
 */
package View;

import java.util.ArrayList;

public class View
{
    private IntialFrame IntialF;

    public View()
    {
        IntialF = new IntialFrame();
        
    }

    /**
     * @return the mf
     */
    public IntialFrame getIf()
    {
        return IntialF;
    }

    /**
     * @param mf the mf to set
     */
    public void setIf(IntialFrame iF)
    {
        this.IntialF = iF;
    } 
    


public void CenterInitialSetup(int linesbeingDsiplayed, int headers){  //takes parameters from controller and puts them in createdisplay
    
    IntialF.getIp().getCp().createDisplay(linesbeingDsiplayed, headers);
    
          
}


public void CenterUpdate (ArrayList<ArrayList<String>> footballPlayers, ArrayList<String>  headers){ //takes parameters from controller and puts them in buttonInfo
    
    IntialF.getIp().getCp().buttonInfo(footballPlayers,headers);
   
}
}
