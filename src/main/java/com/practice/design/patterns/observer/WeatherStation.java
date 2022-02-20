package com.practice.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers;

    @Override
    public void addObserver(final Observer observer) {
        if (this.observers == null)
            this.observers = new ArrayList<>();
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        if (this.observers != null) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
