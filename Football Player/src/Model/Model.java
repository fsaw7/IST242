package Model;

/**
 * Fatou Sawaneh Lab 2 Due date: 2/11/2022 fjs5286@psu.edu 
 * Model.java 
 * creates three football players, creates an OffensiveLine object, displays information about the 3 players in the OffensiveLine, and displays the average weight
 */
public class Model {

    public Model() {

        //creation of the three FootballPlayer objects
        FootballPlayer center = new FootballPlayer("John Doe", new Height(6, 4),
                200, "Manchester", "Northeastern", 18, "Center");

        FootballPlayer offensiveGuard = new FootballPlayer("Jim Bob", new Height(6, 8),
                250, "York", "Central HS", 24, "Offensive Guard");

        FootballPlayer offensiveTackle = new FootballPlayer("Terry James", new Height(6, 7),
                165, "York", "Central HS", 15, "Offensive Tackle");

        // creation of an OffensiveLine object using the three football player objects
        OffensiveLine offensiveLine = new OffensiveLine();
        offensiveLine.addOffensiveLine(center);
        offensiveLine.addOffensiveLine(offensiveGuard);
        offensiveLine.addOffensiveLine(offensiveTackle);

        // displays information about the OffensiveLine via the OffensiveLine object
        System.out.println(offensiveLine.getOffensiveLine().toString());

        // Displays the average weight of the OffensiveLine 
        System.out.println("Offensive Line Average Height: " + offensiveLine.getAverageWeight());
    }
}
