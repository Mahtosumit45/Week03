package BinarySearch.Problem3;

// MatrixUtils.java
public class MatrixUtils {
    private int[][] matrix;

    // Constructor to initialize the matrix
    public MatrixUtils(int[][] matrix) {
        this.matrix = matrix;
    }

    // Getter method to access the matrix
    public int[][] getMatrix() {
        return matrix;
    }

    // Method to get the number of rows in the matrix
    public int getRowCount() {
        return matrix.length;
    }

    // Method to get the number of columns in the matrix
    public int getColumnCount() {
        return matrix[0].length;
    }
}
