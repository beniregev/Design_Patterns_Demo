package com.beniregev.designpatterns.structural_patterns.proxy;

/**
 * <div>
 *     <p>
 *         Welcome to my Proxy Design Pattern Tutorial!
 *     </p>
 *     <p>
 *         The Proxy design pattern limits access to just the
 *         methods you want made accessible in another class.
 *     </p>
 *     <p>
 *         It can be used for security reasons, because an Object
 *         is intensive to create, or is accessed from a remote
 *         location. You can think of it as a gate keeper that
 *         blocks access to another Object. I demonstrate how the
 *         proxy pattern works using some code used in my State
 *         Design Pattern Tutorial. You may want to check that
 *         tutorial out before proceeding.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TestATMMachine {
    public static void main(String[] args){

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);

        // NEW STUFF : Proxy Design Pattern Code
        // The interface limits access to just the methods you want
        // made accessible
        GetATMData realATMMachine = new ATMMachine();
        GetATMData atmProxy = new ATMProxy();
        System.out.println("\nCurrent ATM State " + atmProxy.getATMState());
        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());

        // The user can't perform this action because ATMProxy doesn't
        // have access to that potentially harmful method
        // atmProxy.setCashInMachine(10000);
    }
}
