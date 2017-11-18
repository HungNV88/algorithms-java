package com.hung.algorithms;

public class Fibonacci {

    /**
     * This method to find fibonacci number at random position use recursion
     *
     * @param number the position of fibonacci number
     * @return fibonacci number at position number
     */
    public static int findFibonacciNumberWithRecursion(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return findFibonacciNumberWithRecursion(number - 1) + findFibonacciNumberWithRecursion(number - 2);
    }

    /**
     * This method to find fibonacci number at random position
     *
     * @param number the position of fibonacci number
     * @return fibonacci number at position number
     */
    public static int findFibonacciNumberWayNoRecursion(int number) {
        int f0 = 1, f1 = 1;
        int fn = 1;
        if (number < 0) {
            return -1;
        }
        if (number == 0 || number == 1) {
            return number;
        }
        for (int i = 2; i < number; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
