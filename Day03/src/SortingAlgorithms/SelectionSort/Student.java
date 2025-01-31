package SortingAlgorithms.SelectionSort;

public class Student {
    private String name;
    private int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

