package LinearSearch.Problem2;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Array of sentences
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "I love programming in Java.",
                "Linear search is simple to implement.",
                "This is a sentence without the word."
        };

        // Create the SearchWord object for the word you want to search
        SearchWord searchWord = new SearchWord("Java");

        // Create SentenceSearch object
        SentenceSearch sentenceSearch = new SentenceSearch(sentences);

        // Call the search method and print the result
        String result = sentenceSearch.searchWordInSentences(searchWord);
        System.out.println(result);
    }
}
