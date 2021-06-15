
package Assignment;
import java.util.*;
import java.io.*;

public class Runner {
    public static void main(String[] args) {
        try{
            Account[] accounts = new Account[10];
            accounts[0] = new Account("192131", "Ali", 342444);
            accounts[1] = new Account("192132", "Saad", 4500);
            accounts[2] = new Account("192133", "Imran", 360000);
            accounts[3] = new Account("192134", "Faiza", 123123);
            accounts[4] = new Account("192135", "Azka", 120000);
            accounts[5] = new Account("192136", "Amir", 4300);
            accounts[6] = new Account("192137", "Arbab", 650000);
            accounts[7] = new Account("192138", "Umar", 34560);
            accounts[8] = new Account("192139", "Ashar", 76000);
            accounts[9] = new Account("192140", "Emaan", 12000);
        
            accounts[0].transfer(accounts[9], 4300);
        
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Account.txt"));
            for(int i=0; i<10; i++){
                oos.writeObject(accounts[i]);
            }
            oos.close();
            System.out.println("Run Successfull");
        }
        
        catch(Exception e){
            System.out.println("File not present or data wasnt stored.");
        }
    }
}
