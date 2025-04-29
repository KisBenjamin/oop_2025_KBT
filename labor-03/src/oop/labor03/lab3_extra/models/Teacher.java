package oop.labor03.lab3_extra.models;

import oop.labor03.lab3_extra.enums.Degree;
import oop.labor03.lab3_extra.enums.Department;

public class Teacher {
    private static int currentNumberOfTeachers = 0;
    private final int teacherID;
    private String firstName;
    private String lastName;
    private Degree degree;
    private Department department;

    public Teacher(String firstName, String lastName, Degree degree, Department department) {
        teacherID = ++currentNumberOfTeachers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
    }

    public Degree getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return teacherID+" "+firstName + " " + lastName + " - " + degree + " from " + department + " department";
    }
}
