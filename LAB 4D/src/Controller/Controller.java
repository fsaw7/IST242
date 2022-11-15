/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * Controller.java
 * Receives the model and view objects in constructor, sets as attributes. Also, calls method in View with # of lines & columns to be displayed. Contains method for scrolling & highlighting method
 */
package Controller;

import Model.Model;
import View.View; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
                                                                   


public class Controller 
{
  Model model;
  View view;

public Controller(Model m, View v)
{
  model = m;
  view = v;
  view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size()); //returns the columns and attribute names
                                                                                                            
  
                                                                                                            
  
  view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); // first returns the arraylist of footballPlayers
   addScrolling();                                                                                                                                                      // second returns the arraylist of Headers 
 // first returns the arraylist of footballPlayers and headers
                                                                                                                                                      

  



}

private void addScrolling() //method for scrolling
{
    view.getIf().getIp().getCp().addMouseWheelListener(
            new MouseWheelListener()
       {    
            @Override
            public void mouseWheelMoved(MouseWheelEvent e)
            {
                int units = e.getUnitsToScroll();
                
                
                model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + units);
                
               view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); 
                          System.out.println(model.getFpData().getFirstLineToDisplay());
                
                
            }
            
    
    }
    );
    
    for(int i = 0; i< model.getFpData().getHeaders().size(); i++){ 
        int k = i;
        view.getIf().getIp().getCp().getHeaderButton().get(i).addActionListener(
        new ActionListener() //action listener to highlight selected button 
        {
        
            @Override
            public void actionPerformed(ActionEvent event)
            {
            
            if (event.getSource() == view.getIf().getIp().getCp().getHeaderButton().get(k)){
            
                // resets jbutton colors and highlights selected one yellow
                view.getIf().getIp().getCp().getHeaderButton().get(0).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(1).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(2).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(3).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(4).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(5).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(6).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(k).setBackground(Color.yellow);
            }
            
            }
        
        
        
        }
        
        );
        
        
    }
}



}

