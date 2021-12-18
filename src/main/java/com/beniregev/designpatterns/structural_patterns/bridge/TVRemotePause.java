package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <p>Refined Abstraction</p>
 *     <p>If I decide I want to further extend the remote I can</p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TVRemotePause extends RemoteButton {
    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Paused");

    }
}
