
/**
 * Fatou Sawaneh 
 * Lab 4
 * Due date: 3/22/2022 
 * fjs5286@psu.edu 
 * App.java
 * Contains the main method, creates 3 objects of the Model, View, and Controller Class.
 */
import Controller.Controller;
import Model.Model;
import View.View;

class App
{

    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}
