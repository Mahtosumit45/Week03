package StacksAndQueues.SlidingWindowMaximum;
import StacksAndQueues.Stack;
public class SlidingWindowMaximumTest {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SlidingWindow sw = new SlidingWindow();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println( "Input Array: ");
        printArray(nums);

        int[] result = sw.maxSlidingWindow(nums, k);
        System.out.println( "Sliding Window maximum: ");
        printArray(result);
    }
}
