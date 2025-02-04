package StringBuilder.Problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    @Test
    void testReverse() {
        StringReverser reverser = new StringReverser();

        // Test normal case
        assertEquals("dcba", reverser.reverse("abcd"));

        // Test numeric string
        assertEquals("4321", reverser.reverse("1234"));

        // Test empty string
        assertEquals("", reverser.reverse(""));

        // Test single character
        assertEquals("a", reverser.reverse("a"));

        // Test palindrome
        assertEquals("madam", reverser.reverse("madam"));

        // Test special characters
        assertEquals("!@#$", reverser.reverse("$#@!"));

        // Test whitespace handling
        assertEquals("dlroW olleH", reverser.reverse("Hello World"));

        // Test null input (should handle without throwing an exception)
        assertThrows(NullPointerException.class, () -> reverser.reverse(null));
    }
}
