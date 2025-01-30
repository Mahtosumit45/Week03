package HashMapsAndHashFunctions.PairWithGivenSum;

import java.util.HashSet;
import java.util.Set;

class PairFinder {
    private int[] arr;
    private int target;

    public PairFinder(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    public boolean hasPairWithSum() {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }
            seenNumbers.add(num);
        }

        return false;
    }
}
