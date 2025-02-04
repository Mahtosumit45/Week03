package BinarySearch.Problem4;

// BinarySearchForOccurrences.java
public class BinarySearchForOccurrences {
    private SortedArrayUtils sortedArrayUtils;

    // Constructor that takes a SortedArrayUtils object
    public BinarySearchForOccurrences(SortedArrayUtils sortedArrayUtils) {
        this.sortedArrayUtils = sortedArrayUtils;
    }

    // Method to find the first occurrence of a target in a sorted array using binary search
    public int findFirstOccurrence(int target) {
        int[] arr = sortedArrayUtils.getArray();
        int left = 0;
        int right = arr.length - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                firstIndex = mid;
                right = mid - 1; // Continue to search on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstIndex;
    }

    // Method to find the last occurrence of a target in a sorted array using binary search
    public int findLastOccurrence(int target) {
        int[] arr = sortedArrayUtils.getArray();
        int left = 0;
        int right = arr.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                lastIndex = mid;
                left = mid + 1; // Continue to search on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastIndex;
    }
}

