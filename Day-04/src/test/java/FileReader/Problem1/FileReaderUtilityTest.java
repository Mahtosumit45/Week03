package FileReader.Problem1;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class FileReaderUtilityTest {

    @Test
    void testReadFile() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("testFile", ".txt");
        tempFile.deleteOnExit();

        // Write sample content to the file
        try (FileWriter writer = new FileWriter(tempFile);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello, World!\n");
            bufferedWriter.write("This is a test file.\n");
        }

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Invoke the method under test
        FileReaderUtility.readFile(tempFile.getAbsolutePath());

        // Restore original System.out
        System.setOut(originalOut);

        // Verify the output
        String expectedOutput = "Hello, World!\nThis is a test file.\n";
        assertEquals(expectedOutput, outputStream.toString().replaceAll("\r", "")); // Normalize for Windows/Linux
    }
}