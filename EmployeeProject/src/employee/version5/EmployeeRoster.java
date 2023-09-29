/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

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
        Employee removed = new Employee();
        
        for(Employee target : roster){
            if(target.getEmpID() == id){
                removed = target;
                roster.remove(target);
                return removed;
            }
        }
        return removed;
    }

    public int countEmpType(String type){
        int empTypeCount = 0;
        for(Employee target : roster){
            if(getEmpType(target).equals(type)) empTypeCount++;
        }
        return empTypeCount;
    }
    
    public void displayAllEmployees(){
        StringBuilder displayString;
        for(Employee target : roster){
            displayString = new StringBuilder();
            displayString.append(String.format("%3d",target.getEmpID()) + " | ");
            displayString.append(String.format("%-35s",target.getEmpName()) + " | ");
            displayString.append(String.format("%-30s",getEmpType(target)) + " | ");
            displayString.append(String.format("%-10.2f",computeSalary(target)));
            System.out.println(displayString);
        }
    }

    public void displayTypeEmployees(String type){
        StringBuilder displayString;
        for(Employee target : roster){
            if(getEmpType(target).equals(type)){
                displayString = new StringBuilder();
                displayString.append(String.format("%3d",target.getEmpID()) + " | ");
                displayString.append(String.format("%-35s",target.getEmpName()) + " | ");
                displayString.append(String.format("%-30s",getEmpType(target)) + " | ");
                displayString.append(String.format("%-10.2f",computeSalary(target)));
                System.out.println(displayString);
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

    private double computeSalary(Employee target){
        double salary;
        switch(getEmpType(target)){
            case "Hourly Employee" : salary = ((HourlyEmployee)target).computeSalary(); break;
            case "Piece Worker Employee" : salary = ((PieceWorkerEmployee)target).computeSalary(); break;
            case "Base Commission Employee" : salary = ((BasePlusCommissionEmployee)target).computeSalary(); break;
            case "Commission Employee" : salary = ((CommissionEmployee)target).computeSalary(); break;
            default : salary = 0.0;
        }
        return salary;
    }
}
