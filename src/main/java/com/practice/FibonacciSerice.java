package com.practice;

public class FibonacciSerice {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; a <= 40; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
