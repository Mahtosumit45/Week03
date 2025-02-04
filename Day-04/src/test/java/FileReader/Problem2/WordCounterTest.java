package FileReader.Problem2;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void testCountWordOccurrences() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("testFile", ".txt");
        tempFile.deleteOnExit();

        // Write sample content to the file
        try (FileWriter writer = new FileWriter(tempFile);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello world! This is a test.\n");
            bufferedWriter.write("Hello again. Testing the word count.\n");
            bufferedWriter.write("Hello, HELLO, hello!\n");
        }

        // Test case: count occurrences of "hello" (case-insensitive)
        int count = WordCounter.countWordOccurrences(tempFile.getAbsolutePath(), "hello");
        assertEquals(2, count);
    }
}