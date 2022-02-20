package com.practice;

public class SwapNumbers {

    public static void main(String[] args) {
        Long num1 = 3L;
        Long num2 = 2L;

        swapWithoutThirdVar(num1, num2);
    }

    private static void swapWithoutThirdVar(Long one, Long two) {

        System.out.println("Initial one: " + one + ", two: " + two);

        one = one + two;
        two = one - two;
        one = one - two;

        System.out.println("Swapped one: " + one + ", two: " + two);
    }
}
