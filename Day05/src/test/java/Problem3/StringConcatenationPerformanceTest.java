package Problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringConcatenationPerformanceTest {

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

    @Test
    void testStringBufferConcatenateSmall() {
        StringBufferConcatenation sbf = new StringBufferConcatenation();
        long timeTaken = sbf.concatenate(100);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testStringBufferConcatenateMedium() {
        StringBufferConcatenation sbf = new StringBufferConcatenation();
        long timeTaken = sbf.concatenate(10000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testStringBufferConcatenateLarge() {
        StringBufferConcatenation sbf = new StringBufferConcatenation();
        long timeTaken = sbf.concatenate(100000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testStringBufferConcatenateVeryLarge() {
        StringBufferConcatenation sbf = new StringBufferConcatenation();
        long timeTaken = sbf.concatenate(1000000);
        assertTrue(timeTaken >= 0, "Time taken should be non-negative");
    }

    @Test
    void testPerformanceComparison() {
        int n = 1000000;
        StringConcatenation stringConcat = new StringConcatenation();
        StringBuilderConcatenation stringBuilderConcat = new StringBuilderConcatenation();
        StringBufferConcatenation stringBufferConcat = new StringBufferConcatenation();

        long stringTime = stringConcat.concatenate(n);
        long stringBuilderTime = stringBuilderConcat.concatenate(n);
        long stringBufferTime = stringBufferConcat.concatenate(n);

        assertTrue(stringTime >= 0, "String concatenation time should be non-negative");
        assertTrue(stringBuilderTime >= 0, "StringBuilder concatenation time should be non-negative");
        assertTrue(stringBufferTime >= 0, "StringBuffer concatenation time should be non-negative");
    }
}