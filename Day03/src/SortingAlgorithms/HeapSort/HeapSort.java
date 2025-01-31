package SortingAlgorithms.HeapSort;

public class HeapSort {

    // Method to perform heap sort
    public static void sort(JobApplicant[] applicants) {
        int n = applicants.length;

        // Build the max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(applicants, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            JobApplicant temp = applicants[0];
            applicants[0] = applicants[i];
            applicants[i] = temp;

            // Reheapify the reduced heap
            heapify(applicants, i, 0);
        }
    }

    // Method to heapify a subtree rooted at index i
    private static void heapify(JobApplicant[] applicants, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && applicants[left].getSalary() > applicants[largest].getSalary()) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && applicants[right].getSalary() > applicants[largest].getSalary()) {
            largest = right;
        }

        // If largest is not root, swap and recursively heapify the affected subtree
        if (largest != i) {
            JobApplicant temp = applicants[i];
            applicants[i] = applicants[largest];
            applicants[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(applicants, n, largest);
        }
    }
}
