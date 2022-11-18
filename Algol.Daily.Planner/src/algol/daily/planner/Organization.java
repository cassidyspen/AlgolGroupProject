/*
* 
* USE LISTVIEW NOT THIS CLASS
* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;
import java.util.ArrayList; 

/**
 * Organization object represents a list of Assignments
 * 
 * @author mikey
 */
public class Organization {
    private Assignment assignmentList[];
    
    public Organization(Assignment[] assignmentList){
        this.assignmentList = assignmentList;
    }
    /**
     * sorts by urgency
     */
    public void urgencySort() {
        for(int i=0; i<assignmentList.length; i++){
            if(assignmentList[i].getUrgency() )
        }
    }
    
    /**
     * sorts by due date
     */
    public void daySort() {
        
    }
    
    /**
     * sorts by progress
     */
    public void progressSort() {
        
    }
    
    /**
     * displays assignmentList
     */
    public void display(){
        
    }
}
