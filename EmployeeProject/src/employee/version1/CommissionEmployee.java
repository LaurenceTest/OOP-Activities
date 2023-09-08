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
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double percentage = 0;
        if(totalSales < 50000) percentage = 0.05;
        else if(totalSales >= 50000 && totalSales < 100000) percentage = 0.2;
        else if(totalSales >= 100000 && totalSales < 500000) percentage = 0.3;
        else if(totalSales >= 500000) percentage = 0.5;
        return totalSales * percentage;
    }
    
    public void displayInfo(){
    System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%d/%ty\nEmployee Birth Date: %td/%d/%ty\n"
    +"Total Sales: %.2f\nSalary: %.2f\n",empID,empName,empDateHired,empDateHired.getMonth(),empDateHired,empBirthDate,empBirthDate.getMonth(),empBirthDate,totalSales,computeSalary());
     }

    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%tm/%ty\nEmployee Birth Date: %td/%tm/%ty\n",empID,empName,empDateHired,empDateHired,empDateHired,empBirthDate,empBirthDate,empBirthDate);
    }
}
