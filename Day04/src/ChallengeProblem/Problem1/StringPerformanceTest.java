package ChallengeProblem.Problem1;

// Class to compare StringBuilder and StringBuffer
class StringPerformanceTest {
    private static final int ITERATIONS = 1_000_000;
    private static final String TEXT = "hello";

    // Measure time taken by StringBuilder
    public static void testStringBuilder() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // Measure time taken by StringBuffer
    public static void testStringBuffer() {
        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(TEXT);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
