package oop.labor04_1.lab4_extra.models;


import oop.labor04_1.lab4_extra.utils.Major;

public class Student {
    private String neptunCode;
    private String firstName;
    private String lastName;
    private String major;

    public Student(String neptunCode, String firstName, String lastName, String major) {
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + neptunCode + ")";
    }
}
