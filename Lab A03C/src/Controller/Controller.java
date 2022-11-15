
/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 3/22/2022 
 * fjs5286@psu.edu 
 * Controller.java
 * retrieves the data from each students to be displayed, and passes data to View, which will display it.
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

public class Controller {

    Model model;
    View view;
    int k = 0;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        int n1 = 0; //retrieving the info from Model
        view.displayData(model.findStudent(n1));
        int n2 = 1;
        view.displayData(model.findStudent(n2));
        int n3 = 2;
        view.displayData(model.findStudent(n3));
    }

}
