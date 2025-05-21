/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication;
import mypackage.*;

public class BankingApplication {
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount acc1 = new BankAccount(123456, "Subhra", 1000);
        acc1.deposit(1000);
        
        System.out.println(acc1);
        
        try{
            acc1.withdraw(2500);
        }
        catch(Exception InsufficientBalanceException){
            System.out.println(InsufficientBalanceException.toString());
        }
    }  
}

