package com.hung.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateSumIntegerTest {

    CalculateSumInteger calculateSumInteger;

    @Before
    public void setUp() {
        calculateSumInteger = new CalculateSumInteger();
    }

    @Test
    public void testSumEvenNumber_WhenInputNegativeNumber() {
        int result = calculateSumInteger.sumEvenNumberWithIf(-1);
        assertEquals(result, -1);
    }

    @Test
    public void testSumEvenNumber_WhenInputOddNumber() {
        int result = calculateSumInteger.sumEvenNumberWithIf(9);
        assertEquals(result, 20);
    }

    @Test
    public void testSumEvenNumber_WhenInputEvenNumber() {
        int result = calculateSumInteger.sumEvenNumberWithIf(10);
        assertEquals(result, 30);
    }

    @Test
    public void testSumEvenNumberNoIf_WhenInputNegativeNumber() {
        int result = calculateSumInteger.sumEvenNumberNoIf(-1);
        assertEquals(result, 0);
    }

    @Test
    public void testSumEvenNumberNoIf_WhenInputOddNumber() {
        int result = calculateSumInteger.sumEvenNumberNoIf(9);
        assertEquals(result, 20);
    }

    @Test
    public void testSumEvenNumberNoIf_WhenInputEvenNumber() {
        int result = calculateSumInteger.sumEvenNumberNoIf(10);
        assertEquals(result, 30);
    }

    @Test
    public void testSumDecimalNumber_WhenInputNegativeNumber() {
        float result = calculateSumInteger.sumDecimalNumber(-5);
        assertEquals("", result, 0.0f, 0.0f);
    }

    @Test
    public void testSumDecimalNumber_WhenInputPositiveNumber() {
        float result = calculateSumInteger.sumDecimalNumber(10);
        assertEquals("", result, 2.9289684f, 0.0f);
    }

    @Test
    public void testSumDecimalFactorialNumber_WhenInputNegativeNumber() {
        float result = calculateSumInteger.sumDecimalFactorialNumber(-10);
        assertEquals("", result, 0.0f, 0.0f);
    }
}