package oop.labor04_1.lab4_extra.models;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private static final int MAX_STUDENTS = 120;
    private String courseID;
    private int numberOfCredits;
    private DayOfWeek dayOfCourse;
    private Teacher teacher;
    private List<Student> enrolledStudents;

    public Course(String courseID, int numberOfCredits, DayOfWeek dayOfCourse) {
        this.courseID = courseID;
        this.numberOfCredits = numberOfCredits;
        this.dayOfCourse = dayOfCourse;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseID() {
        return courseID;
    }

    public DayOfWeek getDayOfCourse() {
        return dayOfCourse;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < MAX_STUDENTS)
            enrolledStudents.add(student);
    }

    public void cancelEnrollment(String neptunCode) {
        enrolledStudents.removeIf(s -> s.getNeptunCode().equals(neptunCode));
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getNumberOfEnrolledStudents(){
        return enrolledStudents.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(courseID).append(":\n");
        sb.append("Teacher: ").append(teacher).append("\n");
        sb.append("Credits: ").append(numberOfCredits).append("\n");
        sb.append("Occurs every: ").append(dayOfCourse).append("\n");
        sb.append("Enrolled students: ").append(enrolledStudents.size()).append("\n");
        for (Student s : enrolledStudents) {
            sb.append("- ").append(s).append("\n");
        }
        return sb.toString();
    }

}
