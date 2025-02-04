package BinarySearch.Problem3;

// MatrixSearch.java
public class MatrixSearch {
    private MatrixUtils matrixUtils;

    // Constructor that takes a MatrixUtils object
    public MatrixSearch(MatrixUtils matrixUtils) {
        this.matrixUtils = matrixUtils;
    }

    // Method to search for the target in the 2D matrix using binary search
    public boolean searchTarget(int target) {
        int[][] matrix = matrixUtils.getMatrix();
        int rows = matrixUtils.getRowCount();
        int cols = matrixUtils.getColumnCount();

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            // Convert mid to 2D row and column
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return false; // Target not found
    }
}
