package Model;

/**
 * Fatou Sawaneh 
 * Lab 2 
 * Due date: 2/11/2022 
 * fjs5286@psu.edu 
 * FootballPlayer.java
 * Contains the the attributes of the football player: number and position. Also contains the String toString() method.
 */
public class FootballPlayer extends Person { // will be reusing the Person class

    private int number; // position and number attributes
    private String position;

    public FootballPlayer(String name, Height height, int weight, String hometown, 
            String highSchool, int number, String position) {
        super(name, height, weight, hometown, highSchool);
        this.number = number; // initialises attributes
        this.position = position;
    }

    public FootballPlayer() {
        super();
        number = 0;
        position = "";
    }

    @Override
    public String toString() { // overrides super class object & returns these attributes
        return this.getName() + ", " + this.getHeight() + ", " + this.getWeight() + ", "
                + this.getHometown() + ", " + this.getHighSchool() + ", "
                + this.getNumber() + ", " + this.getPosition() + "\n";
    }

    public int getNumber() { //@return the number
        return number;
    }

    public String getPosition() { // @return the position
        return position;
    }

    //@return the weight
    public int getFBPlayerWeight() {
        return super.getWeight();
    }

}
