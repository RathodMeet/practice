package com.practice;

import java.util.Arrays;

public class SumOfAll {
    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        int sum = Arrays.stream(ints).mapToInt(a -> a).sum();

        System.out.println("Sum: " + sum);

    }
}
