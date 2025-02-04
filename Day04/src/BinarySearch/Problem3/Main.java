package BinarySearch.Problem3;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Example 2D sorted matrix
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        // Create MatrixUtils object
        MatrixUtils matrixUtils = new MatrixUtils(matrix);

        // Create MatrixSearch object
        MatrixSearch matrixSearch = new MatrixSearch(matrixUtils);

        // Example target value to search for
        int target = 4;

        // Search for the target and print the result
        boolean found = matrixSearch.searchTarget(target);
        System.out.println("Target " + target + (found ? " found." : " not found."));
    }
}
