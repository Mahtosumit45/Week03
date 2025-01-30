package HashMapsAndHashFunctions.TwoSumProblem;

import java.util.HashMap;
import java.util.Map;

// Main class for testing
public class TwoSumTest {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        TwoSumSolver solver = new TwoSumSolver(arr, target);
        Pair result = solver.findTwoSum();

        if (result != null) {
            System.out.println("Pair found: " + result);
        } else {
            System.out.println("No pair found.");
        }
    }
}
