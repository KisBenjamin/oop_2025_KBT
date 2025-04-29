package oop.labor05.extra;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Library> libraries = readLibraries("libraries.csv");
        printLibraries(libraries);
    }

    public static List<Library> readLibraries(String filename) throws IOException {
        List<Library> libraries = new ArrayList<>();
        Map<String, Library> libMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 6) continue;
                String libName = parts[0];
                String libAddress = parts[1];
                String isbn = parts[2];
                String title = parts[3];
                String author = parts[4];
                int pages = Integer.parseInt(parts[5]);

                Library lib = libMap.computeIfAbsent(libName, k -> new Library(libName, libAddress));
                lib.addBook(new Book(isbn, pages, title, author));
            }
        }

        libraries.addAll(libMap.values());
        return libraries;
    }

    public static void printLibraries(List<Library> libraries) throws IOException {
        for (Library lib : libraries) {
            String fileName = lib.getName().replace(" ", "_") + "_" + lib.getBooks().size() + ".txt";
            try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                pw.print(lib);
            }
        }
    }
}