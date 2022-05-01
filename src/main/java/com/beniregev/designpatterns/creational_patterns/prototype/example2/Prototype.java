package com.beniregev.designpatterns.creational_patterns.prototype.example2;

/**
 * <div>
 *     Interface containing the {@link #copy()} method
 *     that the implementing class will implement.
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public interface Prototype {
    Prototype copy();
}
