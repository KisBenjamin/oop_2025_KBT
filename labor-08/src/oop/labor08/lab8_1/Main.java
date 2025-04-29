package oop.labor08.lab8_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("OTP");
        Customer customer1 = new Customer("Kis","Feri");
        Customer customer2 = new Customer("Jozsef","Attila");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        SavingsAccount sAc1 = new SavingsAccount(0.05);
        CheckingAccount cAc1 = new CheckingAccount(200);

        SavingsAccount sAc2 = new SavingsAccount(0.04);
        CheckingAccount cAc2 = new CheckingAccount(500);

        customer1.addAccount(sAc1);
        customer1.addAccount(cAc1);
        customer2.addAccount(sAc2);
        customer2.addAccount(cAc2);

        sAc1.deposit(100);
        cAc1.deposit(50);

        sAc2.deposit(200);
        cAc2.deposit(100);

        System.out.println("After deposit");
        for(BankAccount a: customer1.getAccounts() ){
            System.out.println(a);
        }
        for(BankAccount a: customer2.getAccounts() ){
            System.out.println(a);
        }

        sAc1.addInterest();
        sAc2.addInterest();

        System.out.println("After interest:");
        for(BankAccount a: customer1.getAccounts() ){
            System.out.println(a);
        }
        for(BankAccount a: customer2.getAccounts() ){
            System.out.println(a);
        }

        sAc1.withdraw(50);
        sAc1.withdraw(500);

        sAc2.withdraw(40);
        cAc2.withdraw(344);

        System.out.println("After withdrawals:");
        for(BankAccount a: customer1.getAccounts() ){
            System.out.println(a);
        }
        for(BankAccount a: customer2.getAccounts() ){
            System.out.println(a);
        }





    }
}
