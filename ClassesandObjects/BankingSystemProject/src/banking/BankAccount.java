/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author Afnan's Laptop
 */
abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected String balance;

    public BankAccount(String accountNumber, String accountHolderName, String balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void deposit(String depositAmount);
    public abstract void withdrawal(String withDrawAmount);

    public String getBalance() {
        return balance;
    }
}
