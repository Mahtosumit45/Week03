package StringBuffer.Problem1;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};
        String result = StringConcatenator.concatenateStrings(words);

        System.out.println("Concatenated String: " + result);
    }
}