/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * TableData.java
 * contains methods for the interface
 */

package Model;
import java.util.ArrayList;

public interface TableData
{

    public void loadTable(); // calls method to print out table

    public ArrayList getTable(); // calls method to print person ArrayList

    public ArrayList<String> getHeaders(); // calls method to print out headers

    public ArrayList<String> getLine(int line); // calls method to print out selected line 

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine); // calls method to print out selected lines

}
