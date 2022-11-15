
/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 3/22/2022 
 * fjs5286@psu.edu 
 * View.java
 * Will display the text data that it will receive from Controller
 */
package View;

import java.util.ArrayList;
import javax.swing.JButton;
import Model.Student;

public class View {

    public View() {

    }

    public void displayData(Student sts) { // method to display data from Controller
        System.out.println(sts.getInfo());
    }
}
