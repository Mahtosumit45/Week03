package Problem3;

public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int n = 1_000_000;

        StringConcatenation stringConcat = new StringConcatenation();
        StringBuilderConcatenation stringBuilderConcat = new StringBuilderConcatenation();
        StringBufferConcatenation stringBufferConcat = new StringBufferConcatenation();

        System.out.println("String concatenation time: " + stringConcat.concatenate(n) + " ms");
        System.out.println("StringBuilder concatenation time: " + stringBuilderConcat.concatenate(n) + " ms");
        System.out.println("StringBuffer concatenation time: " + stringBufferConcat.concatenate(n) + " ms");
    }
}
