package com.beniregev.designpatterns.creational_patterns.prototype.example1;

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
     *     <p>
     *         Thanks to Polymorphism method {@code makeCopy()}
     *         of Sheep/Dog class is called instead of the method
     *         of Animal interface.
     *     </p>
     * </div>
     * @param animalSample Instance of a class that implements Animal class interface
     * @return a close of the instance that was received as parameters in the method
     */
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
