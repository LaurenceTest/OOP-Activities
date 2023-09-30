/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private ArrayList<Employee> roster = new ArrayList<Employee>();
    private int MAX;

    EmployeeRoster(int size){
        MAX = 10;
        roster.ensureCapacity(MAX);
    }

    EmployeeRoster(){
        MAX = 10;
        roster.ensureCapacity(MAX);
    }

    public int getMaxSize(){
        return MAX;
    }

    public void setMaxSize(int size){
        if(size < 1) size = 0;
        MAX = size;
        roster.ensureCapacity(MAX);
    }

    public int getCount(){
        return roster.size();
    }

    public boolean addEmployee(Employee newEmployee){
        return roster.add(newEmployee);
    }

    public boolean addEmployees(Employee ...employeeSet){
        return roster.addAll(Arrays.asList(employeeSet));
    }

    public boolean addEmployees(ArrayList<Employee> employeeList){
        return roster.addAll(roster.size(), employeeList);
    }

    public Employee removeEmployee(int id){
        for(Employee target : roster){
            if(target.getEmpID() == id){
                roster.remove(target);
                return target;
            }
        }
        return null;
    }

    public int countEmpType(String type){
        int empTypeCount = 0;
        for(Employee target : roster){
            if(getEmpType(target).equals(type)) empTypeCount++;
        }
        return empTypeCount;
    }
    
    public void displayAllEmployees(){
        for(Employee target : roster){
            displayEmployee(target);
        }
    }

    public void displayTypeEmployees(String type){
        for(Employee target : roster){
            if(getEmpType(target).equals(type)){
                displayEmployee(target);
            }
        }
    }

    public void updateEmployee(int id, Name name){
        for(Employee target : roster){
            if(target.getEmpID() == id){
                target.setEmpName(name);
                break;
            }
        }
    }

    public EmployeeRoster searchEmployees(String keyword){
        ArrayList<Employee> container = new ArrayList<>(MAX);
        for(Employee target : roster){
            if(target.getEmpName().toString().toLowerCase().contains(keyword.toLowerCase()))
            container.add(target);
        }
        EmployeeRoster results = new EmployeeRoster(container.size());
        results.addEmployees(container);
        return results;
    }

    private String getEmpType(Employee target){
        return target.getClass().getSimpleName().replaceAll("(.)([A-Z])","$1 $2");
    }

    private void displayEmployee(Employee target){
        String format = "%3d | %-35s | %-30s | %-10.2f\n";
        System.out.printf(format,target.getEmpID(),target.getEmpName(),getEmpType(target),target.computeSalary());
    }
}
