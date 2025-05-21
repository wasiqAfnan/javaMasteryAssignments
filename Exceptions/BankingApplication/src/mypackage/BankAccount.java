/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;
public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, String balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = (double)balance;
        System.out.println(this.balance.getclass().getname());
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount)throws InsufficientBalanceException {
        if(amount > this.balance){
            throw new InsufficientBalanceException("Withdrawal amount is greater than Balance");
        }
        else{
            this.balance-=amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance=" + balance + '}';
    } 
}
