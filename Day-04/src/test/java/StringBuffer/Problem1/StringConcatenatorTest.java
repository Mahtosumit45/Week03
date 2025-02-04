package StringBuffer.Problem1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringConcatenatorTest {

    @Test
    void testConcatenateStrings() {
        // Test normal case
        assertEquals("HelloWorld", StringConcatenator.concatenateStrings(new String[]{"Hello", "World"}));

        // Test case with numbers
        assertEquals("123456", StringConcatenator.concatenateStrings(new String[]{"123", "456"}));

        // Test case with special characters
        assertEquals("!@#$$%", StringConcatenator.concatenateStrings(new String[]{"!@#", "$$", "%"}));

        // Test case with empty strings
        assertEquals("Hello", StringConcatenator.concatenateStrings(new String[]{"Hello", ""}));

        // Test case with only empty strings
        assertEquals("", StringConcatenator.concatenateStrings(new String[]{"", "", ""}));

        // Test case with a single string
        assertEquals("SingleString", StringConcatenator.concatenateStrings(new String[]{"SingleString"}));

        // Test case with spaces
        assertEquals("Hello World", StringConcatenator.concatenateStrings(new String[]{"Hello", " ", "World"}));

    }
}
