/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;

/**
 * A subclass of Assignment representing a Homework assignment
 * 
 * @author team Algol
 */
public class Homework extends Assignment {
    public Homework(String urgency, String dueDate, String subject) {
        super(urgency, dueDate,  subject);
    }
    /**
     * TODO
     * create a list and adds the new assigned homework with its urgency, progress, and due date. 
     * @return the list of homework
     */
    public String[] getList(){
        String[] item = {getSubject() + " Homework", getUrgency(),getProgress(),getDueDate()};
        return item;
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean equals(Object other) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
