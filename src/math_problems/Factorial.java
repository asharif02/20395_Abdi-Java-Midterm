package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
        System.out.println(factorialIteration(5));
    }

    // using iteration
    public static int factorialIteration(int y){
        int total = 1;
        for(int i = 1; i <= y; i++) {
            total = total * i;
        }
        return total;
    }

    // using recursion
    public static int factorialRecursion(int x) {
        if(x == 1) {
            return 1;
        } else {
            return x * factorialRecursion(x - 1);
        }
    }
}
