package oop.labor05.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> students;
    private static final Student DEFAULT_STUDENT = new Student("default", "default", "default");



    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public Course getCourse() {
        return course;
    }

    public boolean enroll(Student student){
        for (Student s :students){
            if (s== student){
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public Student findStudentById(String id){
        for(Student s :students){
            if (s.getID().equals(id)){
                return s;
            }
        }
        return DEFAULT_STUDENT;
    }

    public int numEnrolled(){
        return this.students.toArray().length;
    }

    public void printToFile(){
        String courseN =course.getName();
        MyDate start =this.startDate;
        MyDate end =this.endDate;
        try(FileWriter writer = new FileWriter(courseN+"_"+start+"_"+end+".csv",true)){
           for(Student s: students){
               writer.write(s.toString());
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void unEnroll(String ID){
        for(Student s: students){
            if (s.getID().equals(ID)){
                students.remove(s);
            }
        }

    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", students=" + students +
                '}';
    }
}
