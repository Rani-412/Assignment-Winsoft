import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "Hello world, this is a sample text to count the number of words in a string using HashMap.";

        
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] words = text.split("\\s+");

      
        HashMap<String, Integer> wordCounts = new HashMap<>();

       
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

       
        for (String word : wordCounts.keySet()) {
      
        }

       
        int totalWords = words.length;
        System.out.println(totalWords);
    }
}