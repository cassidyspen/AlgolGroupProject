/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;


/**
 * Description: A subclass of Assignment representing a Homework assignment
 * 
 * File: Homework.java
 * @author team Algol
 * Class: COMP-305 FA22
 * Prof: A. Nuzen
 * 
 * Purpose: allow the user to organize homework
 */
public class Homework extends Assignment {
    public Homework(String urgency, String dueDate, String subject) {
        super(urgency, dueDate,  subject);
    }
    /**
     * 
     * create a string list with the assigned homework with its urgency, 
     * progress, and due date to use for the table
     * @return the list of homework
     */
    @Override
    public String[] getList(){
        String[] item = {getSubject() + " Homework", getUrgency(),getProgress(),getDueDate()};
        return item;
    }
 
}
