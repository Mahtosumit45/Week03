package HashMapsAndHashFunctions.TwoSumProblem;

import java.util.HashMap;
import java.util.Map;

// Class that implements the two-sum logic
class TwoSumSolver {
    private int[] arr;
    private int target;

    public TwoSumSolver(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    public Pair findTwoSum() {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (numIndexMap.containsKey(complement)) {
                return new Pair(numIndexMap.get(complement), i);
            }

            numIndexMap.put(arr[i], i); // Store value and its index
        }

        return null; // No valid pair found
    }
}
