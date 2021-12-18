package com.beniregev.designpatterns.creational_patterns.prototype;

public class Dog implements Animal {
    public Dog() {
        System.out.println("Dog is Made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Dog is Being Made");
        Dog dogObject = null;
        try {
            // Calls the Animal super classes clone()
            // Then casts the results to Sheep
            dogObject = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            // If Animal didn't extend Cloneable this error
            // is thrown
            System.out.println("The Dog was Turned to Mush");
            e.printStackTrace();
        }
        return dogObject;
    }

    public String toString(){
        return "Who let the Dog out?! woof woof woof";
    }
}
