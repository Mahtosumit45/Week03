package HashMapsAndHashFunctions.SubarraysZero;

import java.util.*;
public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        SubarrayFinder finder = new SubarrayFinder(arr);
        List<Subarray> subarrays = finder.findZeroSumSubarrays();

        for (Subarray sub : subarrays) {
            System.out.println(sub);
        }
    }
}
