package com.beniregev.designpatterns.behavioral_patterns.observer;

public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
