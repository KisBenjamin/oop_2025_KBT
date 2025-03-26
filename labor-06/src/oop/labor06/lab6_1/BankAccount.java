package oop.labor06.lab6_1;

import java.security.SecureRandom;

public class BankAccount {
    public final static String PREFIX = "BT";
    public final static int ACCOUNT_NUMBER_LENGTH = 10;
    private final String accountNumber;
    private static int numAccounts =0;
    private double balance;

    public BankAccount() {
        ++numAccounts;
        accountNumber=createAccountNumber();
    }

    private String createAccountNumber(){
        return String.format(PREFIX+"%08d",numAccounts);
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if (amount >balance){
            return false;
        }
        balance -=amount;
        return true;
    }

    public String toString(){
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }

}
