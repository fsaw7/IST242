package Model;

import java.util.ArrayList;

/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 2/22/2022 
 * fjs5286@psu.edu 
 * FootballPlayer.java
 * Contains the the attributes of the football player: number and position. Also contains the String toString() method. Also implements the four methods from the interface TableMember
 */
public class FootballPlayer extends Person implements TableMember { 

    private int number; // these are the position and number attributes
    private String position;

    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number; 
        this.position = position; 
    }

    public FootballPlayer() {
        super();
        number = 0;
        position = "";
    }

       @Override 
    public String toString() { //overrides & returns attributes about FootballPlayer in String form
        return super.toString() + "  FootballPlayer{" + "number=" + number + ", position=" + position + '}';
       
    }

    @Override
    public String getAttribute(int n) { //returns a string attribute based on int; implements public String getAttribute(int n) method;
        String playerAttributes = new String();
        if (n == 0) {//if n is 0 get the name attribute of the player
            playerAttributes = this.getName();
        }
        if (n == 1) {//if n is 1 get the height attribute of the player
             playerAttributes = "" + this.getHeight().toString();
        }
        if (n == 2) {//if n is 2 get the weight attribute of the player
           playerAttributes = "" + this.getWeight();
        }
        if (n == 3) {//if n is 3 get the hometown attribute of the player
            playerAttributes = this.getHometown();
        }
        if (n == 4) {//if n is 4 get the highSchool attribute of the player
            playerAttributes = this.getHighSchool();
        }
        if (n == 5) {//if n is 5 get the number attribute of the player
             playerAttributes = "" + this.getNumber();
        }
        if (n == 6) {//if n is 6 get the position attribute of the player
            playerAttributes = "" + this.getPosition();
        }
        return playerAttributes;
    }

    @Override
    public ArrayList<String> getAttributes() { //returns a String Arraylist attributeList with all attributes; impelements the public ArrayList<String> getAttributes() method
        ArrayList<String> attributesList = new ArrayList<>();
        for (int i = 0; i < 7; ++i) { //for loop 
            attributesList.add(getAttribute(i));
        }

        return attributesList;
    }

    @Override
    public String getAttributeName(int n) {//returns attribute as string based on int; implements the public String getAttributeName(int n) method
        String attributesName = new String();

        if (n == 0) {//if n is 0 it gets the attributeName "name"
            attributesName = "name";
        }
        if (n == 1) {//if n is 1 gets the attributeName "height"
            attributesName = "height";
        }
        if (n == 2) {//if n is 2 gets the attributeName "weight"
            attributesName = "weight";
        }
        if (n == 3) {//if n is 3 gets the attributeName "hometown"
            attributesName = "hometown";
        }
        if (n == 4) {//if n is 4 gets the attributeName "highschool"
            attributesName = "highschool";
        }
        if (n == 5) {//if n is 5 gets the attributeName "number"
            attributesName = "number";
        }
        if (n == 6) {//if n is 6 gets the attributeName "position"
            attributesName = "position";
        }

        return attributesName;
    }

    
    @Override
    public ArrayList<String> getAttributeNames() {//returns a String Arraylist attributeNameList with all attribute names; implements the public ArrayList<String> getAttributeNames() method
        ArrayList<String> attributeNameList = new ArrayList<>();
        for (int i = 0; i < 7; ++i) {//for loop 
            attributeNameList.add(getAttributeName(i));
        }
        return attributeNameList;
    }

    // getter and setter methods for FootballPlayer
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}