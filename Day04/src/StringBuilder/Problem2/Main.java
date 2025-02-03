package StringBuilder.Problem2;


public class Main {
    public static void main(String[] args) {
        String input = "programming";
        String result = DuplicateRemover.removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
