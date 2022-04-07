package string_problems;

public class Palindrome {

    /**
     * A palindrome is a word that can be reversed, and still remain the same.
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    // Implement here

    public static void main(String[] args) {
        isPalindrome("poop");
    }

    public static boolean isPalindrome (String word) {

        String a = "mom";
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
            System.out.println(reverse);

        }

        return false;
    }


}
