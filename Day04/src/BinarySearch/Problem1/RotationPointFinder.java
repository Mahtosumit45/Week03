package BinarySearch.Problem1;

// RotationPointFinder.java
public class RotationPointFinder {
    private int[] arr;

    // Constructor to initialize the array
    public RotationPointFinder(int[] arr) {
        this.arr = arr;
    }

    // Method to find the rotation point (smallest element in the array)
    public int findRotationPoint() {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            // If middle element is greater than the rightmost element, the rotation point is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // If middle element is less than or equal to the rightmost element, the rotation point is in the left half
            else {
                right = mid;
            }
        }

        // At the end of the loop, left == right, and it points to the rotation point
        return arr[left];
    }
}
