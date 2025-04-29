package oop.labor04_1.lab4_extra.utils;

import java.util.ArrayList;
import java.util.List;

public class Major {
    private static final List<String> majors = new ArrayList<>();

    static {
        majors.add("AUTOMATION_AND_APPLIED_INFORMATICS");
        majors.add("COMMUNICATION_AND_PUBLIC_RELATIONS");
        majors.add("COMPUTER_SCIENCE");
        majors.add("HORTICULTURAL_ENGINEERING");
        majors.add("INFORMATION_SCIENCE");
        majors.add("LANDSCAPE_ARCHITECTURE");
        majors.add("MANUFACTURING_ENGINEERING");
        majors.add("MECHATRONICS");
        majors.add("PUBLIC_HEALTH_SERVICES_AND_POLICIES");
        majors.add("TELECOMMUNICATION");
        majors.add("TRANSLATION_AND_INTERPRETING_STUDIES");
    }

    public static void addMajor(String newMajor) {
        if (!majors.contains(newMajor.toUpperCase())) {
            majors.add(newMajor.toUpperCase());
        }
    }

    public static boolean contains(String major) {
        return majors.contains(major.toUpperCase());
    }

    @Override
    public String toString() {
        return String.join(", ", majors);
    }
}