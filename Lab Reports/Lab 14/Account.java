
package Assignment;
import java.io.*;


public class Account implements Serializable{
    private String acc_number;
    private String ownerName;
    private double balance;

    public Account() {
    }
    public Account(String acc_number, String ownerName, double balance) {
        this.acc_number = acc_number;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAcc_number() {
        return acc_number;
    }
    public double getBalance() {
        return balance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println(amount + " has been deducted from your account.");
    }
    
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println(amount + " has been deposited to your account.");
    }
    
    public void transfer(Account acc, double amount){
        this.balance  = this.balance-amount;
        acc.balance = acc.balance+amount;
        System.out.println(amount + " has been transfered from Account:" + this.toString() + "\n to Account:" + acc.toString());
    }
    
    public void balanceEnquiry(){
        System.out.println("Your balance in the current account is:\t" + balance);
    }
    
    public String toString(){
        return "\nAccount ID:\t" + acc_number + "\nOwner's Name:\t" + ownerName + "\nBalance:\t" + balance + "\n";
    }
}
