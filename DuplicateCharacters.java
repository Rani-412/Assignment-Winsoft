import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "Hello, world! This is a sample string.";

        
        input = input.replaceAll("\\s+", "").toLowerCase();

        
        Map<Character, Integer> charCounts = new HashMap<>();

       
        for (char c : input.toCharArray()) {
            // Update the frequency of the character in the HashMap
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() );
            }
        }
    }
}