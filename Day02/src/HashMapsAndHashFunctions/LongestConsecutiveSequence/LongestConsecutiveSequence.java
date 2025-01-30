package HashMapsAndHashFunctions.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {
    private int[] arr;

    public LongestConsecutiveSequence(int[] arr) {
        this.arr = arr;
    }

    public int findLongestConsecutiveSequence() {
        if (arr == null || arr.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : arr) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
