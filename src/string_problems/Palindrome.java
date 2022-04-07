package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {

        // Implement here
        isPalindrome("Hannah"); // true
        isPalindrome("RaDaR"); // true
        isPalindrome("SNOWman"); // false
        isPalindrome("CIVIC"); // true
        isPalindrome("NURSES run"); // true
    }

    public static boolean isPalindrome (String original) {

        original = original.toLowerCase();
        original = original.replace(" ", "");
        String reverse = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println(original + " is a Palindrome!");
        } else {
            System.out.println(original + " IS NOT A PALINDROME!!!");
        }

        return false;
    }

}