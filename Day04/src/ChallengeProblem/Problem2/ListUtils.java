package ChallengeProblem.Problem2;

// ListUtils.java
public class ListUtils {
    private int[] arr;

    // Constructor to initialize the array
    public ListUtils(int[] arr) {
        this.arr = arr;
    }

    // Getter method to access the array
    public int[] getArray() {
        return arr;
    }

    // Method to sort the array
    public void sortArray() {
        java.util.Arrays.sort(arr);
    }
}
