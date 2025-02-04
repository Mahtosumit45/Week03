package StringBuffer.Problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenationPerformanceTest {

    @Test
    void testMeasureStringBuffer() {
        long executionTime = ConcatenationPerformance.measureStringBuffer();

        // Ensuring execution time is positive
        assertTrue(executionTime > 0,"Execution time should be greater than zero.");
    }

    @Test
    void testMeasureStringBuilder() {
        long executionTime = ConcatenationPerformance.measureStringBuilder();

        // Ensuring execution time is positive
        assertTrue(executionTime > 0, "Execution time should be greater than zero.");
    }

    @Test
    void testPerformanceComparison() {
        long timeBuffer = ConcatenationPerformance.measureStringBuffer();
        long timeBuilder = ConcatenationPerformance.measureStringBuilder();

        // StringBuilder is generally faster than StringBuffer due to lack of synchronization
        System.out.println("StringBuffer Time: " + timeBuffer + " ns");
        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        assertTrue(timeBuilder <= timeBuffer, "StringBuilder should be as fast or faster than StringBuffer.");
    }
}
