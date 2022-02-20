package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPracticals {

    public static void main(String[] args) {
        findTheMinAndMax();
    }


    private static void findTheMinAndMax() {
        List<Integer> nums = new ArrayList<>(List.of(2834, 9, 21, 1, 2, 34, 5, 23, 680, 26, 73, 201));
        Collections.sort(nums);

        List<String> s = new ArrayList<>();
        String.join(",", s);

        System.out.println("Min: " + nums.get(0) + ", Max: " + nums.get(nums.size() - 1));
    }
}
