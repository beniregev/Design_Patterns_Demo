package com.beniregev.designpatterns.structural_patterns.proxy;

/**
 *
 * @author binyamin.regev
 * @since 1.jdk-1.8.0_162
 */
public interface ATMState {
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
