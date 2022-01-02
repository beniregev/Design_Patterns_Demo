package com.beniregev.designpatterns.structural_patterns.proxy;

/**
 *
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public interface GetATMData {
    public ATMState getATMState();
    public int getCashInMachine();
}
