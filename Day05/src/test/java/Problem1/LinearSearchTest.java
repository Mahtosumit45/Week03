package Problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void testSearchElementFound() {
        int[] data = {1, 3, 5, 7, 9};
        int target = 5;
        int index = LinearSearch.search(data, target);
        assertEquals(2, index, "The target should be found at index 2");
    }

    @Test
    void testSearchElementNotFound() {
        int[] data = {1, 3, 5, 7, 9};
        int target = 6;
        int index = LinearSearch.search(data, target);
        assertEquals(-1, index, "The target should not be found");
    }

    @Test
    void testSearchFirstElement() {
        int[] data = {1, 3, 5, 7, 9};
        int target = 1;
        int index = LinearSearch.search(data, target);
        assertEquals(0, index, "The target should be found at index 0");
    }

    @Test
    void testSearchLastElement() {
        int[] data = {1, 3, 5, 7, 9};
        int target = 9;
        int index = LinearSearch.search(data, target);
        assertEquals(4, index, "The target should be found at index 4");
    }
}
