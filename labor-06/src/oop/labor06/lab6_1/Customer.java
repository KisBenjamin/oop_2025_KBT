package oop.labor06.lab6_1;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private static int numCustomers = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        numCustomers++;
        id = numCustomers;
    }

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> temp = new ArrayList<>();

        for( BankAccount b: accounts){
            temp.add(b.getAccountNumber());
        }
        return temp;
    }

    public int getNumAccounts(){
        return accounts.size();
    }
    public int getId() {
        return id;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public void closeAccount(String accountNumber){
        for(BankAccount b : accounts){
            if(b.getAccountNumber().equals(accountNumber)){
                accounts.remove(b);
            }
        }
    }

    public BankAccount getAccount(String accountNumber){
        for (BankAccount account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
