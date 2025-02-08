package Problem4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class LargeFileReadingEfficiencyTest {

    private static final String TEST_FILE_PATH = "test_large_file.txt";
    private static final int FILE_SIZE_MB = 10; // Create a 10MB test file

    // Helper method to create a large test file
    private void createLargeTestFile() throws IOException {
        File file = new File(TEST_FILE_PATH);
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                for (int i = 0; i < FILE_SIZE_MB * 1024 * 1024; i++) {
                    writer.write("A"); // Writing repetitive characters to simulate large text
                }
            }
        }
    }

    @Test
    void testReadUsingFileReader() throws IOException {
        createLargeTestFile(); // Ensure test file exists

        long timeTaken = LargeFileReadingEfficiency.readUsingFileReader(TEST_FILE_PATH);
        System.out.println("FileReader Time: " + timeTaken + " ms");

        assertTrue(timeTaken > 0, "FileReader should take a non-negative time");
    }

    @Test
    void testReadUsingInputStreamReader() throws IOException {
        createLargeTestFile(); // Ensure test file exists

        long timeTaken = LargeFileReadingEfficiency.readUsingInputStreamReader(TEST_FILE_PATH);
        System.out.println("InputStreamReader Time: " + timeTaken + " ms");

        assertTrue(timeTaken > 0, "InputStreamReader should take a non-negative time");
    }

    @Test
    void testInputStreamReaderIsFaster() throws IOException {
        createLargeTestFile(); // Ensure test file exists

        long fileReaderTime = LargeFileReadingEfficiency.readUsingFileReader(TEST_FILE_PATH);
        long inputStreamReaderTime = LargeFileReadingEfficiency.readUsingInputStreamReader(TEST_FILE_PATH);

        System.out.println("Performance Comparison:");
        System.out.println("FileReader Time: " + fileReaderTime + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

        assertTrue(inputStreamReaderTime <= fileReaderTime, "InputStreamReader should be equal or faster than FileReader");
    }
}
