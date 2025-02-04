package LinearSearch.Problem2;

// SentenceSearch.java
public class SentenceSearch {
    private String[] sentences;

    // Constructor to initialize the array of sentences
    public SentenceSearch(String[] sentences) {
        this.sentences = sentences;
    }

    // Method to search for the word in the sentences
    public String searchWordInSentences(SearchWord searchWord) {
        for (String sentence : sentences) {
            if (sentence.contains(searchWord.getWord())) {
                return sentence; // Return the first sentence containing the word
            }
        }
        return "Not Found"; // If no sentence contains the word
    }
}
