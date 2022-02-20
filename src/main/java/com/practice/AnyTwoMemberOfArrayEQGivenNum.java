package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnyTwoMemberOfArrayEQGivenNum {

    public static void main(String[] args) {
        System.out.println("Output: " + Arrays.toString(optimalSolution(new int[]{3, 2, 4}, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {

        int compareIndex1 = 0;
        int compareIndex2 = 1;
        int[] ans = null;

        while (compareIndex1 < nums.length - 1) {

            if (nums[compareIndex1] + nums[compareIndex2] == target) {
                ans = new int[]{compareIndex1, compareIndex2};
                break;
            } else if (compareIndex2 == nums.length - 1) {
                compareIndex1++;
                compareIndex2 = compareIndex1 + 1;

            } else {
                compareIndex2++;
            }
        }

        return ans;
    }

    private static int[] optimalSolution(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = null;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                ans = new int[]{i, map.get(target - nums[i])};
                break;
            }
        }

        return ans;
    }
}
