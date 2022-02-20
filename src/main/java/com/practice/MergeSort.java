package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println(1 / 2);

        List<Integer> collectionToSort = List.of(1, 2, 8,4, 92, 7, 5 , 3, 11);

        List<Integer> result = sort(collectionToSort);

        System.out.println("Result: " + result);

    }

    private static List<Integer> sort(final List<Integer> collectionToSort) {
        Pair<List<Integer>> pair = divideList(collectionToSort);

        if(pair.getOne().isEmpty())
            return pair.getTwo();
        if(pair.getTwo().isEmpty())
            return pair.getOne();

        return compare(sort(pair.getOne()), sort(pair.getTwo()));
    }

    private static Pair<List<Integer>> divideList(List<Integer> collectionToDivide) {

        int midPoint = collectionToDivide.size() / 2;

        if (midPoint == 0) return new Pair<>(collectionToDivide, Collections.emptyList());

        List<Integer> firstList = collectionToDivide.subList(0, midPoint);
        List<Integer> secondList = collectionToDivide.subList(midPoint, collectionToDivide.size());

        return new Pair<>(firstList, secondList);
    }

    private static List<Integer> compare(List<Integer> first, List<Integer> second) {
        List<Integer> finalArray = new ArrayList<>();

        int i = 0;
        int imax = first.size();
        int j = 0;
        int jmax = second.size();
        boolean keepRunning = true;

        while (keepRunning) {

            if (i >= imax && j >= jmax) {
                keepRunning = false;
            } else if (i >= imax) {
                finalArray.addAll(second.subList(j, jmax));
                break;
            } else if (j >= jmax) {
                finalArray.addAll(first.subList(i, imax));
                break;
            }

            if (i < imax && first.get(i) < second.get(j)) {
                finalArray.add(first.get(i));
                i++;
            } else if (j < jmax && second.get(j) < first.get(i)) {
                finalArray.add(second.get(j));
                j++;
            } else {
                finalArray.add(second.get(j));
                i++;
                j++;
            }
        }

        return finalArray;
    }
}
