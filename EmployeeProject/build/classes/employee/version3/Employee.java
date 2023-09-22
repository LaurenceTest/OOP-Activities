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

    public String getEmpName(){
        return empName.toString();
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

class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String[] suffix = {""};

    public Name(String firstName, String middleName, String lastName, String ...suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(Name self){
        this.firstName = self.firstName;
        this.middleName = self.middleName;
        this.lastName = self.lastName;
        this.suffix = self.suffix;
    }

    public Name(){
        firstName = "";
        middleName = "";
        lastName = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        String suffixes = "";
        int i;
        for(i = 0; i < suffix.length ; i++){
            suffixes += i + 1 != suffix.length ? suffix[i] + ", ": suffix[i];
        }
        return suffixes;
    }

    public void setSuffix(String[] suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        String middleName = this.middleName != null ? " " + this.middleName.charAt(0) + "." : "";
        String lastName = this.lastName != null ? " " + this.lastName : "";
        return firstName + middleName + lastName + (getSuffix().length() > 0 ? " " + getSuffix() : "");
    }
}