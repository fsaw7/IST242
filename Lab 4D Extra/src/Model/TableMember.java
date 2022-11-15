/**
 * Fatou Sawaneh 
 * Lab 5
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * TableMember.java
 * contains methods for the interface
 */
package Model;

import java.util.ArrayList;

public interface TableMember
{

    public String  getAttribute(int n); // calls method to print out football player attributes

    public ArrayList<String> getAttributes(); // calls method that created array list of football player attributes 

    public String getAttributeName(int n); // calls method to print out football player attributes name

    public ArrayList<String> getAttributeNames();// calls method that created array list of football player attributes name
}
