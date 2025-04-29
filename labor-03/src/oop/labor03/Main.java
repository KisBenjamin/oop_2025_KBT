package oop.labor03;
import oop.labor03.lab3_extra.enums.Degree;
import oop.labor03.lab3_extra.enums.Department;
import oop.labor03.lab3_extra.enums.Major;
import oop.labor03.lab3_extra.models.Course;
import oop.labor03.lab3_extra.models.Student;
import oop.labor03.lab3_extra.models.Teacher;

import java.time.DayOfWeek;



public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("AVLMO7", "Tai", "Bel", Major.INFORMATION_SCIENCE);
        Student student2 = new Student("KHI890", "John", "Watson", Major.COMPUTER_SCIENCE);
        Student student3 = new Student("KNJ89G", "Bill", "Meir", Major.MECHATRONICS);

        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.DOCENT, Department.MATHEMATICS_INFORMATICS);

        Course course1 = new Course("MB_INFO20", 5, DayOfWeek.FRIDAY);
        course1.assignTeacher(teacher1);

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course1.enrollStudent(student3);

        System.out.println(course1);


    }
}
