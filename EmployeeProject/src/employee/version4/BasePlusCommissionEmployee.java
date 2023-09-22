/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;
import java.util.Date;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends Employee{
    private double totalSales;
    private double baseSalary;
    
    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        totalSales = 0;
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee() {
        super();
        totalSales = 0;
        baseSalary = 0;
    }
    
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales > 0 ? totalSales : 0;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary > 0 ? baseSalary : 0;
    }

    public double computeSalary() {
        double percentage = 0;
        if (totalSales < 50000) {
            percentage = 0.05;
        } else if (totalSales >= 50000 && totalSales < 100000) {
            percentage = 0.2;
        } else if (totalSales >= 100000 && totalSales < 500000) {
            percentage = 0.3;
        } else if (totalSales >= 500000) {
            percentage = 0.5;
        }
        return (totalSales * percentage) + baseSalary;
    }

    public void displayInfo() {
        System.out.printf(this.toString() + "Total Sales: %.2f\nBase Salary: %.2f\nSalary: %.2f\n", totalSales, baseSalary, computeSalary());
    }
}
