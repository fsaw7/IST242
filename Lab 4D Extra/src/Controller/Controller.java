/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * Controller,java
 * Receives the model and view objects in constructor, sets as attributes. Also, calls method in View with # of lines & columns to be displayed. 
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;

                                                                   


public class Controller
{

    //class attributes
    private Model model;
    private View view;

    //constructor
    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(),
                model.getFpData().getHeaders().size());
        view.CenterUpdate(
                model.getFpData().getLines(
                        model.getFpData().getFirstLineToDisplay(),
                        model.getFpData().getLastLineToDisplay()),
                model.getFpData().getHeaders());
        addListeners();
    }

    //getter and setter methods for model
    public Model getModel()
    {
        return this.model;
    }

    public void setModel(Model inf_model)
    {
        this.model = inf_model;
    }

    //getter and setter methods for view
    public View getView()
    {
        return view;
    }

    public void setView(View inf_view)
    {
        this.view = inf_view;
    }

    //method to add various listeners to view using inner listener
    private void addListeners()
    {
       //for scrolling
        view.getMf().getIp().getCp().addMouseWheelListener(
                new MouseWheelListener()
                {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e)
            {
                //if the scroll is out of bounds
                if (((e.getUnitsToScroll() < 0) && ((model.getFpData().getFirstLineToDisplay() + e.getUnitsToScroll()) < 0))
                        || ((e.getUnitsToScroll() > 0) && ((model.getFpData().getLastLineToDisplay() + e.getUnitsToScroll())
                        > (model.getFpData().getTable().size() - 1))))
                //do nothing    
                {}
                
                //else the scroll is inbounds 
                else
                {
                    //update lines to display based on scroll and update CenterPanel
                    model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + e.getUnitsToScroll());
                    model.getFpData().setLastLineToDisplay(model.getFpData().getLastLineToDisplay() + e.getUnitsToScroll());
                    view.CenterUpdate(
                            model.getFpData().getLines(
                                    model.getFpData().getFirstLineToDisplay(),
                                    model.getFpData().getLastLineToDisplay()),
                            model.getFpData().getHeaders());

                 
                    
                }
            }
        });

        //labels the array buttons in Center Panel
        for (int i = 0; i < view.getMf().getIp().getCp().getLabelArray().size(); ++i)
        {
            int arrayPosition = i;
            view.getMf().getIp().getCp().getLabelArray().get(i).addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    
                    if (view.getMf().getIp().getCp().getLabelArray().get(arrayPosition).getBackground() == Color.LIGHT_GRAY)
                    {
                        view.getMf().getIp().getCp().getLabelArray().get(arrayPosition).setBackground(Color.DARK_GRAY);
                        view.getMf().getIp().getCp().getLabelArray().get(arrayPosition).setForeground(Color.WHITE);

                        model.getFpData().setSortField(arrayPosition);

                     
                        if (model.getFpData().getSortType() != -1)
                        {
                            model.getFpData().sort(model.getFpData().getSortType(), model.getFpData().getSortField());
                            view.CenterUpdate(
                                    model.getFpData().getLines(
                                            model.getFpData().getFirstLineToDisplay(),
                                            model.getFpData().getLastLineToDisplay()),
                                    model.getFpData().getHeaders());

                          
                            
                        }

                        //reset the text and background of all other labels
                        for (int j = 0; j < view.getMf().getIp().getCp().getLabelArray().size(); ++j)
                        {
                            if (arrayPosition != j) {
                                view.getMf().getIp().getCp().getLabelArray().get(j).setBackground(Color.LIGHT_GRAY);
                                view.getMf().getIp().getCp().getLabelArray().get(j).setForeground(Color.BLACK);
                            }
                        }           
                    } 
                    //if the button is already pressed reset everything
                    else if (view.getMf().getIp().getCp().getLabelArray().get(arrayPosition).getBackground() == Color.DARK_GRAY)
                    {
                        view.getMf().getIp().getCp().getLabelArray().get(arrayPosition).setBackground(Color.LIGHT_GRAY);
                        view.getMf().getIp().getCp().getLabelArray().get(arrayPosition).setForeground(Color.BLACK);

                        int temp = model.getFpData().getSortType();
                        model = new Model();
                        model.getFpData().setSortType(temp);
                        view.CenterUpdate(
                                model.getFpData().getLines(
                                        model.getFpData().getFirstLineToDisplay(),
                                        model.getFpData().getLastLineToDisplay()),
                                model.getFpData().getHeaders());
                        
                    }
                }
            });
        }

        //action listener for WestPanel to sort 
        
        for (int i = 0; i < view.getMf().getIp().getWp().getButtonArray().size(); ++i)
        {
            int arrayPosition = i;
            view.getMf().getIp().getWp().getButtonArray().get(i).addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (view.getMf().getIp().getWp().getButtonArray().get(arrayPosition).getBackground() == new JButton().getBackground())
                    {
                        view.getMf().getIp().getWp().getButtonArray().get(arrayPosition).setBackground(Color.darkGray);
                        view.getMf().getIp().getWp().getButtonArray().get(arrayPosition).setForeground(Color.white);
                        model.getFpData().setSortType(arrayPosition);

                        for (int j = 0; j < view.getMf().getIp().getWp().getButtonArray().size(); ++j)
                        {
                            if (arrayPosition != j)
                            {
                                view.getMf().getIp().getWp().getButtonArray().get(j).setBackground(new JButton().getBackground());
                                view.getMf().getIp().getWp().getButtonArray().get(j).setForeground(new JButton().getForeground());
                            }
                        }
                    } 
                    else if (view.getMf().getIp().getWp().getButtonArray().get(arrayPosition).getBackground() != new JButton().getBackground())
                    {
                        view.getMf().getIp().getWp().getButtonArray().get(arrayPosition).setBackground(new JButton().getBackground());
                        view.getMf().getIp().getWp().getButtonArray().get(arrayPosition).setForeground(new JButton().getForeground());

                        model.getFpData().setSortType(-1);
                    }
                }
            });
        }

    }

    
    }

    

