package com.practice;

import java.util.List;
import java.util.Objects;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> collection = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        search(collection, 11);
    }

    private static void search(List<Integer> collection, Integer keyToSearch) {

        boolean isExist = search(collection, keyToSearch, 0, collection.size() - 1);
        System.out.println("Is exist: " + isExist);
    }

    private static boolean search(List<Integer> collection, Integer keyToSearch, int start, int end) {
        int mid = ((end - start) / 2) + start;

        if (mid == end || mid == start)
            return false;

        Integer midElement = collection.get(mid);

        if (Objects.equals(midElement, keyToSearch)) return true;

        if (keyToSearch < midElement) end = mid;
        else start = mid;

        return search(collection, keyToSearch, start, end);
    }
}
