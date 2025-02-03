package StringBuffer.Problem2;

public class Main {
    public static void main(String[] args) {
        // Measure execution time for both approaches
        long timeBuffer = ConcatenationPerformance.measureStringBuffer();
        long timeBuilder = ConcatenationPerformance.measureStringBuilder();

        // Print results
        System.out.println("Time taken using StringBuffer: " + timeBuffer / 1_000_000 + " ms");
        System.out.println("Time taken using StringBuilder: " + timeBuilder / 1_000_000 + " ms");
    }
}
