/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;
import java.util.Date;

/**
 *
 * @author User
 */
public class TestMain {
    public static void main (String[] args){
        HourlyEmployee hourEmp = new HourlyEmployee(0,new Name("Darwin","Camiso","Pabores"),new Date(2020,10,10),new Date(2003,9,6),1,15);
        HourlyEmployee hourEmp2 = new HourlyEmployee(4,new Name("Pablo","Camiso","Pabores"),new Date(2020,10,10),new Date(2003,9,6),1,15);
        HourlyEmployee hourEmp3 = new HourlyEmployee(5,new Name("Donaire","Camiso","Pabores"),new Date(2020,10,10),new Date(2003,9,6),1,15);
        PieceWorkerEmployee pieWorkEmp = new PieceWorkerEmployee(1,new Name("Pagcor","Stroheim"),new Date(2023,7,4),new Date(1995,1,15),120,30);
        PieceWorkerEmployee pieWorkEmp2 = new PieceWorkerEmployee(6,new Name("Chorizo","Stroheim"),new Date(2023,7,4),new Date(1995,1,15),120,30);
        CommissionEmployee commEmp = new CommissionEmployee(2,new Name("Cafrana","Ilasa","Feltrinema", "Jr."),new Date(2023,7,4),new Date(1995,1,15),20000);
        BasePlusCommissionEmployee baseCommEmp = new BasePlusCommissionEmployee(7,new Name("digby"),new Date(2023,7,4),new Date(1995,1,15),1000000,20000);
        BasePlusCommissionEmployee baseCommEmp2 = new BasePlusCommissionEmployee(8,new Name("mordecai"),new Date(2023,7,4),new Date(1995,1,15),1000000,20000);
        BasePlusCommissionEmployee baseCommEmp3 = new BasePlusCommissionEmployee(9,new Name("muscle"),new Date(2023,7,4),new Date(1995,1,15),1000000,20000);
        EmployeeRoster roster = new EmployeeRoster();
        roster.addEmployee(hourEmp);
        roster.addEmployees(pieWorkEmp,commEmp,baseCommEmp,hourEmp2,hourEmp3,pieWorkEmp2,baseCommEmp2,baseCommEmp3);
        roster.displayAllEmployees();
        // roster.removeEmployee(7);
        // roster.displayAllEmployees();
        // roster.displayTypeEmployees("Hourly Employee");
        // roster.displayTypeEmployees("Piece Worker Employee");
        // roster.displayTypeEmployees("Commission Employee");
        // roster.displayTypeEmployees("Base Plus Commission Employee");
        // System.out.println(roster.getCount());
        // System.out.println(roster.countEmpType("Hourly Employee"));
        // roster.searchEmployees("Stroheim").displayAllEmployees();
        // roster.displayAllEmployees();
    }
}
