package ChallengeProblem.Problem2;

// LinearSearch.java
public class LinearSearch {
    private ListUtils listUtils;

    // Constructor that takes a ListUtils object
    public LinearSearch(ListUtils listUtils) {
        this.listUtils = listUtils;
    }

    // Method to find the first missing positive integer
    public int findFirstMissingPositive() {
        int[] arr = listUtils.getArray();
        int n = arr.length;

        // Step 1: Mark numbers as negative to indicate "visited" positions
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                continue; // Skip invalid numbers
            }

            int index = Math.abs(arr[i]) - 1; // Convert value to index
            if (arr[index] > 0) {
                arr[index] = -arr[index]; // Mark as visited by making it negative
            }
        }

        // Step 2: Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1; // Return the first missing positive integer
            }
        }

        return n + 1; // If all numbers from 1 to n are present, return n + 1
    }
}

