package com.hung.algorithms;

public class CalculateSumInteger {

    /**
     * This is method for calculate sum of even number from 0 to n
     *
     * @param number integer number
     * @return summary of even number
     */
    public int sumEvenNumberWithIf(int number) {
        if(number < 0){
            return number;
        }
        int sumEven = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        return sumEven;
    }

    /**
     * This is method for calculate sum of even number from 0 to n
     *
     * @param number integer number
     * @return summary of even number
     */
    public int sumEvenNumberNoIf(int number) {
        int sumEven = 0;
        for (int i = 2; i <= number; i = i + 2) {
            sumEven += i;
        }
        return sumEven;
    }

    /**
     * This is method for calculate sum of decimal number from 1 to n
     *
     * @param number integer number
     * @return summary of decimal number
     */
    public float sumDecimalNumber(int number) {
        float sumDecimal = 0.0f;
        for (int i = 1; i <= number; i++) {
            sumDecimal += (float) 1 / i;
        }
        return sumDecimal;
    }

    /**
     * This is method for calculate sum of decimal number from 1 to n
     *
     * @param number integer number
     * @return summary of decimal number
     */
    public float sumDecimalFactorialNumber(int number) {
        float sumDecimal = 0.0f;
        for (int i = 1; i <= number; i++) {
            sumDecimal += (float) 1 / (float) Factorial.factorial(i);
        }

        return sumDecimal;
    }

    /**
     * This method to calculate summary of character letter in number
     *
     * @param number integer number
     * @return summary of character letter in number
     */
    public int sumNumberLetterWay1(int number) {
        int sumNumberLetter = 0;
        String numLetter = String.valueOf(number);
        char[] arrNumber = numLetter.toCharArray();
        for (int i = 0; i < arrNumber.length; i++) {
            int num = Character.getNumericValue(arrNumber[i]);
            sumNumberLetter += num;
        }
        return sumNumberLetter;
    }

    /**
     * This method to calculate summary of character letter in number
     *
     * @param number integer number
     * @return summary of character letter in number
     */
    public int sumNumberLetterWay2(int number) {
        int sumNumberLetter = 0;
        while (number > 0) {
            sumNumberLetter += number % 10;
            number = number / 10;
        }
        return sumNumberLetter;
    }

}
