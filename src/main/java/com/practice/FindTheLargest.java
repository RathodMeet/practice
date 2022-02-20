package com.practice;

import java.util.List;
import java.util.Objects;

public class FindTheLargest {


    public static void main(String[] args) {
        System.out.println("The largest is : " + findTheLargestNumber(11, 44, 9));
    }

    private static int findTheLargestNumber(int one, int two, int three) {
        List<Integer> set = List.of(one, two, three);

        return set.stream().sorted((o, t) -> {
            if (Objects.equals(o, t))
                return 0;
            if (o < t)
                return 1;
            else
                return -1;
        }).findFirst().orElse(0);
    }

}
