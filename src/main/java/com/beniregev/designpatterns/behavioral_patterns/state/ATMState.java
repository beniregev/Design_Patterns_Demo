package com.beniregev.designpatterns.behavioral_patterns.state;

public interface ATMState {
    // Different states expected: HasCard, NoCard, HasPin, NoCash
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
