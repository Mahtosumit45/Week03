package DoublyLinkedList.LibraryManagementSystem;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return bookId + " | " + title + " | " + author + " | " + genre + " | " + (isAvailable ? "Available" : "Not Available");
    }
}
