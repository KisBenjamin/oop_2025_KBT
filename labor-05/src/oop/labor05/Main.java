package oop.labor05;
import oop.labor05.Model.*;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourse("courses.csv");
        for(Course c : courses){
            System.out.println(c);
        }

        ArrayList<Student> students = readStudent("students.csv");
        for (Student s : students){
            System.out.println(s);
        }
    }

    private static ArrayList<Course> readCourse(String filename) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                String[] array = line.split(",");
                String name = array[0];
                String descrip = array[1];
                int year = Integer.parseInt(array[2].trim());
                courses.add(new Course(name,descrip,year));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student> readStudent(String filename){
        ArrayList<Student> students = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine().trim();
                String[] read = line.split(",");
                String ID = read[0].trim();
                String firstName = read[1].trim();
                String lastName = read[2].trim();

                students.add(new Student(ID,firstName,lastName));
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }
}
