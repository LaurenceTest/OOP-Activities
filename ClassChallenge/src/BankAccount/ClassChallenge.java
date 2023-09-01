package BankAccount;
public class ClassChallenge{
    public static void main(String[] args){
        Account user1 = new Account(1,100,"Andrew","frosty@ganko.com","09055555555");

        user1.deposit(20);
        user1.withdraw(600);
        user1.withdraw(50);

        System.out.println(user1.getBalance());
    }
}