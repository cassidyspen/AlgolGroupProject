/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Abstract class that acts as a parent for homework/project/test
 * classes.
 * 
 * @author mikey
 */
public abstract class Assignment {
    protected int urgency;
    protected int progress;
    private String dueDate;
    private String subject;
    
    public Assignment() {
        urgency = 0;
        progress = 0;
        dueDate = "None";
        subject = "None";
    }
    
    public Assignment(String urgency, String dueDate, String subject){
        if(urgency.equals("Non-Urgent"))
            this.urgency = 0;
        else if(urgency.equals("Semi-Urgent"))
            this.urgency = 1;
        else 
            this.urgency = 2;
        this.dueDate = dueDate;
        this.subject = subject;
        this.progress = 0;
    }
    
    

    /**
     * Returns
     * @return 
     */
    public abstract String[] getList();
    /**
     * Returns urgency
     * 0 - not urgent
     * 1 - semi-urgent
     * 2 - urgent
     * 
     * @return int
     */
    public String getUrgency() {
        return switch (urgency) {
            case 0 -> "Non-Urgent";
            case 1 -> "Semi-Urgent";
            default -> "Urgent";
        };
    }

    public int getDaysLeft(){
        // Define the date format
        String pattern = "MM/dd/yy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        // Get today's date
        LocalDate today = LocalDate.now();

        // Parse the date string and convert it to a LocalDate object
        String dateString = getDueDate();
        LocalDate date = LocalDate.parse(dateString, formatter);

        // Calculate the difference between the two dates and get the number of days
        Period period = Period.between(today, date);
        int days = period.getDays();
        return days;
    }
    /**
     * sets urgency to given value
     * @param urgency
     */
    public void setUrgency(String urgency) {
        switch (urgency){
            case "Non-Urgent":
                this.urgency = 0;
                break;
            case "Semi-Urgent":
                this.urgency = 1;
                break;
            case "Urgent": 
                this.urgency = 2;
                break;
            default:
                this.urgency = 0;
        }
    }

    /**
     * Returns progress
     * 
     * @return String
     */
    public String getProgress() {
        return switch (this.progress) {
            case 0 -> "Not Started";
            case 1 -> "In Progress";
            default -> "Complete";
        };
    }

    /**
     * sets progress to given value
     * @param progress
     */
    public void setProgress(String progress) {
        switch (progress){
            case "Non Started":
                this.progress= 0;
                break;
            case "In Progress":
                this.progress = 1;
                break;
            case "Complete": 
                this.progress = 2;
                break;
            default:
                this.progress = 0;
        }
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
