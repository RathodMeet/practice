package com.practice.design.patterns.strategy;

public class FastTalkingStrategy implements TalkingStrategy{
    @Override
    public void talk() {
        System.out.println("Talking fast");
    }
}
