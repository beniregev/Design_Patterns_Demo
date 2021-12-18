package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <p>Concrete Implementor</p>
 *     <p>
 *         Here is an implementation of the {@Link EntertainmentDevice}
 *         abstract class. I'm specifying what makes it different from
 *         other devices.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class DVDDevice extends EntertainmentDevice {
    public DVDDevice(int newDeviceState, int newMaxSetting){

        super.deviceState = newDeviceState;

        super.maxSetting = newMaxSetting;

    }

    public void buttonFivePressed() {

        System.out.println("DVD Skips to Chapter");

        deviceState--;

    }

    public void buttonSixPressed() {

        System.out.println("DVD Skips to Next Chapter");

        deviceState++;

    }

}
