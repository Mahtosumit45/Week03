package Problem1;
import java.util.Arrays;
import java.util.Random;
public class SearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();

        for (int size : sizes) {
            int[] data = DataGenerator.generateData(size);
            int target = data[rand.nextInt(size)]; // Pick a random target

            // Measure Linear Search time
            long start = System.nanoTime();
            LinearSearch.search(data, target);
            long linearTime = System.nanoTime() - start;

            // Measure Binary Search time (after sorting)
            Arrays.sort(data);
            start = System.nanoTime();
            BinarySearch.search(data, target);
            long binaryTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println("-------------------------------");
        }
    }
}