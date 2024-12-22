package Exercise_8;
/*
 Library System: Design a Book class with attributes like title, author, and ISBN. 
 Implement methods to display book details and check availability. 
 Create a Library class that can manage a collection of books (add, remove, and search for books).
 */

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Methods to display book details
    public void displayBookDetails() {
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
        System.out.println();
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    // Methods to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }
}

class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to remove a book by ISBN
    public void removeBook(int isbn) {
        boolean removed = false;
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to search for a book by title
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                book.displayBookDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title \"" + title + "\" not found.");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create books
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 12345);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 67890);
        Book book3 = new Book("1984", "George Orwell", 11223);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books
        library.displayAllBooks();

        // Search for a book
        library.searchBook("1984");

        // Remove a book
        library.removeBook(67890);

        // Display all books after removal
        library.displayAllBooks();
    }
}
