package com.beniregev.designpatterns.creational_patterns.prototype;

public class CloneFactory {
    /**
     * <div>
     *     <p>
     *         Receives any Animal, or Animal subclass and makes
     *         a copy of it and stores it in its own location
     *         in memory.
     *     </p>
     *     <p>
     *         CloneFactory has no idea what these objects are
     *         except that they are subclasses of Animal.
     *     </p>
     * </div>
     * @param animalSample
     * @return
     */
    public Animal getClone(Animal animalSample) {
        // Because of Polymorphism the Sheeps makeCopy()
        // is called here instead of Animals
        return animalSample.makeCopy();
    }
}
