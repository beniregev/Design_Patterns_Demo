package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <p>Refined Abstraction</p>
 *     <p>
 *         If I decide I want to further extend the remote I can
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TVRemoteMute extends RemoteButton {
    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonEightPressed() {
        System.out.println(this.getClass().getSimpleName() + " --> TV was Muted");
    }
}
