package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <p>Implementor</p>
 *     <p>
 *         With the Bridge Design Pattern you create 2 layers of
 *         abstraction. In this example I'll have an abstract class
 *         representing different types of devices. I also have an
 *         abstract class that will represent different types of
 *         remote controls.
 *     </p>
 *     <p>
 *         This allows me to use an infinite variety of devices and remotes
 *     </p>
 *     <pre>
 * +---------------------------------------+
 * |                                       |
 * |               +-------+               |
 * |               | Power |               |
 * |               +-------+               |
 * |     +---+   +---+   +---+   +---+     |
 * |     | 1 |   | 2 |   | 3 |   | 4 |     |
 * |     +---+   +---+   +---+   +---+     |
 * |                 +---+                 |
 * |                 | 5 |                 |
 * |             +---+---+---+             |
 * |             | 7 | 8 | 9 |             |
 * |             +---+---+---+             |
 * |                 | 6 |                 |
 * |                 +---+                 |
 * |                                       |
 * +---------------------------------------+
 *     </pre>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 0;

    public abstract void buttonSevenPressed();
    public abstract void buttonNinePressed();

    public void deviceFeedback() {
        if (deviceState > maxSetting || deviceState < 0) {
            deviceState = 0;
        }
        System.out.println(this.getClass().getSimpleName() + " --> On Channel " + deviceState);
    }

    public void buttonFivePressed() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void buttonSixPressed() {
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }
}
