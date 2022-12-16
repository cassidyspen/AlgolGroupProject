/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;

/**
 * Description: A subclass of Assignment representing a Test assignment
 * 
 * File: Test.java
 * @author team Algol
 * Class: COMP-305 FA22
 * Prof: A. Nuzen
 * 
 * Purpose: allow the user to organize tests
 */
public class Test extends Assignment {
    private String material;
    private String name;
    
    public Test(String urgency, String dueDate, String subject) {
        super(urgency, dueDate, subject);
        name = subject + " test";
        material = "None";
    }
    /**
     * 
     * create a string list with the assigned test with its urgency, 
     * progress, and due date to use for the table
     * @return string list
     */
    @Override
    public String[] getList(){
        String[] item = {name, getUrgency(),getProgress(),getDueDate(),};
        return item;
    }  
}
