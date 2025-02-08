package Problem5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveTest {

    @Test
    void testFibonacciRecursive_SmallValues() {
        FibonacciRecursive fr = new FibonacciRecursive();
        assertEquals(0, fr.fibonacci(0));
        assertEquals(1, fr.fibonacci(1));
        assertEquals(1, fr.fibonacci(2));
        assertEquals(2, fr.fibonacci(3));
        assertEquals(5, fr.fibonacci(5));
        assertEquals(13, fr.fibonacci(7));
    }

    @Test
    void testFibonacciRecursive_LargeValue() {
        FibonacciRecursive fr = new FibonacciRecursive();
        assertEquals(832040, fr.fibonacci(30)); // Should return correct Fibonacci number
    }

    @Test
    void testFibonacciRecursive_Performance() {
        FibonacciRecursive fr = new FibonacciRecursive();
        long startTime = System.currentTimeMillis();
        fr.fibonacci(30); // This should be slow for large values
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime < 10000, "Recursive Fibonacci should not take too long for small values");
    }
}
