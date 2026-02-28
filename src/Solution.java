import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read a single line of text
        String input = scanner.nextLine();
        // TODO: Split the text into individual words
        String[] ipnutWords = input.split("\\s+");
        scanner.close();
        // TODO: Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCount = new HashMap<>();
        // TODO: Iterate through the words and update their frequencies in the map
        for (String word : ipnutWords) {
          if (!wordCount.containsKey(word)) {
              wordCount.put(word, 1);
          } else {
              wordCount.put(word, wordCount.get(word) + 1);
          } 
        }
        // TODO: Iterate through the map and print the unique words and their counts
        // Format: "word: count"
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
          System.out.println(entry.getKey()+": "+entry.getValue());
          System.out.flush();
        }
        
    }
}
