
package Problem5;

import java.util.HashMap;

public class FibonacciRecursiveMemoized {
    private HashMap<Integer, Integer> memo = new HashMap<>();

    public int fibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}

