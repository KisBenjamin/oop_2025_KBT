package oop.labor08.lab8_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private static final Customer DEFAULT_CUSTOMER=new Customer("Def","Def");


    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int customerId){
        for(Customer c :customers){
            if(c.getId() == customerId){
                return c;
            }
        }
        return DEFAULT_CUSTOMER;
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public int numCustomers(){
        return customers.size();
    }

    private void printCustomers(PrintStream out){
        out.println("ID, Firstname, Last name, Number of bank accounts");
        for(Customer c :customers){
            out.println(c.getId() +", "+c.getFirstName()+", "+c.getLastName()+", "+c.getNumAccounts());
        }
    }

    public void printCustomersToStdout(){
        printCustomers(System.out);
    }

    public void printCustomersToFile(String filename){
        try(PrintStream out = new PrintStream(filename)){
        printCustomers(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
