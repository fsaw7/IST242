/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * CenterPanel.java
 * creates centerpanel and adds it to display
 */
package View;

import Model.Model;
import Model.FootballPlayer;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class CenterPanel extends JPanel
{
    int rows, columns;
    private ArrayList<JButton> footballPlayer = new ArrayList<>();
    private ArrayList<JButton> headerButton = new ArrayList<>();
    public CenterPanel()
    {
        super();
        
        setBackground(Color.black);
      
    }

    
public void createDisplay(int columns1, int rows1){   // this takes in width and height for grid
                                                                
                                      
                                 
        columns = columns1;
        rows = rows1;   
        int gridColumns = columns + 1;                        
            
           
            GridLayout panel = new GridLayout(gridColumns,rows,3,3); 
            for (int i = 0; i<rows; i++){
                JButton headerButtons = new JButton();
                getHeaderButton().add(headerButtons); 
                add(headerButtons);
            }
            
            for(int k=0; k<columns*rows; k++){               // the amount of footbal buttons will be rows*columns 
                JButton footballButtons = new JButton();            
                getFootballPlayer().add(footballButtons);  
                add(footballButtons);
       }
            
          setLayout(panel);       
}

public void buttonInfo(ArrayList<ArrayList<String>> footballPlayers, ArrayList<String>  headers){   // passes the attributeNames arrayList and the footballPlayer arrayList 
                                                      

       int j = 0; 
        
       for(int k = 0; k<columns; k++){ 

            for(int i =0; i < rows; i++){
               
              
                getHeaderButton().get(i); 
                getHeaderButton().get(i).setText(headers.get(i));
                getHeaderButton().get(i).setPreferredSize(new Dimension(150, 35));
              
              
                getFootballPlayer().get(j);
                getFootballPlayer().get(j).setText(footballPlayers.get(k).get(i));
                getFootballPlayer().get(j).setPreferredSize(new Dimension(150, 35));
               
               j++;                                
              
           } 
       }
   }

    /**
     * @return the footballPlayer
     */
    public ArrayList<JButton> getFootballPlayer() {
        return footballPlayer;
    }

    /**
     * @param footballPlayer the footballPlayer to set
     */
    public void setFootballPlayer(ArrayList<JButton> footballPlayer) {
        this.footballPlayer = footballPlayer;
    }

    /**
     * @return the headerButton
     */
    public ArrayList<JButton> getHeaderButton() {
        return headerButton;
    }

    /**
     * @param headerButton the headerButton to set
     */
    public void setHeaderButton(ArrayList<JButton> headerButton) {
        this.headerButton = headerButton;
    }
    
}  
