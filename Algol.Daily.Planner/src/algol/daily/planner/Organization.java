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
 * @author mikey
 */
public class Organization {
    private ArrayList<Assignment> assignmentList= new ArrayList<>();
    
    
    public Organization(){
    }
    public void addAssignment(Assignment a){
        assignmentList.add(a);
    }
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
