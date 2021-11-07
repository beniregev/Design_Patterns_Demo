package com.beniregev.designpatterns.behavioral_patterns.strategy;

/**
 * <p>
 * The interface is implemented by many other subclasses
 * that allow for many types of flying without effecting
 * Animal, or Flys.
 * </p>
 * <p>
 * Classes that implement new Flys interface subclasses
 * can allow other classes to use that code eliminating
 * code duplication.
 * </p>
 * <p>
 * I'm decoupling : encapsulating the concept that varies
 * </p>
 * @author Binyamin Regev
 */
public interface Flys {
    String fly();
}

/**
 * Class used if the Animal can fly
 */
class ItFlys implements Flys {
    public String fly() {
        return "Flying High";
    }
}

/**
 * Class used if the Animal can't fly
 */
class CantFly implements Flys {
    public String fly() {
        return "I can't fly";
    }
}
