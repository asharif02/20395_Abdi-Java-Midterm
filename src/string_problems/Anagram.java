package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * using all the original letters exactly once.
     *
     *      Ex: "CAT" & "ACT",
     *          "ARMY" & "MARY",
     *          "FART" & "RAFT"
    */

    //Implement Here
    public static void main(String[] args) {

        System.out.println(isAnagram("Abdi", "Sami"));
        System.out.println(isAnagram("Cat", "Act"));

    }

    /** STEPS (#3 is VERY important)
     *      1 - sort the data in strings
     *      2 - compare the sorted data
     *      3 - take a break and watch netflix
    */

    public static String isAnagram(String word1, String word2) {

        // this is just in case we type in aLtErNaTiNg CaPs
        String x = word1.toLowerCase();
        String y = word2.toLowerCase();

        char[] array1 = x.toCharArray();
        char[] array2 = y.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        Boolean result = Arrays.equals(array1, array2);

        // ideally would like to make this more optimized (but it works for now)
        // a Scanner that takes user input would be a nice addition

        if(result == true) {
            return word1 + " and " + word2 + " are Anagrams!";
        } else {
            return word1 + " and " + word2 + " are NOT Anagrams!";
        }
    }

}