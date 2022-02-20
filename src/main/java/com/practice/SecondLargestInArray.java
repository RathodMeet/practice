package com.practice;

import java.util.Arrays;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 14023, 798423, 67, 87342, 642, 95, 87243, 74};

        int[] arrayone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 14023, 798423, 67, 87342, 642, 95, 87243, 74};

        Arrays.sort(array);

        int i = array[array.length - 1];

        System.out.println("From: "+ Arrays.toString(arrayone) + " | sorted: "+ Arrays.toString(array) +"| higest : " + i);
    }
}
