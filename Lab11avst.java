// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ====>>  ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {

        System.out.println("\nCOMPUTING PRIME NUMBERS");

        for (int k = 2; k < primes.length; k++) {
            primes[k] = true;

        }
        for (int h = 2; h < primes.length; h++) {
            for (int k = h * 2; k < primes.length; k += h) {
                primes[k] = false;

            }
        }

        }

    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();
        int counter = 0;
        for (int k = 2; k < primes.length; k++) {
            if (primes[k] == true){
                System.out.print(k + " ");
                counter++;
                if(counter == 15){
                    counter = 0;
                    System.out.println();
                }



    }
}}


}



