/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * Height.java
 * Used by the Student class
 */
package Model;


public class Height{ 
    private int feet; // feet 
    private int inches;// inches

    public Height (int feet1, int inches1) { 
        
       
        
    }
    public Height(){ // empty constructor 
    
       this(0,0);
      
    }
    
    /** 
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }
    
     // method to return height in feet and inches
    @Override
    public String toString(){
        
        return getFeet() + "'" + getInches() + "\"";
    }

}

