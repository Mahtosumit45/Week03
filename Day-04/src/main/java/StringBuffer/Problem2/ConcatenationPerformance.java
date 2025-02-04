package StringBuffer.Problem2;

class ConcatenationPerformance {
    private static final int ITERATIONS = 1_000_000;
    private static final String SAMPLE_TEXT = "hello";

    // Method to measure performance using StringBuffer
    public static long measureStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(SAMPLE_TEXT);
        }

        long endTime = System.nanoTime();
        return endTime - startTime; // Returns time in nanoseconds
    }

    // Method to measure performance using StringBuilder
    public static long measureStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(SAMPLE_TEXT);
        }

        long endTime = System.nanoTime();
        return endTime - startTime; // Returns time in nanoseconds
    }
}