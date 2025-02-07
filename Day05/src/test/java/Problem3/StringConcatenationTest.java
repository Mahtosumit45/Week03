package Problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringConcatenationTest {

    @Test
    void testConcatenateSmall() {
        StringConcatenation sc = new StringConcatenation();
        long timeTaken = sc.concatenate(100);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testConcatenateMedium() {
        StringConcatenation sc = new StringConcatenation();
        long timeTaken = sc.concatenate(10000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testConcatenateLarge() {
        StringConcatenation sc = new StringConcatenation();
        long timeTaken = sc.concatenate(100000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }
}