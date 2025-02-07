package Problem1;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataGeneratorTest {

    @Test
    void testGenerateDataSize() {
        int size = 100;
        int[] data = DataGenerator.generateData(size);
        assertNotNull(data, "Generated data should not be null");
        assertEquals(size, data.length, "Generated data should have the correct size");
    }

    @Test
    void testGenerateDataRandomness() {
        int size = 100;
        int[] data1 = DataGenerator.generateData(size);
        int[] data2 = DataGenerator.generateData(size);
        assertNotEquals(Arrays.toString(data1), Arrays.toString(data2), "Generated data should be random");
    }
}
