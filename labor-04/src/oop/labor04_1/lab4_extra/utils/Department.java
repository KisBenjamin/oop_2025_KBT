package oop.labor04_1.lab4_extra.utils;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private static final List<String> departments = new ArrayList<>();

    static {
        departments.add("APPLIED_LINGUISTICS");
        departments.add("APPLIED_SOCIAL_SCIENCE");
        departments.add("ELECTRICAL_ENGINEERING");
        departments.add("HORTICULTURE");
        departments.add("MATHEMATICS_INFORMATICS");
        departments.add("MECHANICAL_ENGINEERING");
    }

    public static void addDepartment(String newDepartment) {
        if (!departments.contains(newDepartment.toUpperCase())) {
            departments.add(newDepartment.toUpperCase());
        }
    }

    public static boolean contains(String department) {
        return departments.contains(department.toUpperCase());
    }

    @Override
    public String toString() {
        return String.join(", ", departments);
    }
}