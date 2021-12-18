package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <p>Abstraction</p>
 *     <p>
 *         This is an abstract class that will represent numerous ways to work with each device
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public abstract class RemoteButton {
    // A reference to a generic device using aggregation

    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice){

        theDevice = newDevice;

    }

    public void buttonFivePressed() {

        theDevice.buttonFivePressed();

    }

    public void buttonSixPressed() {

        theDevice.buttonSixPressed();

    }

    public void deviceFeedback(){

        theDevice.deviceFeedback();

    }

    public abstract void buttonNinePressed();

}
