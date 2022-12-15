/*
* 
* 
* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;
import java.util.ArrayList; 

/**
 * Organization object represents a list of Assignments
 * 
 * @author all of us
 */
public class Organization {
    private ArrayList<Assignment> assignmentList= new ArrayList<>();
    
    
    public Organization(){
    }
    /**
     * takes in an assignment and add it to the list of assignments
     * @param a it is an object of class Assignment 
     */
    public void addAssignment(Assignment a){
        assignmentList.add(a);
    }
    /**
     * gets the assignment list
     * @return assignmentList a list of all the current assignments
     */
    public ArrayList<Assignment> getAssignments(){
        return assignmentList;
    }
    /**
     * sorts by urgency
     */
    public void urgencySort() {
        for(int i=0; i<assignmentList.size(); i++){
            for (int j = i + 1; j < assignmentList.size(); j++){
                Assignment temp = assignmentList.get(0);
                if (assignmentList.get(j).urgency < assignmentList.get(i).urgency){
                    temp = assignmentList.get(i);
                    assignmentList.set(i,assignmentList.get(j));
                    assignmentList.set(j,temp);
                   
  
                }
            }
        }
    }
    
    /**
     * sorts by due date
     */
    public void daySort() {
        for(int i=0; i<assignmentList.size(); i++){
            for (int j = i + 1; j < assignmentList.size(); j++){
                Assignment temp = assignmentList.get(0);
                if (assignmentList.get(j).getDaysLeft() < assignmentList.get(i).getDaysLeft()){
                    temp = assignmentList.get(i);
                    assignmentList.set(i,assignmentList.get(j));
                    assignmentList.set(j,temp);
                   
  
                }
            }
        }
        
    }
    
    /**
     * sorts by progress
     */
    public void progressSort() {
        for(int i=0; i<assignmentList.size(); i++){
            for (int j = i + 1; j < assignmentList.size(); j++){
                Assignment temp = assignmentList.get(0);
                if (assignmentList.get(j).progress < assignmentList.get(i).progress){
                    temp = assignmentList.get(i);
                    assignmentList.set(i,assignmentList.get(j));
                    assignmentList.set(j,temp);
                   
  
                }
            }
        }
    }
    
    /**
     * displays assignmentList
     */
    public void display(){
        
    }
}
