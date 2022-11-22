/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algol.daily.planner;

/**
 * A subclass of Assignment representing a due test
 *
 * @author mikey
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
     * Return list type for table
     * @return 
     */
    @Override
    public String[] getList(){
        String[] item = {name, getUrgency(),getProgress(),getDueDate(),};
        return item;
    }
    /**
     * Returns material
     * 
     * @return String
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets material to given value
     * @param material 
     */
    public void setMaterial(String material) {
        this.material = material;
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
