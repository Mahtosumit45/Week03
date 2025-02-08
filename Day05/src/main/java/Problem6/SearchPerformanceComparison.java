package Problem6;

import java.util.Random;

public class SearchPerformanceComparison {
    public static void main(String[] args) {
        int N = 1_000_000; // Dataset size
        int[] dataset = new Random().ints(N, 1, N * 10).toArray();
        int target = dataset[N / 2]; // A target in the middle

        // Array Search Performance
        ArraySearch arraySearch = new ArraySearch(dataset);
        long startTime = System.currentTimeMillis();
        arraySearch.search(target);
        long arrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Array search time: " + arrayTime + " ms");

        // HashSet Search Performance
        HashSetSearch hashSetSearch = new HashSetSearch(dataset);
        startTime = System.currentTimeMillis();
        hashSetSearch.search(target);
        long hashSetTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet search time: " + hashSetTime + " ms");

        // TreeSet Search Performance
        TreeSetSearch treeSetSearch = new TreeSetSearch(dataset);
        startTime = System.currentTimeMillis();
        treeSetSearch.search(target);
        long treeSetTime = System.currentTimeMillis() - startTime;
        System.out.println("TreeSet search time: " + treeSetTime + " ms");
    }
}
