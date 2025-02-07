package Problem2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testUnsortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int[] expected = {1, 1, 2, 3, 4, 5, 9};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSingleElementArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {42};
        int[] expected = {42};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {};
        int[] expected = {};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}