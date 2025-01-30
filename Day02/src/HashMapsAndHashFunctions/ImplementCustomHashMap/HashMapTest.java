package HashMapsAndHashFunctions.ImplementCustomHashMap;
import java.util.LinkedList;
// Main class to test CustomHashMap
public class HashMapTest {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Insert key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Apple", 10); // Update key

        // Retrieve values
        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Value for Banana: " + map.get("Banana"));

        // Remove a key
        map.remove("Banana");
        System.out.println("Value for Banana after deletion: " + map.get("Banana"));

        // Display final hashmap state
        map.display();
    }
}
