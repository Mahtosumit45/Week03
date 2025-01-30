package HashMapsAndHashFunctions.SubarraysZero;

import java.util.*;
class SubarrayFinder {
    private int[] arr;

    public SubarrayFinder(int[] arr) {
        this.arr = arr;
    }

    public List<Subarray> findZeroSumSubarrays() {
        List<Subarray> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        // Handle subarrays starting from index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                for (int startIdx : sumMap.get(sum)) {
                    result.add(new Subarray(startIdx + 1, i));
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
        return result;
    }
}

