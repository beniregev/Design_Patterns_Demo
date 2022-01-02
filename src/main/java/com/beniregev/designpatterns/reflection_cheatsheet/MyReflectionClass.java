package com.beniregev.designpatterns.reflection_cheatsheet;

/**
 *
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class MyReflectionClass extends MyReflectionSuperClass {
    private int code = 777;
    private String idCode = "100";

    public MyReflectionClass() {
        System.out.println("MyReflectionClass()");
    }

    public MyReflectionClass(String thatString) {
        System.out.println("MyReflectionClass(" + thatString + ")");
    }

    public MyReflectionClass(int thisInt, String thatString) {
        System.out.println("MyReflectionClass(" + thisInt + ", " + thatString + ")");
    }

    private String getPrivateMethod() {
        return "How did you get this?";
    }

    private String getOtherPrivateWithParameters(int thisInt, String thatString) {
        return "How did you get here " + thisInt + " " + thatString;
    }
}
