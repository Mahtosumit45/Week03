package BinarySearch.Problem4;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 6};

        // Create SortedArrayUtils object
        SortedArrayUtils sortedArrayUtils = new SortedArrayUtils(arr);

        // Create BinarySearchForOccurrences object
        BinarySearchForOccurrences binarySearch = new BinarySearchForOccurrences(sortedArrayUtils);

        // Example target value to search for
        int target = 3;

        // Find the first and last occurrences
        int firstOccurrence = binarySearch.findFirstOccurrence(target);
        int lastOccurrence = binarySearch.findLastOccurrence(target);

        // Print the result
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
            System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
