/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;

/**
 * Abstract class that acts as a parent for homework/project/test
 * classes.
 * 
 * @author mikey
 */
public abstract class Assignment {
    private int urgency;
    private String progress;
    private String dueDate;
    private String subject;
    
    public Assignment() {
        urgency = 0;
        progress = "None";
        dueDate = "None";
        subject = "None";
    }

    /**
     * Returns urgency
     * 0 - not urgent
     * 1 - semi-urgent
     * 2 - urgent
     * 
     * @return int
     */
    public int getUrgency() {
        return urgency;
    }

    /**
     * sets urgency to given value
     */
    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    /**
     * Returns progress
     * 
     * @return String
     */
    public String getProgress() {
        return progress;
    }

    /**
     * sets progress to given value
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * Returns dueDate
     * 
     * @return String
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * sets dueDate to given value
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Returns subject
     * 
     * @return String
     */
    public String getSubject() {
        return subject;
    }

    /**
     * sets subject to given value
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public abstract boolean equals(Object other);
    @Override
    public abstract String toString();
    
    
    
    
            
    
    
}
