package oop.labor09.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Which word ? (Enter 'end' to exit): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println("Find(" + word + "): " + service.findWord(word));
        }

        System.out.println("Unknown words:");
        System.out.println(service.findWordsFile("text_to_find.txt"));
        scanner.close();
    }
}
