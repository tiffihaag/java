package com.company;

public class Main {

    public static boolean isPrime(int n) {
        int count = 0;

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            System.out.println("Looping " + i);

            if (isPrime(1)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
            }

            if (count == 3) {
                System.out.println("exiting");
                break;
            }
        }
    }
}