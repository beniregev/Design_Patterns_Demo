package com.beniregev.designpatterns.behavioral.strategy_pattern;

/**
 *  <h1>When to use the Strategy Pattern?</h1>
 *  <p>
 *      When you want to define a class that will have one behavior
 *      that is similar to other behaviors in a list.
 *      <h2><b><i>Pros:</i></b></h2>
 *      <ul>
 *          <li>
 *              I want the class object to be able to choose from
 *              <ul>
 *                  <li>Not Flying.</li>
 *                  <li>Fly with wings.</li>
 *                  <li>Fly super fast.</li>
 *              </ul>
 *          </li>
 *          <li>
 *              When you need to use one of several behaviors dynamically.
 *          </li>
 *          <li>Often reduces long list of conditionals.</li>
 *          <li>Avoid duplicate code.</li>
 *          <li>Keep class changes from forcing other class changes.</li>
 *          <li>Can hide complicated/secret code from the user.</li>
 *          <li></li>
 *      </ul>
 *      <h2><b><i>Cons:</i></b></h2>
 *      <ul>
 *          <li>Increased number of objects/classes.</li>
 *      </ul>
 *  </p>
 *  @author Binyamin Regev
 */
public class AnimalPlay {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }

}
