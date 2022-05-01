package com.beniregev.designpatterns.creational_patterns.prototype.example1;

/**
 * <div>
 *     <h1>Welcome to my Prototype Design Pattern Tutorial</h1>
 *     <p>
 *         The Prototype design pattern is used for creating
 *         new objects (instances) by cloning (copying) other
 *         objects.
 *     </p>
 *     <p>
 *         It allows for the adding of any subclass instance of
 *         a known super class at run time. It is used when there
 *         are numerous potential classes that you want to only
 *         use if needed at runtime. The major benefit of using
 *         the Prototype pattern is that it reduces the need for
 *         creating potentially unneeded subclasses.
 *     </p>
 *     <p>
 *         The package contains all the code for the example.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TestCloning {
    public static void main(String[] args){

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        Dog lora = new Dog();
        Dog clonedDog = (Dog) animalMaker.getClone(lora);

        // These are exact copies of each other - Sheep
        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally HashCode: (class " + sally.getClass().getSimpleName() + ") --> " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Sheep-Clone HashCode: (class " + clonedSheep.getClass().getSimpleName() + ") --> " + System.identityHashCode(System.identityHashCode(clonedSheep)));

        // These are exact copies of each other - Dog
        System.out.println(lora);
        System.out.println(clonedDog);
        System.out.println("Lora HashCode: (class " + lora.getClass().getSimpleName() + ") --> " + System.identityHashCode(System.identityHashCode(lora)));
        System.out.println("Dog-Clone HashCode: (class " + clonedDog.getClass().getSimpleName() + ") --> " + System.identityHashCode(System.identityHashCode(clonedDog)));
    }
}
