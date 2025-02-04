package StringBuilder.Problem1;

// StringReverser.java (Logic Class)
public class StringReverser {
    public String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}

