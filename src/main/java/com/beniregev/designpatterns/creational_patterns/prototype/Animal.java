package com.beniregev.designpatterns.creational_patterns.prototype;

/**
 * <div>
 *     <p>
 *         By making this class cloneable you are telling Java
 *         that it is ok to copy instances of this class. These
 *         instance copies have different results when
 *         {@code System.identityHashCode(System.identityHashCode(bike))}
 *         is called.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public interface Animal extends Cloneable {
    public Animal makeCopy();
}
