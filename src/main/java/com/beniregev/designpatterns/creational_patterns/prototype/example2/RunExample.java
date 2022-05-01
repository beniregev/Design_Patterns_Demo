package com.beniregev.designpatterns.creational_patterns.prototype.example2;

/**
 * <div>
 *     <p>
 *         Usually this design pattern is used with {@code Clonable}, but it
 *         isn’t recommended. Check here for more info (search for Copy Constructor versus Cloning).
 *     </p>
 *     <p>Simple class to run the example</p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class RunExample {
    public static void main(String[] args) {
        EventDto eventDto1 = new EventDto(0, "Happy Event");
        EventDto eventDto2 = (EventDto) eventDto1.copy();

        System.out.println("eventDto1 = " + eventDto1);
        System.out.println("eventDto2 = " + eventDto2);
    }
}
