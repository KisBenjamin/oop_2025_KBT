package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankList = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        for(int i=1;i<=150;i++){
            bankList.add(new BankAccount());
        }

        for(BankAccount b : bankList){
            System.out.println(b);
        }

        Customer c = new Customer("Kis","Jozsi");
        Customer c1 = new Customer("Nagy","Ferenc");
        Customer c2 = new Customer("Elekes","Geza");
        c.addAccount(bankList.get(1));
        c.addAccount(bankList.get(12));
        c.addAccount(bankList.get(23));
        c1.addAccount(bankList.get(20));
        c2.addAccount(bankList.get(34));
        c2.addAccount(bankList.get(64));
        customers.add(c);
        customers.add(c1);
        customers.add(c2);

        for(Customer co :customers){
            System.out.println(co);
        }


        System.out.println("\n");

        Bank bt = new Bank("BT");
        bt.addCustomer(c2);
        bt.addCustomer(c1);

        System.out.println(bt.getCustomer(1));
    }
}
