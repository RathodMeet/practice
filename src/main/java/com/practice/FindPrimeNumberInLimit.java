package com.practice;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumberInLimit {

    public static void main(String[] args) {
        List<Integer> primeNum = new ArrayList<>();

        for (int i = 2; i <= 45; i++){
            if(isPrimeNumber(i))
                primeNum.add(i);
        }
        System.out.println(primeNum);
    }

    private static boolean isPrimeNumber(int number){

        boolean isPrime = true;

        for (int i = 2; i <= number/2; i++){
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
