package ChallengeProblem.Problem1;
import java.io.*;
// Class to compare FileReader and InputStreamReader
class FileReadingTest {
    private static final String FILE_PATH = "largefile.txt"; // 100MB file

    // Count words using FileReader
    public static void testFileReader() {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileReader fr = new FileReader(FILE_PATH);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + " ms");
        System.out.println("Word Count: " + wordCount);
    }

    // Count words using InputStreamReader
    public static void testInputStreamReader() {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(FILE_PATH));
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + " ms");
        System.out.println("Word Count: " + wordCount);
    }
}

