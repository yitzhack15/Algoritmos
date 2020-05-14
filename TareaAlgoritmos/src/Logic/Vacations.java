/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 *
 * @author Mauricio
 */
public class Vacations {
    
    private int id, employeeID;
    private Date startDate, endDate;
   private  int totalDays  ;  /////////////////////////NO ESTA TERMINADO

    public Vacations(int id, int employeeID, Date startDate, Date endDate, int totalDays) {
        this.id = id;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalDays = totalDays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
   
}
