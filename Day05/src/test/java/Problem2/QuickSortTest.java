package Problem2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void testSortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testUnsortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int[] expected = {1, 1, 2, 3, 4, 5, 9};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSingleElementArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {42};
        int[] expected = {42};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {};
        int[] expected = {};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}
