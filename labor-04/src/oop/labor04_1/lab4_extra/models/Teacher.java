package oop.labor04_1.lab4_extra.models;




public class Teacher {
    private static int currentNumberOfTeachers = 0;
    private final int teacherID;
    private String firstName;
    private String lastName;
    private String degree;
    private String department;

    public Teacher(String firstName, String lastName, String degree, String department) {
        teacherID = ++currentNumberOfTeachers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree.toUpperCase();
        this.department = department.toUpperCase();

    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return teacherID+" "+firstName + " " + lastName + " - " + degree + " from " + department + " department";
    }
}
