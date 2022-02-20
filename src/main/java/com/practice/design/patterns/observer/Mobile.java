package com.practice.design.patterns.observer;

public class Mobile implements Observer {

    @Override
    public void update(Subject s) {
        System.out.println("Mobile updated");
    }
}
