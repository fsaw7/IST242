package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * CenterPanel.java
 * creates centerpanel and adds it to display
 */

public class CenterPanel extends JPanel
{
    //uninitialized attributes
    private GridLayout grid;
    private ArrayList<JButton> buttonArray;
    private ArrayList<JButton> labelArray;
    private ArrayList<ArrayList<JButton>> buttonArrayArray;

    //empty constructor
    public CenterPanel()
    {
    }

    //getter and setter methods for grid attribute
    public GridLayout getGrid()
    {
        return grid;
    }

    public void setGrid(GridLayout grid)
    {
        this.grid = grid;
    }

    //getter and setter methods for buttonArray attribute
    public ArrayList<JButton> getButtonArray()
    {
        return buttonArray;
    }

    public void setButtonArray(ArrayList<JButton> buttonArray)
    {
        this.buttonArray = buttonArray;
    }

    //getter and setter methods for labelArray attribute
    public ArrayList<JButton> getLabelArray()
    {
        return labelArray;
    }

    public void setLabelArray(ArrayList<JButton> labelArray)
    {
        this.labelArray = labelArray;
    }

    //getter and setter methods for buttonArrayArray attribute
    public ArrayList<ArrayList<JButton>> getButtonArrayArray()
    {
        return buttonArrayArray;
    }

    public void setButtonArrayArray(ArrayList<ArrayList<JButton>> buttonArrayArray)
    {
        this.buttonArrayArray = buttonArrayArray;
    }
    
    //sets up the  layout based on rows as x and columns as y
    public void initializeLayout(int x, int y)
    {
        setBackground(Color.BLACK);
        grid = new GridLayout(0, y, 3, 3);
        setLayout(grid);

        labelArray = new ArrayList<>(y);
        for (int i = 0; i < y; ++i)
        {
            JButton label = new JButton();
            label.setBackground(Color.LIGHT_GRAY);
            add(label);
            labelArray.add(i, label);
        }

        buttonArrayArray = new ArrayList<>(x);
        for (int i = 0; i < x; ++i)
        {
            buttonArray = new ArrayList<>(y);
            for (int j = 0; j < y; ++j)
            {
                JButton button = new JButton();
                add(button);
                buttonArray.add(j, button);
            }

            buttonArrayArray.add(i, buttonArray);
        }
    }

    //sets text of buttons and labels based on playerData and headerNames
    public void updateLayout(ArrayList<ArrayList<String>> playerData,
            ArrayList<String> headerNames)
    {
        for (int i = 0; i < headerNames.size(); ++i)
        {
            labelArray.get(i).setText(headerNames.get(i));
        }

        for (int i = 0; i < playerData.size(); ++i)
        {
            for (int j = 0; j < playerData.get(i).size(); ++j)
            {
                buttonArrayArray.get(i).get(j).setText(playerData.get(i).get(j));
            }
        }
        validate(); //refresh
        repaint();
    }
}
