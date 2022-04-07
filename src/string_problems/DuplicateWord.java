package string_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words.
     */

    public static void main(String[] args) {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        duplicateWord(st);

        // Implement here

    }

    public static void duplicateWord(String sentence) {

        // split
        String[] words = sentence.split(" ");

        // create HashMap
        Map<String, Integer> wordCount = new HashMap<>();

        // check words in array
        for(String word : words) {
            if(wordCount.containsKey(word)) {
                wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // extracting all the keys of map - wordCount
        Set<String> wordsInString = wordCount.keySet();

        // loop through all the words in wordCount
        for(String word : wordsInString) {
            if(wordCount.get(word) > 1) {
                System.out.println(word + ": " + wordCount.get(word));
            }
        }
    }

}