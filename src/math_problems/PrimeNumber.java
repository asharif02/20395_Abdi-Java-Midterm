package math_problems;

import java.sql.Array;
import java.util.ArrayList;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */

    public static void main(String[] args) {

        System.out.println(primeNumber(2, 1_000_000));
    }

    public static ArrayList<Integer> primeNumber(int start, int end) {

        ArrayList<Integer> primes = new ArrayList<>();

        for(int n = start; n < end; n++) {
            boolean prime = true;

            int i = 2;
            while(i <= n / 2) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

            if(prime) {
                primes.add(n);
            }
        }

        return primes;



        /** TESTING
        int n = 25;
        boolean prime = true;

        int i = 2;
        while(i <= n / 2) {
            System.out.println("Checking if " + i + " is a multiple");
            if(n % i == 0) {
                System.out.println("FOUND MULTIPLE: " + i);
                prime = false;
                break;
            }
            i++;
        }

        System.out.println(prime);
        */



    }
}