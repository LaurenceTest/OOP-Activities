package BankAccount;

public class Account {
    private int id;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(int id,double balance,String name, String email, String phoneNumber){
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getID(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setID(int id){
        this.id = id > 0 ? id : 0;
    }
    public void setBalance(double balance){
        this.balance = balance > 0 ? balance : 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public boolean deposit(int cash){
        if(cash > 0){
            this.balance += cash;
            return true;
        }
        return false;
    }
    public boolean withdraw(int cash){
        if(this.balance > cash && cash > 0){
            this.balance -= cash;
            return true;
        }
        return false;
    }
}
