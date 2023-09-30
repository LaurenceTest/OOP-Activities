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
public class Employee{
    private int empID;
    private Date empDateHired;
    private Date empBirthDate;
    private Name empName = new Name();

    public Employee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, String ...suffix) {
        empName.setFirstName(firstName);
        empName.setMiddleName(middleName);
        empName.setLastName(lastName);
        empName.setSuffix(suffix);
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate) {
        empName.setFirstName(firstName);
        empName.setMiddleName(middleName);
        empName.setLastName(lastName);
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee() {
        empID = -1;
        empDateHired = new Date(0,0,0);
        empBirthDate = new Date(0,0,0);
    }  
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName(){
        return empName;
    }

    public void setEmpName(Name name){
        this.empName = name;
    }
    public void setEmpName(String firstName, String middleName, String lastName){
        empName.setFirstName(firstName);
        empName.setMiddleName(middleName);
        empName.setLastName(lastName);
    }
    public void setEmpName(String firstName, String lastName){
        empName.setFirstName(firstName);
        empName.setLastName(lastName);
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%tm/%ty\nEmployee Birth Date: %td/%tm/%ty\n",empID,getEmpName().toString(),empDateHired,empDateHired,empDateHired,empBirthDate,empBirthDate,empBirthDate);
    }
}