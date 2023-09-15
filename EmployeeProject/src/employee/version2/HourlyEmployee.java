/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.util.Date;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.ratePerHour = ratePerHour;
        totalHoursWorked = 0;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee() {
        super();
        totalHoursWorked = 0;
        ratePerHour = 0;
    }
    
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked > 0 ? totalHoursWorked : 0;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour > 0 ? ratePerHour : 0;
    }
     
    public double computeSalary(){
         double computedHours = totalHoursWorked / 40;
         double workHours = computedHours > 1 ? 1 : totalHoursWorked / 40;
         double overtime = computedHours > 1 ? computedHours - 1 : 0;
         return ((workHours * 40) * ratePerHour) + (overtime * (ratePerHour * 1.5));
     }

    public void displayInfo(){
        System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%d/%ty\nEmployee Birth Date: %td/%d/%ty\n"
        + "Total Hours Worked: %.2f\nRate Per Hour: %.2f\nSalary: %.2f\n",getEmpID(),getEmpName(),getEmpDateHired(),getEmpDateHired().getMonth(),getEmpDateHired(),getEmpBirthDate(),getEmpBirthDate().getMonth(),getEmpBirthDate(),totalHoursWorked,ratePerHour,computeSalary()); 
     }
}
