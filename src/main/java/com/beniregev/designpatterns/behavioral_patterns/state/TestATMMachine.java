package com.beniregev.designpatterns.behavioral_patterns.state;

/**
 * <div>
 *     <p>
 *         Welcome to my State Design Pattern Tutorial!
 *     </p>
 *     <p>
 *         I explain how the state pattern is used by using it
 *         to simulate an ATM machine.
 *     </p>
 *     <p>
 *         I explain how you come to decide on the different
 *         states. I then show you how to design the interface
 *         that each state will use. We think about the methods
 *         that are needed for every class that implements the
 *         interface then.
 *     </p>
 *     <p>
 *         All the steps are looked at from many directions and
 *         the code below will fill in the gaps.
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
    }
}
