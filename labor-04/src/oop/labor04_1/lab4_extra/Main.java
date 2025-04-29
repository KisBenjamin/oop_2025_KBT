package oop.labor04_1.lab4_extra;

import oop.labor04_1.lab4_extra.models.Course;
import oop.labor04_1.lab4_extra.models.Student;
import oop.labor04_1.lab4_extra.models.Teacher;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("AVLMO7", "Kis","Bella", "Dentistry");
        Student student2 = new Student("KHI890", "Lajos", "Feri", "Veterinary Medicine");
        Student student3 = new Student("KNJ89G", "Gyozo", "Angyal", "Pharmacy");
        Student student4 = new Student("XYZ123", "Kerus", "Jonas", "Computer Science");
        Student student5 = new Student("ABC456", "Mark", "Andras", "Mechanical Engineering");

        Teacher teacher1 = new Teacher("Lakatos", "Geza", "Labor Technician", "Medical Department");
        Teacher teacher2 = new Teacher("Janos", "Boldizsar", "Senior Lecturer", "Engineering Department");


        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);
        course1.assignTeacher(teacher1);

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.enrollStudent(student3);

        System.out.println(course1);
    }
}
