package View;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * View.java
 * contains button to initiate the sorting process
 */

public class WestPanel extends JPanel
{
    //uninitallized attributes
    private JLabel text1;
    private JButton button1;
    
    private ArrayList<JButton> buttonArray;
     
    //contructor
    public WestPanel()
    {
        super();
        setLayout(new GridLayout(14, 0, 0, 10));
        setBackground(Color.DARK_GRAY);
         
      
        
        button1 = new JButton("Click to begin Sort");
        
        
        buttonArray = new ArrayList<>(1);
        buttonArray.add(button1);
        
        
        
        add(button1);
            
    }
    
    //getter and setter for buttonArray
    public void setButtonArray(ArrayList<JButton> buttonArray)
    {
        this.buttonArray = buttonArray;
    }
    
    public ArrayList<JButton> getButtonArray()
    {
        return buttonArray;
    }
    
    //getter and setter for button1
    public void setButton1(JButton button1)
    {
        this.button1 = button1;
    }
    
    public JButton getButton1()
    {
        return button1;
    }
    
    
}
