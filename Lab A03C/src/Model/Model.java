
/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 3/22/2022 
 * fjs5286@psu.edu 
 * Model.java
 * Contains a method that will return data about specific students in the array, also creates three students
 */
package Model;

import java.util.ArrayList;

public class Model {

    ArrayList<Student> sts = new ArrayList<>();

    public Model() {
        //creates 3 students
        MailAddress addr1 = new MailAddress("107 W College Avenue", "State College", "PA", 16801);
        Student st1 = new Student("Emily", "Smith", 20, addr1);
        MailAddress addr2 = new MailAddress("200 W College Avenue", "State College", "PA", 16801);
        Student st2 = new Student("Mary", "Doe", 20, addr2);
        MailAddress addr3 = new MailAddress("300 W College Avenue", "State College", "PA", 16801);
        Student st3 = new Student("John", "Doe", 20, addr3);
        //add them to the array of students
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
    }

    public Student findStudent(int x) { //method to return data about a student(s) in the array
        return sts.get(x);
    }

}
