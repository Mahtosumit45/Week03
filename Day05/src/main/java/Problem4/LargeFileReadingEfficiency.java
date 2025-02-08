package Problem4;

import java.util.*;
import java.io.*;
public class LargeFileReadingEfficiency {

    public static long readUsingFileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {
                // Read character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long readUsingInputStreamReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {
                // Read using byte stream and convert to characters
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        String filePath = "largeFile.txt"; // Change to the actual large file path

        System.out.println("Reading performance comparison:");
        long fileReaderTime = readUsingFileReader(filePath);
        System.out.println("FileReader time: " + fileReaderTime + " ms");

        long inputStreamReaderTime = readUsingInputStreamReader(filePath);
        System.out.println("InputStreamReader time: " + inputStreamReaderTime + " ms");

        System.out.println("\nInputStreamReader is " + (double) fileReaderTime / inputStreamReaderTime + " times faster than FileReader.");
    }
}

