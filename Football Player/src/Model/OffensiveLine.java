/*
 * Fatou Sawaneh
 * Lab 2
 * Due date: 2/11/2022
 * fjs5286@psu.edu
 * OffensiveLine.java
 * contains the attributes FootballPlayer center, offensiveGuard, and offensiveTackle
 */
package Model;

import java.util.ArrayList;

/**
 *
 *
 */
public class OffensiveLine {

    int averageWeight = 0;
    private ArrayList<FootballPlayer> offensiveLine;
    private FootballPlayer center;
    private FootballPlayer offensiveGuard;
    private FootballPlayer offensiveTackle;

    public OffensiveLine() { 
        this.offensiveLine = new ArrayList<>(); // array list for offensiveLine
    }

    public ArrayList<FootballPlayer> getOffensiveLine() {
        return offensiveLine;
    }

    public void setOffensiveLine(ArrayList<FootballPlayer> offensiveLine) {
        this.offensiveLine = offensiveLine;
    }

    public void addOffensiveLine(FootballPlayer footballPlayer) {
        this.offensiveLine.add(footballPlayer);
    }

    // method to calculate average weight
    public double getAverageWeight() {
        int weightOne = offensiveLine.get(0).getFBPlayerWeight();
        int weightTwo = offensiveLine.get(1).getFBPlayerWeight();
        int weightThree = offensiveLine.get(2).getFBPlayerWeight();
        averageWeight = (weightOne + weightTwo + weightThree) / 3;
        return averageWeight;
    }
}
