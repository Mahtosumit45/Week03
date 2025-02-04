package LinearSearch.Problem1;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a popular programming language.",
                "Data structures and algorithms are important.",
                "This is a sample sentence for testing."
        };

        String wordToFind = "Java";
        String result = SentenceSearcher.searchSentence(sentences, wordToFind);

        System.out.println("Result: " + result);

        int[] numbers = {3, 7, -2, 5, -8, 10};
        int negativeIndex = NegativeNumberSearcher.searchFirstNegative(numbers);

        System.out.println("First negative number index: " + negativeIndex);
    }
}
