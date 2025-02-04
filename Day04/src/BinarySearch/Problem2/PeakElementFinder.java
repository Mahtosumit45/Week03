package BinarySearch.Problem2;

// PeakElementFinder.java
public class PeakElementFinder {
    private ArrayUtils arrayUtils;

    // Constructor that takes an ArrayUtils object
    public PeakElementFinder(ArrayUtils arrayUtils) {
        this.arrayUtils = arrayUtils;
    }

    // Method to find a peak element in the array using binary search
    public int findPeakElement() {
        int[] arr = arrayUtils.getArray();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak element
            boolean isPeak = (mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] > arr[mid + 1]);

            if (isPeak) {
                return arr[mid]; // Return the peak element
            }

            // If the left neighbor is greater, search the left half
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Otherwise, search the right half
            else {
                left = mid + 1;
            }
        }

        // In case no peak is found, although this should never happen for a valid input
        return -1;
    }
}
