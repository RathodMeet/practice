package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void main(String[] args) {

        for (int i = 100; i <= 200; i++) {
            List<Integer> nums = new ArrayList<>();
            int temp = i;
            while (temp != 0) {
                nums.add(temp % 10);
                temp /= 10;
            }
            int m = findIfItsArmstrong(nums);
            if (m != 0)
                System.out.println("The num is" + m);
        }

    }

    private static int findIfItsArmstrong(List<Integer> numbers) {


        int actualNumber = 0;

        for (Integer n : numbers) {
            actualNumber = Integer.parseInt(actualNumber + n.toString());
        }

        int sum = numbers.stream().reduce(0, (result, componet) -> result + componet ^ 3);

        return actualNumber == sum ? actualNumber : 0;
    }


}
