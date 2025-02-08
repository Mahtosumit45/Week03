package Problem6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

class TreeSetSearchTest {

    private final int[] sampleData = new Random().ints(100_000, 1, 1_000_000).toArray();
    private final int target = sampleData[sampleData.length / 2];

    @Test
    void testTreeSetSearch() {
        TreeSetSearch treeSetSearch = new TreeSetSearch(sampleData);
        assertTrue(treeSetSearch.search(target), "Target should be found in tree set search");
    }
}
