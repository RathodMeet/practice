package com.practice.design.patterns.strategy;

public class MainClass {
    public static void main(String[] args) {
        Person p = new SalesMan(new FastTalkingStrategy());
        p.talk();
        p.setTalkingStrategy(new SlowTalkingStrategy());
        p.talk();
    }
}
