package oop.labor04_1.lab4_extra.utils;

import java.util.ArrayList;
import java.util.List;

public class Degree {
    private static final List<String> degrees = new ArrayList<>();

    static {
        degrees.add("ASSISTANT");
        degrees.add("ADJUNCT");
        degrees.add("PROFESSOR");
        degrees.add("DOCENT");
    }

    public static void addDegree(String newDegree) {
        if (!degrees.contains(newDegree.toUpperCase())) {
            degrees.add(newDegree.toUpperCase());
        }
    }

    public static boolean contains(String degree) {
        return degrees.contains(degree.toUpperCase());
    }

    @Override
    public String toString() {
        return String.join(", ", degrees);
    }
}