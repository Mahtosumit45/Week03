package Problem5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveMemoizedTest {

    @Test
    void testFibonacciRecursiveMemo_SmallValues() {
        FibonacciRecursiveMemoized frm = new FibonacciRecursiveMemoized();
        assertEquals(0, frm.fibonacci(0));
        assertEquals(1, frm.fibonacci(1));
        assertEquals(1, frm.fibonacci(2));
        assertEquals(2, frm.fibonacci(3));
        assertEquals(5, frm.fibonacci(5));
        assertEquals(13, frm.fibonacci(7));
    }

    @Test
    void testFibonacciRecursiveMemo_LargeValue() {
        FibonacciRecursiveMemoized frm = new FibonacciRecursiveMemoized();
        assertEquals(832040, frm.fibonacci(30)); // Should return correct Fibonacci number
    }

    @Test
    void testFibonacciRecursiveMemo_Performance() {
        FibonacciRecursiveMemoized frm = new FibonacciRecursiveMemoized();
        long startTime = System.currentTimeMillis();
        frm.fibonacci(50); // Should be much faster than naive recursion
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime < 100, "Memoized Fibonacci should be fast for large values");
    }
}
