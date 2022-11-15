package View;

import java.awt.*;
import javax.swing.*;

/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * InitialPanel.java
 * creates initial panel and adds it to display
 */

public class InitialPanel extends JPanel
{ 
    //uninitialized attributes
    private CenterPanel CenterPanel;
    private WestPanel WestPanel;
    
    
    //constructor
    public InitialPanel()
    {
        super();
   
        //setting borderLayout for this panel makes the CenterPanel resizable
        setLayout(new BorderLayout());
        
        CenterPanel = new CenterPanel();
        WestPanel = new WestPanel();
       
        
        add(CenterPanel, BorderLayout.CENTER);
        add(WestPanel, BorderLayout.WEST);
       
    }
    
    //getter and setter methods for CenterPanel
    public CenterPanel getCp()
    {
        return CenterPanel;
    }

    public void setCp(CenterPanel CenterPanel)
    {
        this.CenterPanel = CenterPanel;
    }
    
    //getter and setter methods for WestPanel
    public WestPanel getWp()
    {
        return WestPanel;
    }
    
    public void setWp(WestPanel WestPanel)
    {
        this.WestPanel = WestPanel;
    }
    
    
}
