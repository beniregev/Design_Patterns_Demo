package com.beniregev.designpatterns.structural.decorator_pattern;

/**
 * The decorator design pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.
 *
 * Let's imagine that we want to create a game, and, for our superhero, we want to add a new gadget to every level of the game. Each gadget should be selected by the player. How can we do that?
 *
 * One way to do that is by using the traditional inheritance. We will create a base abstract gadget class and multiple subclasses for different gadget combination.
 *
 * But, wait! I have n numbers of gadgets, so, in my case, I have to create n subclasses.
 *
 * If n = 5, then, for 5 powers, the number of subclasses will be 5! = 120. For 5 gadgets, we have to create 120 subclasses. Is there any other simple way to do that?
 *
 * Yes, we can use the <i>Decorator Design Pattern</i> to solve this problem.
 *
 * The decorator design pattern comes under the structural pattern. This pattern creates a decorator class that wraps around the original class and provides additional functionality, keeping class methods' signature intact.
 *
 * We will create a {@link Gadget} interface and concrete classes implementing the {@link Gadget} interface. We will, then, create an abstract decorator class {@link Gadget} Decorator implementing the {@link Gadget} interface and having {@link Gadget} object as its instance variable.
 *
 * {@link FlightGadget} and {@link UnibeamChestProjectorGadget} are concrete classes implementing the {@link GadgateDecorator}.
 *
 * The suit class will implement the {@link Gadget} interface, and it will be our base gadget or first gadget.
 *
 */
public class Main {

    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.addNewGadget("Unibeam Chest Projector");
        ironMan.addNewGadget("Flight");
        ironMan.showGadget(); }
}
