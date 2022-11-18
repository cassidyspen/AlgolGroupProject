/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;

import javax.swing.text.PasswordView;

/**
 * Subclass of Assignment representing a project
 *
 * @author mikey
 */
public class Project extends Assignment {
    private String title;
    
    public Project() {
        super();
        title = "None";
    }
    
    /**
     * Returns title
     * 
     * @return String
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * sets title to given value
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public boolean equals(Object other) {
        return false;
    }
    
    
}
