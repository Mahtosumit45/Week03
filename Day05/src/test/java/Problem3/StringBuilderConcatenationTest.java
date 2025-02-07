package Problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringBuilderConcatenationTest {

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

    @Test
    void testStringBuilderConcatenateSmall() {
        StringBuilderConcatenation sbc = new StringBuilderConcatenation();
        long timeTaken = sbc.concatenate(100);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testStringBuilderConcatenateMedium() {
        StringBuilderConcatenation sbc = new StringBuilderConcatenation();
        long timeTaken = sbc.concatenate(10000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testStringBuilderConcatenateLarge() {
        StringBuilderConcatenation sbc = new StringBuilderConcatenation();
        long timeTaken = sbc.concatenate(100000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testStringBuilderConcatenateVeryLarge() {
        StringBuilderConcatenation sbc = new StringBuilderConcatenation();
        long timeTaken = sbc.concatenate(1000000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }
}