/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * Person.java
 * Contains attributes about person
 */
package Model;


public class Person {
    private String name; //  name as an String 
    private int weight; //  weight as an int 
    private Height height;// person height 
    private String hometown; //  hometown 
    private String highschool;  //  highschool
    
    
    public Person (String firstName, int weight, Height height1, String hometown, String highschool){
        name = firstName;
        weight = weight; 
        height = height1; 
        hometown = hometown; 
        highschool = highschool; 
    }
     public Person() {
        this("Johnny" ,290, null, "N/A","N/A");// defualt constructor 
     
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    /**
     * @return the highschool
     */
    public String getHighschool() {
        return highschool;
    }

    /**
     * @param highschool the highschool to set
     */
    public void setHighSchool(String highschool) {
        this.highschool = highschool;
    }
    
    public Height getHeight() {
        
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }
    
        /**
     * @return the heightCalculations
     */
    
     // prints out all the information about a person 
    @Override
    public String toString(){
        
       return getName() + getHometown() + getHighschool() 
             + getHeight() + getWeight();

    }
}
