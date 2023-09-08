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
public class TestMain {
    public static void main (String[] args){
        HourlyEmployee hourEmp = new HourlyEmployee(0,"Darwin",new Date(2020,10,10),new Date(2003,9,6),45,10);
        hourEmp.displayInfo();
    }
}
