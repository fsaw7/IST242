/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * InitialPanel.java
 * creates initial panel and adds it to display
 */
package View;

//import Model.Student;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InitialPanel extends JPanel { 
    private CenterPanel Cp;


    public InitialPanel()
    {
        super();
        setSize(3000, 2000);
        setVisible(true);
       setBackground(Color.darkGray);
        Cp = new CenterPanel();
        add(Cp, "Center");
           
}

    /**
     * @return cp the cp to set
     */
    public CenterPanel getCp()
    {
        return Cp;
    }

    /**
     * @param ip the cp to set
     */
    public void setcp(CenterPanel Cp)
    {
        this.Cp = Cp;
    }
    


}
