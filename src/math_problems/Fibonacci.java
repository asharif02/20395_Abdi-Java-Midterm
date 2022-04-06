package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {

        System.out.println(fibonacci(40));

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // FIBONACCI FORMULA: f(n) = f(n - 1) + f(n - 2)
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    /** faster fibonacci (in progress)
    private static long fasterFibonacci(int n) {

        long[] fibonacciCache;
        fibonacciCache = new long[n + 1];

        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fasterFibonacci(n - 1) + fasterFibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
     */
}
