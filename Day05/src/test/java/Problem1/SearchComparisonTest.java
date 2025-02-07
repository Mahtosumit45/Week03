package Problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Random;

class SearchComparisonTest {

    @Test
    void testSearchPerformance() {
        int size = 1000;
        int[] data = DataGenerator.generateData(size);
        Random rand = new Random();
        int target = data[rand.nextInt(size)]; // Pick a random target

        // Measure Linear Search time
        long start = System.nanoTime();
        int linearIndex = LinearSearch.search(data, target);
        long linearTime = System.nanoTime() - start;

        // Ensure linear search found the target
        assertNotEquals(-1, linearIndex, "Linear search should find the target");

        // Measure Binary Search time (after sorting)
        Arrays.sort(data);
        start = System.nanoTime();
        int binaryIndex = BinarySearch.search(data, target);
        long binaryTime = System.nanoTime() - start;

        // Ensure binary search found the target
        assertNotEquals(-1, binaryIndex, "Binary search should find the target");

        System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");

        // Check that binary search is faster after sorting
        assertTrue(binaryTime <= linearTime, "Binary search should be faster than linear search after sorting");
    }
}