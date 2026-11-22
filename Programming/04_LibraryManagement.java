
import java.util.ArrayList;

class Book {
    int id;
    String title;
    boolean issued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        issued = false;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued: " + b.title);
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.issued) {
                b.issued = false;
                System.out.println("Book returned: " + b.title);
                return;
            }
        }
        System.out.println("Invalid book ID or book not issued.");
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.id + " - " + b.title
                    + " - " + (b.issued ? "Issued" : "Available"));
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(1, "Java Programming"));
        lib.addBook(new Book(2, "Data Structures"));

        System.out.println("\nLibrary Books:");
        lib.displayBooks();

        System.out.println("\nIssuing Book:");
        lib.issueBook(1);

        System.out.println("\nReturning Book:");
        lib.returnBook(1);

        System.out.println("\nUpdated Book List:");
        lib.displayBooks();
    }
}
