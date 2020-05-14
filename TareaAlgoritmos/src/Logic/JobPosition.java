/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Mauricio
 */
public class JobPosition {
    
   
    private String description;
    private double hourlyWage;
    private int id;

    public JobPosition(String description, double hourlyWage, int id) {
        this.description = description;
        this.hourlyWage = hourlyWage;
        this.id = id;
    }
   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    
   
}
