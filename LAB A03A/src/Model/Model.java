/*
 * Fatou Sawaneh
 * Lab 3
 * Due date: 2/22/2022
 * fjs5286@psu.edu
 * Model.java
 * @author fatousawaneh
 * creates the FootballPlayer object and tests and displays the results of the new methods: getAttribute(int n), getAttributes(), getAttributeName(int n), getAttributeNames()
 */
package Model;

public class Model {

    public Model() {
        FootballPlayer fp = new FootballPlayer("Marcus Allen", new Height(6, 2), 209, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.", 2, "S");
        System.out.println(fp.getAttributes().toString());
        System.out.println(fp.getAttributes().toString()); //Yes, we are running getAttributes twice just to test it
        for (int i = 0; i < fp.getAttributes().size(); i++) {
            System.out.println(i + " = " + fp.getAttributeName(i) + " - " + fp.getAttribute(i));
        }
        System.out.println(fp.getAttributeNames().toString());
        System.out.println(fp.getAttributeNames().toString()); //Yes, we are running getAttributeNames twice just to test it
        //if the implementation of TableMember by FootballPlayer is correct, 
        //the output will be
        //
        //[Marcus Allen, 6'2", 209, Upper Marlboro, MD, Dr. Henry A. Wise, 2, S]
        //[Marcus Allen, 6'2", 209, Upper Marlboro, MD, Dr. Henry A. Wise, 2, S]
        //0 = name - Marcus Allen
        //1 = height - 6'2"
        //2 = weight - 209
        //3 = hometown - Upper Marlboro, MD
        //4 = highSchool - Dr. Henry A. Wise
        //5 = number - 2
        //6 = position - S
        //[name, height, weight, hometown, highSchool, number, position]
        //[name, height, weight, hometown, highSchool, number, position]        //
    }
}
