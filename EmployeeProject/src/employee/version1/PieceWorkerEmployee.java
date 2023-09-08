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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        double bonuses = totalPiecesFinished / 100;
        return (totalPiecesFinished * ratePerPiece) + (bonuses * (ratePerPiece * 10));
    }
    
    public void displayInfo(){
        System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%d/%ty\nEmployee Birth Date: %td/%d/%ty\n"
        + "Total Pieces Finished: %d\nRate Per Piece: %.2f\nSalary: %.2f\n",empID,empName,empDateHired,empDateHired.getMonth(),empDateHired,empBirthDate,empBirthDate.getMonth(),empBirthDate,totalPiecesFinished,ratePerPiece,computeSalary());
     }

    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nEmployee Date Hired: %td/%tm/%ty\nEmployee Birth Date: %td/%tm/%ty\n",empID,empName,empDateHired,empDateHired,empDateHired,empBirthDate,empBirthDate,empBirthDate);
    }
}
