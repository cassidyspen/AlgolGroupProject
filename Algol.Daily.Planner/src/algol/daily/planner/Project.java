/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;


/**
 * Description: A subclass of Assignment representing a Project assignment
 * 
 * File: Menu.java
 * @author team Algol
 * Class: COMP-305 FA22
 * Prof: A. Nuzen
 * 
 * Purpose: allow the user to organize projects
 */
public class Project extends Assignment {
  
    public Project(String urgency, String dueDate, String subject) {
        super(urgency, dueDate,  subject);
    }
    
    /**
     * 
     * create a string list with the assigned project with its urgency, 
     * progress, and due date to use for the table
     * @return string list
     */
    @Override
    public String[] getList(){
        String[] item = {getSubject() + " Project", getUrgency(),getProgress(),getDueDate()};
        return item;
    } 
}
