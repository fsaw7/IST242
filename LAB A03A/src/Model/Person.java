/*
 * Fatou Sawaneh
 * Lab 3
 * Due date: 2/22/2022
 * fjs5286@psu.edu
 * Person.java
 * @author fatousawaneh
 * contains the name, height, weight, hometown, and highSchool attributes as well as the String toString() method
 */
package Model;

public class Person {

    private String name; // attributes
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    public Person(String name, Height height, int weight, String hometown,
            String highSchool) { // initialises the attributes
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    public Person() {
        name = "";
        height = null;
        weight = 0;
        hometown = "";
        highSchool = "";
    }

    @Override // will return info about the attributes of this class
    public String toString() {
        return this.getName() + " " + this.getHeight() + " " + this.getWeight() + " "
                + this.getHometown() + " " + this.getHighSchool();
    }

    //getter and setter methods
    
    // @return the name
    public String getName() {
        return name;
    }

    // @return the height
    public Height getHeight() {
        return height;
    }

    // @return the weight
    public int getWeight() {
        return weight;
    }

    // @return the hometown
    public String getHometown() {
        return hometown;
    }

    // @return the highSchool
    public String getHighSchool() {
        return highSchool;
    }

}
