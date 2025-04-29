package oop.labor05.extra;

import java.util.*;

public class Library {
    private final String name;
    private final String address;
    private final ArrayList<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean checkOut(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isCheckedOut()) {
                b.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isCheckedOut()) return b;
        }
        return null;
    }

    public ArrayList<Book> getBooks() { return books; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" has ").append(books.size()).append(" books:\n");
        int i = 1;
        for (Book b : books) {
            sb.append(i++).append(". ").append(b.getTitle()).append(" by ").append(b.getAuthor())
                    .append(" (id: ").append(b.getId()).append(")\n");
        }
        return sb.toString();
    }

    public String getName() { return name; }
}
