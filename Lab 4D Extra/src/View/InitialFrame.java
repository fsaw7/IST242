/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * InitialFrame.java
 * creates initial frame and adds it to display
 */
package View;


import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class InitialFrame extends JFrame
{ 
    //uninitialized attributes
    private InitialPanel ip;
    
    //constructor
    public InitialFrame()
    {
        super("Honors Project");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip, "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 720);
        setVisible(true);
    }

    private void setupLayoutForMacs()
    {
        //On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }

    //getter and setter for ip
    public InitialPanel getIp()
    {
        return ip;
    }

    public void setIp(InitialPanel ip)
    {
        this.ip = ip;
    }
}
