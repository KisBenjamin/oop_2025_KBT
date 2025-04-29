package oop.labor09.exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private static ArrayListDictionary instance = null;
    private final ArrayList<String> words = new ArrayList<>();

    private ArrayListDictionary() {
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim().toLowerCase();
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
            Collections.sort(words);
        } catch (FileNotFoundException e) {
            System.out.println("Dictionary file not found: " + DICTIONARY_FILE);
        }
    }

    public static ArrayListDictionary newInstance() {
        if (instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String s) {
        if (!find(s)) {
            words.add(s);
            Collections.sort(words);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String s) {
        return Collections.binarySearch(words, s.toLowerCase()) >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }
}
