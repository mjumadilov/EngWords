import java.util.*;

public class HRStringWordCount {

    public static void main(String[] args) {


        String text = "apple banana apple orange banana apple";

        String words [] = text.split(" ");


    Map<String, Integer> wordCount = new HashMap<>();

    // Loop through the words and count frequencies
        for (String word : words) {
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }

    // Print the results
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}}