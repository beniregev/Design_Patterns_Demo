package com.beniregev.designpatterns.behavioral_patterns.observer;

/**
 * <h3>When do we use the <i>Observer Pattern</i></h3>
 * <p>
 * We use the Observer pattern when we need many other objects to receive an
 * update when another object changes.
 * </p>
 * <p>
 * <div>
 *     Example:
 * </div>
 * <div>
 *     Stock market with thousands of stocks needs to send updates to objects representing individual stocks.
 * </div>
 * <div>
 *     The Subject (publisher) sends many stocks to the Observers.
 * </div>
 * <div>
 *     The Observers (subscribers) takes the ones they want and use them.
 * </div>
 * </p>
 * <h3>Pros</h3>
 * <p>
 *     Loose coupling is a benefit.
 *     <div>
 *         The Subject (publisher) doesn't need to know anything about the Observers (subscribers).
 *     </div>
 * </p>
 * <h3>Cons</h3>
 * <p>
 *     The Subject (publisher) may send updates that don't matter to the Observer (subscriber).
 * </p>
 */
public class ObserverMain {
}
