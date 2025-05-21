/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import account.BankAccount;
import transactions.DepositTask;
import transactions.WithdrawTask;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread t1 = new Thread(new DepositTask(account, 500.0), "User-1");
        Thread t2 = new Thread(new WithdrawTask(account, 700.0), "User-2");
        Thread t3 = new Thread(new WithdrawTask(account, 400.0), "User-3");
        Thread t4 = new Thread(new DepositTask(account, 200.0), "User-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
