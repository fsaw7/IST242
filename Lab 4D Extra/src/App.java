/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * App.java
 * Creates the model + view objects and then passes those on to Controller
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
