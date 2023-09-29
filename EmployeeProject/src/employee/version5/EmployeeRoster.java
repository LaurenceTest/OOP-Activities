/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee []roster;
    private int count;
    private int MAX;

    EmployeeRoster(int size){
        if(size < 1) size = 1;
        MAX = size;
        roster = new Employee[MAX];
    }

    EmployeeRoster(){
        count = 0;
        MAX  = 10;
        roster = new Employee[MAX];
    }

    public void setMaxSize(int size){
        if(size > 0 && size >= roster.length){
            MAX = size;
            Employee[] resize = new Employee[MAX];
            System.arraycopy(roster,0,resize,0,roster.length);
            roster = resize;
        }
    }

    public int getCount(){
        return count;
    }

    public int getMaxSize(){
        return MAX;
    }

    public boolean addEmployee(Employee newEmployee){
        if(count == MAX) return false;
        roster[count] = newEmployee;
        count++;
        return true;
    }

    public boolean addEmployees(Employee ...employeeSet){
        if(count == MAX || employeeSet.length > (MAX - count)) return false;
        for(Employee newEmployee : employeeSet){
            roster[count] = newEmployee;
            count++;
        }
        return true;
    }

    public Employee removeEmployee(int id){
        int i;
        Employee target = new Employee();
        for(i = 0;i < count && roster[i].getEmpID() != id;i++){}
        if(i != count){
            target = roster[i];
            for(;i < count - 1; i++){
                roster[i] = roster[i+1];
            }
            count--;
        }
        return target;
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
        for(int i = 0; i < count; i++){
            displayString = new StringBuilder();
            displayString.append(roster[i].getEmpID() + " | ");
            displayString.append(roster[i].getEmpName() + " | ");
            displayString.append(getEmpType(roster[i]) + " | ");
            displayString.append(String.format("%.2f",computeSalary(roster[i])));
            System.out.println(displayString);
        }
    }

    public void displayTypeEmployees(String type){
        StringBuilder displayString;
        for(int i = 0; i < count; i++){
            if(getEmpType(roster[i]).equals(type)){
                displayString = new StringBuilder();
                displayString.append(roster[i].getEmpID() + " | ");
                displayString.append(roster[i].getEmpName() + " | ");
                displayString.append(getEmpType(roster[i]) + " | ");
                displayString.append(String.format("%.2f",computeSalary(roster[i])));
                System.out.println(displayString);
            }
        }
    }

    public void updateEmployee(int id, Name name){
        int i;
        for(i = 0; i < count && roster[i].getEmpID() != id; i++){}
        if(i < count){
            roster[i].setEmpName(name);
        }
    }

    public Employee[] searchEmployees(String keyword){
        int resultCount = 0;
        Employee[] container = new Employee[MAX];
        for(int i = 0; i < count; i++){
            if(roster[i].getEmpName().toString().toLowerCase().contains(keyword.toLowerCase())) container[resultCount++] = roster[i];
        }
        Employee[] results = new Employee[resultCount];
        System.arraycopy(container,0,results,0,resultCount);
        return results;
    }

    private String getEmpType(Employee target){
        if(target instanceof HourlyEmployee) return "Hourly Employee";
        if(target instanceof PieceWorkerEmployee) return "Piece Worker Employee";
        if(target instanceof BasePlusCommissionEmployee) return "Base Commission Employee";
        if(target instanceof CommissionEmployee) return "Commission Employee";
        return "Not Found";
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
