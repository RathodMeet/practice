package com.practice;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {


    public static void main(String[] args) {
        System.out.println("Fibonacci up to 30: " + getFibonacciSeries(30));
    }

    private static List<Integer> getFibonacciSeries(int limit) {

        List<Integer> result = new ArrayList<>(limit);

        int preOne = 0;
        int preTwo = 1;
        int sum = 0;

        result.add(1);

        while (sum < limit) {

            sum = preOne + preTwo;
            result.add(sum);

            preOne = preTwo;
            preTwo = sum;
        }

        return result;
    }
}
