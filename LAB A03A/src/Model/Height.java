package Model;

/**
 * Fatou Sawaneh
 * Lab 3 
 * Due date: 2/22/2022
 * fjs5286@psu.edu
 * Height.java 
 * contains Height class, which is to be used in the FootballPlayer class, and the StringtoString() method
 */
public class Height {
    // feet and inches are the two height attributes

    private int feet;
    private int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Height() {
        this.feet = 0;
        this.inches = 0;
    }

    @Override
    public String toString() { //this is the method to output height in formatted feet and inches
        return feet + "'" + inches + "\"";
    }
    // the following are the getter and setter methods for feet and inches

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

}
