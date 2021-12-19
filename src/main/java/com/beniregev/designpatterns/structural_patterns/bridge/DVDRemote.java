package com.beniregev.designpatterns.structural_patterns.bridge;

//
//
//

/**
 * <div>
 *     <p>
 *         <div>
 *             Refined Abstraction
 *         </div>
 *         <div>
 *             If I decide I want to further extend the remote I can
 *         </div>
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class DVDRemote extends RemoteButton {
    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonEightPressed() {
        play = !play;
        System.out.println(this.getClass().getSimpleName() + " --> DVD is Playing: " + play);
    }
}
