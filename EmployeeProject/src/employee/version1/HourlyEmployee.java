/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.util.Date;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
     
    public double computeSalary(){
         double computedHours = totalHoursWorked / 40;
         double workHours = computedHours > 1 ? 1 : totalHoursWorked / 40;
         double overtime = computedHours > 1 ? computedHours - 1 : 0;
         return ((workHours * 40) * ratePerHour) + (overtime * (ratePerHour * 1.5));
     }
     
    public void displayInfo(){
        System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%d/%ty\nEmployee Birth Date: %td/%d/%ty\n"
        + "Total Hours Worked: %.2f\nRate Per Hour: %.2f\nSalary: %.2f\n",empID,empName,empDateHired,empDateHired.getMonth(),empDateHired,empBirthDate,empBirthDate.getMonth(),empBirthDate,totalHoursWorked,ratePerHour,computeSalary()); 
     }

    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%tm/%ty\nEmployee Birth Date: %td/%tm/%ty\n",empID,empName,empDateHired,empDateHired,empDateHired,empBirthDate,empBirthDate,empBirthDate);
    }
}
