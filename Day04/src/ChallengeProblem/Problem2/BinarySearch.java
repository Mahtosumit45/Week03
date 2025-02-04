package ChallengeProblem.Problem2;

// BinarySearch.java
public class BinarySearch {
    private ListUtils listUtils;

    // Constructor that takes a ListUtils object
    public BinarySearch(ListUtils listUtils) {
        this.listUtils = listUtils;
    }

    // Method to perform binary search to find the target index
    public int searchTarget(int target) {
        int[] arr = listUtils.getArray();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
