package com.codedifferently.week09.drill02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void stringToNumbersTest01(){
        Problem problem = new Problem();
        String[] input = new String[]{"six"};
        Integer[] expected = new Integer[]{6};
        Integer[] actual = problem.stringToNumbers(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void stringToNumbersTest02(){
        Problem problem = new Problem();
        String[] input = new String[]{"six", "eleven", "twelve", "two"};
        Integer[] expected = new Integer[]{6,11,12,2};
        Integer[] actual = problem.stringToNumbers(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void stringToNumbersTest03(){
        Problem problem = new Problem();
        String[] input = new String[]{"nineteen", "one", "zero", "three"};
        Integer[] expected = new Integer[]{19,1,0,3};
        Integer[] actual = problem.stringToNumbers(input);
        Assertions.assertArrayEquals(expected, actual);
    }
}
