package com.practice;

public class ReversString {

    public static void main(String[] args) {
        String stringToRevers = "Meet";

        String reversedString = /*reverseStringBySB(stringToRevers)*/ reversWithOutAnyLib(stringToRevers);

        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseStringBySB(final String stringToRevers) {
        StringBuilder sb = new StringBuilder(stringToRevers);
        sb.reverse();
        return sb.toString();
    }

    private static String reversWithOutAnyLib(String stringToRevers) {

        System.out.println("called");
        char[] array = stringToRevers.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = stringToRevers.length() - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        return sb.toString();
    }
}
