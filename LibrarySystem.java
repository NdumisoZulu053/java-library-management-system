import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String id;
    private String title;
    private boolean isBorrowed;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("[INFO] Borrowed: " + title);
        } else {
            // DEBUG: Track item availability state
            System.out.println("[DEBUG] Item '" + title + "' is already checked out.");
        }
    }

    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("[INFO] Returned: " + title);
        } else {
            // DEBUG: Catch redundant returns
            System.out.println("[DEBUG] Item '" + title + "' was not marked as borrowed.");
        }
    }

    public abstract void displayDetails();
}

class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String id, String title, String author, String isbn) {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    @Override
    public void displayDetails() {
        System.out.println("[Book] ID: " + getId() + " | Title: " + getTitle() + 
                           " | Author: " + author + " | ISBN: " + isbn + 
                           " | Status: " + (isBorrowed() ? "Borrowed" : "Available"));
    }
}

class LibraryManager {
    private List<LibraryItem> catalog = new ArrayList<>();

    public void addItem(LibraryItem item) {
        catalog.add(item);
        // DEBUG: Verify item insertion into catalog
        System.out.println("[DEBUG] Added to catalog: " + item.getTitle());
    }

    public LibraryItem findItem(String id) {
        for (LibraryItem item : catalog) {
            if (item.getId().equalsIgnoreCase(id)) {
                return item;
            }
        }
        // DEBUG: Trace lookup failures
        System.out.println("[DEBUG] Item with ID " + id + " not found.");
        return null;
    }

    public void showCatalog() {
        System.out.println("\n--- Library Catalog ---");
        for (LibraryItem item : catalog) {
            item.displayDetails();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.addItem(new Book("B101", "Clean Code", "Robert C. Martin", "978-0132350884"));
        manager.addItem(new Book("B102", "Design Patterns", "Erich Gamma", "978-0201633610"));

        manager.showCatalog();

        System.out.println("\n--- Processing Transactions ---");
        LibraryItem book = manager.findItem("B101");
        if (book != null) {
            book.borrowItem();
            book.borrowItem(); // Triggers debug check
            book.returnItem();
        }
    }
}