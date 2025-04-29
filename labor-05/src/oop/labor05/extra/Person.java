package oop.labor05.extra;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private static final AtomicInteger personCount = new AtomicInteger(0);

    private final String firstName;
    private final String lastName;
    private final MyDate birthDate;
    private final String id;
    private final ArrayList<Book> booksReading;

    public Person(String firstName, String lastName, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = ("" + firstName.charAt(0) + lastName.charAt(0)).toUpperCase() + "_" + personCount.incrementAndGet();
        this.booksReading = new ArrayList<>();
    }

    public String getId() { return id; }
    public MyDate getBirthDate() { return birthDate; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public void borrowBook(Book book) {
        booksReading.add(book);
    }

    public void returnBook(int bookId) {
        booksReading.removeIf(book -> book.getId() == bookId);
    }

    public int countBorrowedBooks() {
        return booksReading.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(lastName).append(", born").append(birthDate).append("\n");
        if (booksReading.isEmpty()) {
            sb.append("No books");
        } else {
            sb.append("Books: ");
            for (int i = 0; i < booksReading.size(); i++) {
                sb.append(booksReading.get(i).getTitle());
                if (i != booksReading.size() - 1) sb.append(", ");
            }
        }
        return sb.toString();
    }
}