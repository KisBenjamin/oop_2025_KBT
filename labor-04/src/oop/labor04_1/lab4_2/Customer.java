package oop.labor04_1.lab4_2;


import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void addAccount(BankAccount account){
        if(numAccounts >= MAX_ACCOUNTS){return;}
        accounts.add(account);
        numAccounts++;
    }

    public void closeAccount(String accountNumber){
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));


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
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount account : accounts){
            result.append( "\t" + account +"\n");
        }
        return result.toString();
    }

}
