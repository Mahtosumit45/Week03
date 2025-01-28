package DoublyLinkedList.MovieManagementSystem;

public class MovieManagementSystem {

    private Movie head;
    private Movie tail;

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;

            if (current.next != null) {
                current.next.prev = newMovie;
            } else {
                tail = newMovie;
            }

            current.next = newMovie;
        }
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title) {
        Movie current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
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

                System.out.println("Movie removed: " + title);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    // Search for movies by director or rating
    public void searchMovie(String director, Double rating) {
        Movie current = head;
        boolean found = false;

        while (current != null) {
            if ((director != null && current.director.equalsIgnoreCase(director)) ||
                    (rating != null && current.rating == rating)) {
                System.out.println("Found Movie: " + current);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No matching movie found.");
        }
    }

    // Display all movies in forward order
    public void displayMoviesForward() {
        Movie current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    // Display all movies in reverse order
    public void displayMoviesReverse() {
        Movie current = tail;
        while (current != null) {
            System.out.println(current);
            current = current.prev;
        }
    }

    // Update a movie's rating by title
    public void updateMovieRating(String title, double newRating) {
        Movie current = head;

        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Updated Rating for " + title + " to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found: " + title);
    }

    public static void main(String[] args) {
        MovieManagementSystem system = new MovieManagementSystem();

        // Adding movies
        system.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        system.addMovieAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        system.addMovieAtPosition(1, "Pulp Fiction", "Quentin Tarantino", 1994, 8.9);

        // Displaying movies
        System.out.println("Movies in forward order:");
        system.displayMoviesForward();

        System.out.println("\nMovies in reverse order:");
        system.displayMoviesReverse();

        // Searching for movies
        System.out.println("\nSearch results:");
        system.searchMovie("Christopher Nolan", null);

        // Updating a movie's rating
        system.updateMovieRating("Inception", 9.0);

        // Removing a movie
        system.removeMovieByTitle("The Godfather");

        // Displaying updated list
        System.out.println("\nUpdated movie list:");
        system.displayMoviesForward();
    }
}