package com.beniregev.designpatterns.reflection_cheatsheet;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class TestingReflection {

    private static final char TAB = '\t';
    private static final char NEW_LINE = '\n';

    public static void main(String[] args) {
        Class reflectionClass = MyReflectionClass.class;
        String className = reflectionClass.getName();
        String classSimpleName = reflectionClass.getSimpleName();
        System.out.println("class name: " + className + NEW_LINE +
                "class simple name: " + classSimpleName + NEW_LINE
        );

        int classModifier = reflectionClass.getModifiers();
        System.out.println("Class modifier is public? " + Modifier.isPublic(classModifier));
        System.out.println("Class modifier is private? " + Modifier.isPrivate(classModifier));
        System.out.println("Class modifier is protected(? " + Modifier.isProtected(classModifier));
        System.out.println("Class modifier is static? " + Modifier.isStatic(classModifier));

        System.out.println("Class modifier is final? " + Modifier.isFinal(classModifier));
        System.out.println("Class modifier is Synchronized? " + Modifier.isSynchronized(classModifier));
        System.out.println("Class modifier is Volatile? " + Modifier.isVolatile(classModifier));
        System.out.println("Class modifier is Transient? " + Modifier.isTransient(classModifier));

        System.out.println("Class modifier is native? " + Modifier.isNative(classModifier));
        System.out.println("Class modifier is interface? " + Modifier.isInterface(classModifier));
        System.out.println("Class modifier is abstract? " + Modifier.isAbstract(classModifier));
        System.out.println("Class modifier is strict? " + Modifier.isStrict(classModifier));

        Class[] interfaces = reflectionClass.getInterfaces();

        Class classSuper = reflectionClass.getSuperclass();
        System.out.println("Super class name: " + classSuper.getName() + NEW_LINE +
                "Super class simple name: " + classSuper.getSimpleName() + NEW_LINE
        );

        Method[] classMethods = reflectionClass.getMethods();
        for (Method method : classMethods) {
            System.out.println(method.getReturnType().getSimpleName() + " " + method.getName() + " " +
                    (method.getName().startsWith("get")
                            ? "Getter"
                            : (method.getName().startsWith("set") ? "Setter" : "")
                    )
            );

            Class[] methodParameterTypes = method.getParameterTypes();
            Parameter[] parameters = method.getParameters();

            for (Class parameterType : methodParameterTypes) {
                System.out.println(TAB + "parameter " + parameterType.getSimpleName());
            }

        }

    }
}
