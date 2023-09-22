/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee []roster;
    private int count = 0;
    private int max = 10;
    
    EmployeeRoster(Employee []initial,int size){
        if(size > initial.length){
            roster = initial;
            count = initial.length;
            max = size;
        }else{
            count = 0;
            max = 10;
        }
    }
    
    EmployeeRoster(Employee []initial){
        roster = initial;
        count = initial.length;
        max = 10;
    }
    
    EmployeeRoster(){
        count = 0;
        max = 10;
    }
    
    
}
