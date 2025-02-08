package Problem6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

class SearchPerformanceComparisonTest {

    private final int[] sampleData = new Random().ints(100_000, 1, 1_000_000).toArray();
    private final int target = sampleData[sampleData.length / 2];

    @Test
    void testPerformanceComparison() {
        ArraySearch arraySearch = new ArraySearch(sampleData);
        HashSetSearch hashSetSearch = new HashSetSearch(sampleData);
        TreeSetSearch treeSetSearch = new TreeSetSearch(sampleData);

        // Measure array search time
        long startTime = System.currentTimeMillis();
        arraySearch.search(target);
        long arrayTime = System.currentTimeMillis() - startTime;

        // Measure hash set search time
        startTime = System.currentTimeMillis();
        hashSetSearch.search(target);
        long hashSetTime = System.currentTimeMillis() - startTime;

        // Measure tree set search time
        startTime = System.currentTimeMillis();
        treeSetSearch.search(target);
        long treeSetTime = System.currentTimeMillis() - startTime;

        assertTrue(hashSetTime <= treeSetTime, "HashSet search should be faster or equal to TreeSet search");
        assertTrue(treeSetTime <= arrayTime, "TreeSet search should be faster than Array search");
    }
}
