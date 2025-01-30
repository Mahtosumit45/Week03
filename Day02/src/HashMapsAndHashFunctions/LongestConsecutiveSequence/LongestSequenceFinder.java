package HashMapsAndHashFunctions.LongestConsecutiveSequence;
import java.util.HashSet;
import java.util.Set;
public class LongestSequenceFinder {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2, 5, 6};
        LongestConsecutiveSequence sequenceFinder = new LongestConsecutiveSequence(arr);
        int longestSequence = sequenceFinder.findLongestConsecutiveSequence();
        System.out.println("Length of the longest consecutive sequence: " + longestSequence);
    }
}
