package ChallengeProblem.Problem1;

// Main class to execute tests
public class PerformanceComparison {
    public static void main(String[] args) {
        System.out.println("Testing StringBuilder vs StringBuffer...");
        StringPerformanceTest.testStringBuilder();
        StringPerformanceTest.testStringBuffer();

        System.out.println("\nTesting FileReader vs InputStreamReader...");
        FileReadingTest.testFileReader();
        FileReadingTest.testInputStreamReader();
    }
}
