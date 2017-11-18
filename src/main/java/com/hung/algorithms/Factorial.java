package com.hung.algorithms;

public class Factorial {

    /**
     * This method to calculate factorial of number
     *
     * @param number integer number
     * @return factorial of number
     */
    public static double factorial(int number) {
        double factorial = 1;
        if (number > 1) {
            for (int i = 0; i < number; i++) {
                factorial *= i;
            }
            return factorial;
        }
        return number;
    }
}
