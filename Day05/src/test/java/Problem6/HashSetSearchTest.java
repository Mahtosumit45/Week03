package Problem6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

class HashSetSearchTest {

    private final int[] sampleData = new Random().ints(100_000, 1, 1_000_000).toArray();
    private final int target = sampleData[sampleData.length / 2];

    @Test
    void testHashSetSearch() {
        HashSetSearch hashSetSearch = new HashSetSearch(sampleData);
        assertTrue(hashSetSearch.search(target), "Target should be found in hash set search");
    }
}
