/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * FootballPlayer.java
 * Contains attributes about the football players
 */
package Model;


import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember{
    
    private int number; // football player number as an int 
    private String position; // football player posotion as a string 
    //ArrayList footballNames = new ArrayList();

     

    public FootballPlayer(String firstName, Height height1, int weight, String hometown, String highschool, int currentNumber, String currentPosition){// OffensiveLine positionCurrent
        
        
        // all of these are setting equal to parameters in the constructor 
        super(firstName, weight, height1, hometown, highschool);// attributes assicated with the persons class
        number = currentNumber; 
        position = currentPosition;  

    }
    
    public FootballPlayer() {
        this("N/A", null, 0, "N/A", "N/A", 0, "N/A");// defualt constructor 
    
    }
    
     
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    //prints all the information about football player 
    @Override
    public String toString(){
       return super.toString() + " , is number " + getNumber() + " and he is the " +  getPosition();
    }
    
   //prints out the attributes rabout football player
    @Override
    public String getAttribute(int n){
        return getAttributes().get(n);
    }
    //creates the array to print out attributes
    @Override
    public  ArrayList<String> getAttributes(){
        ArrayList footballAttributes = new ArrayList(); //creates new arrayList 
        footballAttributes.add(getName()); // adds name to arrayList
        footballAttributes.add(String.valueOf(getHeight())); // adds height to arrayList
        footballAttributes.add(String.valueOf(getWeight())); //adds weight to arrayList
        footballAttributes.add(getHometown()); // adds hometown to arrayList
        footballAttributes.add(getHighschool()); // adds highschool to arrayList
        footballAttributes.add(String.valueOf(getNumber())); // adds number to arraylist
        footballAttributes.add(getPosition()); // adds position to arrayList
        return footballAttributes;
    }
    
    //prints out the attributes name 
    @Override
    public String getAttributeName(int n){
        return getAttributeNames().get(n);
    }
    
    //creates array to print attributes name
    @Override
    public ArrayList<String> getAttributeNames(){
          ArrayList footballNames = new ArrayList();// creastes new arrayList 
        footballNames.add("Name");
        footballNames.add("Height");
        footballNames.add("Weight");
        footballNames.add("Hometown");
        footballNames.add("HighSchool");
        footballNames.add("Number");
        footballNames.add("Position");
        return footballNames;
    }
}
