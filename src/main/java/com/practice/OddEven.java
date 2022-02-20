package com.practice;

public class OddEven {
    public static void main(String[] args) {

        int number = 10074829;

        extracted(number);
    }

    private static void extracted(final int number) {
        System.out.println("The number is " + (number % 2 == 0 ? "Even":"Odd"));
    }
}
