package com.beniregev.designpatterns.creational_patterns.prototype.example2;

/**
 * <div>
 *     Simple class implementing {@link Prototype} interface
 *     to demonstrate the Design Pattern.
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class EventDto implements Prototype {
    private int id;
    private String name;

    public EventDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype copy() {
        return new EventDto(this.id, this.name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "@" + Integer.toHexString(hashCode()) +
                " ( " + id + ", '" + name + "' )";
    }
}
