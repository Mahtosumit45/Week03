package BinarySearch.Problem2;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Example array with a peak element
        int[] array = {1, 3, 20, 4, 1, 0};

        // Create an ArrayUtils object
        ArrayUtils arrayUtils = new ArrayUtils(array);

        // Create a PeakElementFinder object using the ArrayUtils object
        PeakElementFinder peakElementFinder = new PeakElementFinder(arrayUtils);

        // Find and print the peak element
        int peak = peakElementFinder.findPeakElement();
        System.out.println("The peak element is: " + peak);
    }
}

