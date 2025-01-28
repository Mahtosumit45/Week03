package DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementSystem {

    private Book head;
    private Book tail;
    private int totalBooks;

    // Add a book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    // Add a book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    // Add a book at a specific position
    public void addBookAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position <= 0) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            newBook.next = current.next;
            newBook.prev = current;

            if (current.next != null) {
                current.next.prev = newBook;
            } else {
                tail = newBook;
            }

            current.next = newBook;
        }
        totalBooks++;
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        Book current = head;

        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                System.out.println("Book removed: " + bookId);
                totalBooks--;
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found: " + bookId);
    }

    // Search for books by title or author
    public void searchBook(String title, String author) {
        Book current = head;
        boolean found = false;

        while (current != null) {
            if ((title != null && current.title.equalsIgnoreCase(title)) ||
                    (author != null && current.author.equalsIgnoreCase(author))) {
                System.out.println("Found Book: " + current);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    // Update a book's availability status
    public void updateBookAvailability(int bookId, boolean isAvailable) {
        Book current = head;

        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                System.out.println("Updated Availability for Book ID " + bookId + " to " + (isAvailable ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found: " + bookId);
    }

    // Display all books in forward order
    public void displayBooksForward() {
        Book current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        Book current = tail;
        while (current != null) {
            System.out.println(current);
            current = current.prev;
        }
    }

    // Count total number of books
    public int countBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", 1, true);
        library.addBookAtBeginning("To Kill a Mockingbird", "Harper Lee", "Classic", 2, true);
        library.addBookAtPosition(1, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 3, false);

        // Displaying books
        System.out.println("Books in forward order:");
        library.displayBooksForward();

        System.out.println("\nBooks in reverse order:");
        library.displayBooksReverse();

        // Searching for books
        System.out.println("\nSearch results:");
        library.searchBook("1984", null);

        // Updating a book's availability
        library.updateBookAvailability(1, false);

        // Removing a book
        library.removeBookById(2);

        // Displaying updated list
        System.out.println("\nUpdated book list:");
        library.displayBooksForward();

        // Counting total books
        System.out.println("\nTotal books in the library: " + library.countBooks());
    }
}
