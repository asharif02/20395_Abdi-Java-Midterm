package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65}; // expected result is 5

        System.out.println("Lowest number is: " + lowestNumber(array));

    }

    public static int lowestNumber(int[] array) {

        int min = array[0];
        int max = array[0];

        for(int i = 0; i < array.length; i++) {

            if(array[i] < min) {
                min = array[i];
            }

            if(array[i] > max) {
                max = array[i];
            }
        }

        return min;

    }
}