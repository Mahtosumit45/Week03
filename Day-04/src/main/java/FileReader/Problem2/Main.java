package FileReader.Problem2;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with your actual file path
        String targetWord = "java"; // Word to search for

        int occurrences = WordCounter.countWordOccurrences(filePath, targetWord);
        System.out.println("The word \"" + targetWord + "\" appears " + occurrences + " times in the file.");
    }
}
