/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;
import java.util.Date;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    private double totalSales;
    
    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        totalSales = 0;
    }
    
    public CommissionEmployee(){
        super();
        totalSales = 0;
    }
    
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales > 0 ? totalSales : 0;
    }
    
    public double computeSalary(){
        double percentage = 0;
        if(totalSales < 50000) percentage = 0.05;
        else if(totalSales >= 50000 && totalSales < 100000) percentage = 0.2;
        else if(totalSales >= 100000 && totalSales < 500000) percentage = 0.3;
        else if(totalSales >= 500000) percentage = 0.5;
        return totalSales * percentage;
    }

    public void displayInfo() {
        System.out.printf(this.toString() + "Total Sales: %.2f\nSalary: %.2f\n", totalSales, computeSalary());
    }
}
