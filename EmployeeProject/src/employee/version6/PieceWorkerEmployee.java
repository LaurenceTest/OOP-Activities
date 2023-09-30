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
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee() {
        super();
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
    
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished > 0 ? totalPiecesFinished : 0;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece > 0 ? ratePerPiece : 0;
    }

    @Override
    public double computeSalary() {
        double bonuses = totalPiecesFinished / 100;
        return (totalPiecesFinished * ratePerPiece) + (bonuses * (ratePerPiece * 10));
    }

    public void displayInfo() {
        System.out.printf(this.toString() + "Total Pieces Finished: %d\nRate Per Piece: %.2f\nSalary: %.2f\n", totalPiecesFinished, ratePerPiece, computeSalary());
    }

    @Override
    public String toString() {
        return String.format(this.toString() + "Total Pieces Finished: %d\nRate Per Piece: %.2f\nSalary: %.2f\n", totalPiecesFinished, ratePerPiece, computeSalary());
    }

}
