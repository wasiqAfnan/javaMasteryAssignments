/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author Afnan's Laptop
 */
public class SavingsAccount extends BankAccount {
    private String interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, String balance, String interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(String depositAmount) {
        double currentBalance = Double.parseDouble(balance);
        double deposit = Double.parseDouble(depositAmount);
        currentBalance += deposit;
        balance = String.valueOf(currentBalance);
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    @Override
    public void withdrawal(String withDrawAmount) {
        double currentBalance = Double.parseDouble(balance);
        double withdraw = Double.parseDouble(withDrawAmount);
        if (currentBalance - withdraw >= 5000) {
            currentBalance -= withdraw;
            balance = String.valueOf(currentBalance);
            System.out.println("Withdrawal successful. New Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of 5000 must be maintained.");
        }
    }

    public void calculateInterest() {
        double currentBalance = Double.parseDouble(balance);
        double interest = (Double.parseDouble(interestRate) / 100) * currentBalance;
        System.out.println("Interest Earned: " + interest);
    }
}
