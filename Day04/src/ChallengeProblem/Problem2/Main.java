package ChallengeProblem.Problem2;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 4, -1, 1};

        // Create ListUtils object
        ListUtils listUtils = new ListUtils(arr);

        // Create LinearSearch object
        LinearSearch linearSearch = new LinearSearch(listUtils);

        // Find the first missing positive integer
        int firstMissingPositive = linearSearch.findFirstMissingPositive();
        System.out.println("First missing positive integer: " + firstMissingPositive);

        // Sort the array before performing binary search
        listUtils.sortArray();

        // Create BinarySearch object
        BinarySearch binarySearch = new BinarySearch(listUtils);

        // Example target value to search for
        int target = 4;

        // Perform binary search for the target
        int targetIndex = binarySearch.searchTarget(target);
        System.out.println("Target " + target + " is found at index: " + targetIndex);
    }
}
