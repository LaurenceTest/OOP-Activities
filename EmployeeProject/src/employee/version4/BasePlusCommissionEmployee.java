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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate);
        super.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        super.setTotalSales(totalSales);
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        super.setTotalSales(0);
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee() {
        super();
        super.setTotalSales(0);
        baseSalary = 0;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary > 0 ? baseSalary : 0;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    @Override
    public void displayInfo() {
        System.out.printf(this.toString() + "Total Sales: %.2f\nBase Salary: %.2f\nSalary: %.2f\n", super.getTotalSales(), baseSalary, computeSalary());
    }
}
