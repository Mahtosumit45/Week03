package Problem2;
import java.util.Random;
public class SortingComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};
        Random random = new Random();
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        for (int n : sizes) {
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int[] arr3 = new int[n];

            for (int i = 0; i < n; i++) {
                int val = random.nextInt(n);
                arr1[i] = val;
                arr2[i] = val;
                arr3[i] = val;
            }

            System.out.println("Dataset size: " + n);

            long start = System.currentTimeMillis();
            bubbleSort.sort(arr1);
            long end = System.currentTimeMillis();
            System.out.println("Bubble Sort Time: " + (end - start) + " ms");

            start = System.currentTimeMillis();
            mergeSort.sort(arr2, 0, n - 1);
            end = System.currentTimeMillis();
            System.out.println("Merge Sort Time: " + (end - start) + " ms");

            start = System.currentTimeMillis();
            quickSort.sort(arr3, 0, n - 1);
            end = System.currentTimeMillis();
            System.out.println("Quick Sort Time: " + (end - start) + " ms");

            System.out.println();
        }
    }
}

