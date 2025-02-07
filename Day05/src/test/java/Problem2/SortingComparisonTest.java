package Problem2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

class SortingComparisonTest {

    @Test
    void testSortingAlgorithms() {
        int[] sizes = {1000, 5000, 10000};
        Random random = new Random();

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(n);
            }

            int[] expected = Arrays.copyOf(arr, arr.length);
            Arrays.sort(expected);

            int[] arrBubble = Arrays.copyOf(arr, arr.length);
            new BubbleSort().sort(arrBubble);
            assertArrayEquals(expected, arrBubble, "Bubble Sort failed for size " + n);

            int[] arrMerge = Arrays.copyOf(arr, arr.length);
            new MergeSort().sort(arrMerge, 0, arrMerge.length - 1);
            assertArrayEquals(expected, arrMerge, "Merge Sort failed for size " + n);

            int[] arrQuick = Arrays.copyOf(arr, arr.length);
            new QuickSort().sort(arrQuick, 0, arrQuick.length - 1);
            assertArrayEquals(expected, arrQuick, "Quick Sort failed for size " + n);
        }
    }
}
