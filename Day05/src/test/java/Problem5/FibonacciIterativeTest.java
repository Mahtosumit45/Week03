package Problem5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciIterativeTest {

    @Test
    void testFibonacciIterative_SmallValues() {
        FibonacciIterative fi = new FibonacciIterative();
        assertEquals(0, fi.fibonacci(0));
        assertEquals(1, fi.fibonacci(1));
        assertEquals(1, fi.fibonacci(2));
        assertEquals(2, fi.fibonacci(3));
        assertEquals(5, fi.fibonacci(5));
        assertEquals(13, fi.fibonacci(7));
    }

    @Test
    void testFibonacciIterative_LargeValue() {
        FibonacciIterative fi = new FibonacciIterative();
        assertEquals(832040, fi.fibonacci(30)); // Should return correct Fibonacci number
    }

    @Test
    void testFibonacciIterative_Performance() {
        FibonacciIterative fi = new FibonacciIterative();
        long startTime = System.currentTimeMillis();
        fi.fibonacci(50); // Should be very fast
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime < 10, "Iterative Fibonacci should be extremely fast");
    }
}
