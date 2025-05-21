/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import banking.SavingsAccount;
import java.util.Scanner;


/**
 *
 * @author Afnan's Laptop
 */
public class BankMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        String balance = scanner.nextLine();
        
        System.out.print("Enter Interest Rate: ");
        String interestRate = scanner.nextLine();

        SavingsAccount acc = new SavingsAccount(accountNumber, accountHolderName, balance, interestRate);
        
        System.out.print("Enter deposit amount: ");
        String depositAmount = scanner.nextLine();
        acc.deposit(depositAmount);
        
        System.out.print("Enter withdrawal amount: ");
        String withdrawAmount = scanner.nextLine();
        acc.withdrawal(withdrawAmount);
        
        acc.calculateInterest();

        scanner.close();
    }
    
}
