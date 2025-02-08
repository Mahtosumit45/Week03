package Problem5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciComparisonTest {

    @Test
    void testPerformanceComparison() {
        int n = 30; // Test for a reasonable value to compare performance

        FibonacciRecursive recursive = new FibonacciRecursive();
        FibonacciRecursiveMemoized recursiveMemoized = new FibonacciRecursiveMemoized();
        FibonacciIterative iterative = new FibonacciIterative();

        // Measure recursive execution time
        long startTime = System.currentTimeMillis();
        int recursiveResult = recursive.fibonacci(n);
        long recursiveTime = System.currentTimeMillis() - startTime;

        // Measure recursive memoized execution time
        startTime = System.currentTimeMillis();
        int recursiveMemoResult = recursiveMemoized.fibonacci(n);
        long recursiveMemoTime = System.currentTimeMillis() - startTime;

        // Measure iterative execution time
        startTime = System.currentTimeMillis();
        int iterativeResult = iterative.fibonacci(n);
        long iterativeTime = System.currentTimeMillis() - startTime;

        // Verify correctness of results
        assertEquals(recursiveResult, recursiveMemoResult, "Recursive and memoized results should match");
        assertEquals(recursiveResult, iterativeResult, "Recursive and iterative results should match");

        // Ensure that iterative is significantly faster than naive recursion
        assertTrue(iterativeTime < recursiveTime, "Iterative approach should be faster than naive recursion");
        assertTrue(recursiveMemoTime < recursiveTime, "Memoized recursion should be faster than naive recursion");
    }
}
