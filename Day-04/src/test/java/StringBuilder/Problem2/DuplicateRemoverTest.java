package StringBuilder.Problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateRemoverTest {

    @Test
    void testRemoveDuplicates() {
        // Test case: Normal string with duplicates
        assertEquals("abcd", DuplicateRemover.removeDuplicates("aabbccdd"));

        // Test case: String with spaces
        assertEquals("helo wrd", DuplicateRemover.removeDuplicates("hello world"));

        // Test case: String with numbers
        assertEquals("1234", DuplicateRemover.removeDuplicates("11223344"));

        // Test case: Empty string
        assertEquals("", DuplicateRemover.removeDuplicates(""));

        // Test case: String with special characters
        assertEquals("!@#abc", DuplicateRemover.removeDuplicates("!!@@###abcabc"));

        // Test case: String with all unique characters
        assertEquals("abcdef", DuplicateRemover.removeDuplicates("abcdef"));

        // Test case: String with mixed uppercase and lowercase
        assertEquals("aABb", DuplicateRemover.removeDuplicates("aAaBbB"));

        // Test case: Single character string
        assertEquals("x", DuplicateRemover.removeDuplicates("xxxxxx"));

        // Test case: Null input should throw NullPointerException
        assertThrows(NullPointerException.class, () -> DuplicateRemover.removeDuplicates(null));
    }
}
