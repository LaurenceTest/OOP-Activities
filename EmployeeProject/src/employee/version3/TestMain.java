/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

import java.util.Date;

/**
 *
 * @author User
 */
public class TestMain {
    public static void main (String[] args){
        HourlyEmployee hourEmp = new HourlyEmployee(0,"Darwin",new Date(2020,10,10),new Date(2003,9,6),1,15);
        PieceWorkerEmployee pieWorkEmp = new PieceWorkerEmployee(1,"Pagcor",new Date(2023,7,4),new Date(1995,1,15),120,30);
        CommissionEmployee commEmp = new CommissionEmployee(2,"Cafrana",new Date(2023,7,4),new Date(1995,1,15),20000);
        BasePlusCommissionEmployee baseCommEmp = new BasePlusCommissionEmployee(3,"digby",new Date(2023,7,4),new Date(1995,1,15),1000000,20000);
        hourEmp.displayInfo();
        pieWorkEmp.displayInfo();
        commEmp.displayInfo();
        baseCommEmp.displayInfo();
    }
}
