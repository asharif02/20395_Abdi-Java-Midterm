package string_problems;

import java.util.Scanner;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     *      e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {

        // Implement Here
        System.out.print("Please enter a word: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        crazyPermutation(string, "");

    }

    public static void crazyPermutation(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String roq = str.substring(0, i) + str.substring(i + 1);
            crazyPermutation(roq, ans + ch);
        }
    }

}