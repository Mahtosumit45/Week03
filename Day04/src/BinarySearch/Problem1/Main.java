package BinarySearch.Problem1;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Example of a rotated sorted array
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};

        // Create the RotationPointFinder object with the rotated array
        RotationPointFinder rotationPointFinder = new RotationPointFinder(rotatedArray);

        // Find and print the rotation point (smallest element)
        int rotationPoint = rotationPointFinder.findRotationPoint();
        System.out.println("The rotation point is: " + rotationPoint);
    }
}
