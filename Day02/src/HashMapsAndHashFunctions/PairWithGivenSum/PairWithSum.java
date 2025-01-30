package HashMapsAndHashFunctions.PairWithGivenSum;
import java.util.HashSet;
import java.util.Set;
public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        PairFinder finder = new PairFinder(arr, target);
        if (!finder.hasPairWithSum()) {
            System.out.println("No pair found.");
        }
    }
}
