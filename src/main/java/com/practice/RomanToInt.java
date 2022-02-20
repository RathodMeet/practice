package com.practice;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println("Roman to int is: " + convertRomanToInt("MCMXCIV"));
    }

    private static int convertRomanToInt(String roman) {
        char[] romanChar = roman.toCharArray();
        int finalInt = 0;

        for (int i = 0; i < romanChar.length; i++) {

            String romanNum = String.valueOf(romanChar[i]);

            if (i != romanChar.length - 1 && isDualRomanNum(romanChar[i], romanChar[i + 1])) {
                romanNum = romanChar[i] + String.valueOf(romanChar[i + 1]);
                i = i + 1;
            }

            finalInt = finalInt + convertRomanCharToInt(romanNum);
        }

        return finalInt;
    }

    private static boolean isDualRomanNum(char char1, char char2) {
        return (char1 == 'I' && (char2 == 'V' || char2 == 'X')) ||
                (char1 == 'X' && (char2 == 'L' || char2 == 'C')) ||
                (char1 == 'C' && (char2 == 'D' || char2 == 'M'));
    }

    private static int convertRomanCharToInt(String ch) {
        switch (ch) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;


            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }
}
