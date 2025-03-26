package oop.labor04_1.lab4_1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Lab_04");
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> persons = readFromCSVFile("lab4_1_input.csv");
        for(Person person : persons){
            System.out.println(person + "\n");
        }


    }

    public static void readFilePrintItsLineNumbered(String fileName){
        try( Scanner scanner = new Scanner(new File (fileName))){
        int numberS = 1;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(numberS + " " + line);
            numberS++;
        }
        }catch (FileNotFoundException e){
        e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName){
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                String Items[] = line.split(",");
                String firstName = Items[0].trim();
                String lastName = Items[1].trim();

                int birthYear = Integer.parseInt(Items[2].trim());
                persons.add(new Person(firstName,lastName,birthYear));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return persons;
    }
}
