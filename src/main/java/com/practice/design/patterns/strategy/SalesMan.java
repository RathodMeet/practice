package com.practice.design.patterns.strategy;

public class SalesMan implements Person {

    private TalkingStrategy talkingStrategy;

    public SalesMan(final TalkingStrategy talkingStrategy) {
        this.talkingStrategy = talkingStrategy;
    }

    @Override
    public void talk() {
        talkingStrategy.talk();
    }

    public void setTalkingStrategy(final TalkingStrategy talkingStrategy) {
        this.talkingStrategy = talkingStrategy;
    }
}
