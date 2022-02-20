package com.practice;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Is the number palindrome? " + isPalindromeUsingString(1210));
    }

    private static boolean isPalindromeUsingString(int number) {
        String numberString = String.valueOf(number);

        String reverseNumberString = new StringBuilder(numberString).reverse().toString();

        return numberString.equals(reverseNumberString);
    }
}
