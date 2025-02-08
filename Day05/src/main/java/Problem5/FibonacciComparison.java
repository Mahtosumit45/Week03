package Problem5;

public class FibonacciComparison {
    public static void main(String[] args) {
        int n = 30; // Change to test larger values

        FibonacciRecursive recursive = new FibonacciRecursive();
        FibonacciRecursiveMemoized recursiveMemoized = new FibonacciRecursiveMemoized();
        FibonacciIterative iterative = new FibonacciIterative();

        System.out.println("Comparing Fibonacci Computation Performance:");

        long start = System.currentTimeMillis();
        int recursiveResult = recursive.fibonacci(n);
        long recursiveTime = System.currentTimeMillis() - start;
        System.out.println("Recursive Fibonacci (" + n + "): " + recursiveResult + " | Time: " + recursiveTime + " ms");

        start = System.currentTimeMillis();
        int recursiveMemoResult = recursiveMemoized.fibonacci(n);
        long recursiveMemoTime = System.currentTimeMillis() - start;
        System.out.println("Recursive with Memoization Fibonacci (" + n + "): " + recursiveMemoResult + " | Time: " + recursiveMemoTime + " ms");

        start = System.currentTimeMillis();
        int iterativeResult = iterative.fibonacci(n);
        long iterativeTime = System.currentTimeMillis() - start;
        System.out.println("Iterative Fibonacci (" + n + "): " + iterativeResult + " | Time: " + iterativeTime + " ms");

        System.out.println("\nIterative approach is " + (double) recursiveTime / iterativeTime + " times faster than the naive recursive approach.");
    }
}
