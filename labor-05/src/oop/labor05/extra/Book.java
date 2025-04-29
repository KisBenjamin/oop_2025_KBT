package oop.labor05.extra;
import java.util.concurrent.atomic.AtomicInteger;


public class Book implements Comparable<Book> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private final String isbn;
    private int numPages;
    private boolean checkedOut;
    private final String title;
    private final String author;

    public Book(String isbn, int numPages, String title, String author) {
        this.id = count.incrementAndGet();
        this.isbn = isbn;
        this.numPages = numPages;
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public int getId() { return id; }
    public String getIsbn() { return isbn; }
    public int getNumPages() { return numPages; }
    public void setNumPages(int numPages) { this.numPages = numPages; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isCheckedOut() { return checkedOut; }
    public void setCheckedOut(boolean checkedOut) { this.checkedOut = checkedOut; }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
