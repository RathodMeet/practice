package com.practice.design.patterns.strategy;

public class SlowTalkingStrategy implements TalkingStrategy{
    @Override
    public void talk() {
        System.out.println("Talking slow");
    }
}
