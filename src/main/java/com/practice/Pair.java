package com.practice;

public class Pair<E> {

    private final E one;
    private final E two;

    public Pair(final E one, final E two) {
        this.one = one;
        this.two = two;
    }

    public E getOne() {
        return one;
    }

    public E getTwo() {
        return two;
    }
}
