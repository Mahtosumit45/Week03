package Problem2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void testSortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testUnsortedArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int[] expected = {1, 1, 2, 3, 4, 5, 9};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSingleElementArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {42};
        int[] expected = {42};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {};
        int[] expected = {};
        mergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}