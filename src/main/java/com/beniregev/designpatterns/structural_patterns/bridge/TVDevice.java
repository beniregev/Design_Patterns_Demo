package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <p>Concrete Implementor</p>
 *     <p>
 *         Here is an implementation of the {@link EntertainmentDevice}
 *         abstract class. I'm specifying what makes it different from
 *         other devices.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TVDevice extends EntertainmentDevice {
    public TVDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    public void buttonSevenPressed() {
        System.out.println(this.getClass().getSimpleName() + " --> Channel Down");
        deviceState--;
    }

    public void buttonNinePressed() {
        System.out.println(this.getClass().getSimpleName() + " --> Channel Up");
        deviceState++;
    }
}
