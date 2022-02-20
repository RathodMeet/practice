package com.practice.design.patterns.strategy;

public interface Person {

    void talk();

    void setTalkingStrategy(final TalkingStrategy talkingStrategy);
}
