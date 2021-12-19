package com.beniregev.designpatterns.structural_patterns.bridge;

/**
 * <div>
 *     <h1>Bridge Design-Pattern Example</h1>
 *     <p>
 *         Decouple an abstraction from its implementation so that the two can vary independently.
 *     </p>
 *     <p>
 *         <div>
 *             The Bridge pattern is usually very poorly explained.
 *         </div>
 *         <div>
 *             Everyone seems to explain it differently.
 *         </div>
 *     </p>
 *     <p>
 *         Progressively adding functionality while separating out major differences using abstract classes.
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
 *     <p>
 *         <div>
 *             For example: I want to create a remote-controls (like below), that will work differently depending
 *             upon very specific device. And along the line I want to define all those attributes that each device
 *             will have and then the remote controls along with that.
 *         </div>
 *         <div>
 *             We will be creating the most abstract class of device with what every device will have: up volume (5)
 *             and down volume (6). We will define 2 devices: for example one will be a television and the other a
 *             DVD player.
 *         </div>
 *         <div>
 *             Then we come to our abstract remote control that will hold a reference to a specific device, either the
 *             abstract device, the television, or the DVD player. It is the going to define all those abstract methods
 *             that are going to differ between the remote-control of the television and the one for the DVD player.
 *             <div>
 *                 <ul>In the remote-control for the television (Remote 2):
 *                     <li>button 7 will be <em>Previous Channel</em></li>
 *                     <li>button 8 will be <em>Mute Sound</em></li>
 *                     <li>button 9 will be <em>Next Channel</em></li>
 *                 </ul>
 *             </div>
 *             <div>
 *                 <ul>In the remote-control for the DVD player (Remote 2):
 *                     <li>button 7 will be <em>Previous Track</em></li>
 *                     <li>button 8 will be <em>Pause</em></li>
 *                     <li>button 9 will be <em>Next Track</em></li>
 *                 </ul>
 *             </div>
 *         </div>
 *     </p>
 *     <p>
 *         <<h3>When to use the Bridge design-pattern?</h3>
 *         <ul>
 *             <li>
 *                 When you want to be able to change both the abstraction (abstract classes) and concrete classes
 *                 independently.
 *             </li>
 *             <li>When you want the first abstract class to define rules (Abstract Device).</li>
 *             <li>The concrete class add additional rules (television and DVD player)</li>
 *             <li>
 *                 An abstract class has a reference to the device and it defines abstract methods that will be
 *                 defined (Abstract Remote).
 *             </li>
 *             <li>The concrete remote-control defines the abstract methods required.</li>
 *         </ul>
 *     </p>
 * </div>
 * @!author binyamin.regev
 * @since jdk-1.8.0_162
 * @see EntertainmentDevice (abstract)
 * @see RemoteButton (abstract)
 * @see TVDevice
 * @see DVDDevice
 * @see DVDRemote
 * @see TVRemoteMute
 * @see TVRemotePause
 */
public class TestTheRemote {
    public static void main(String[] args){

        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
        RemoteButton theDVD = new DVDRemote(new DVDDevice(1,14));

        // -----------------------

        System.out.println("Test TV with Mute");
        theTV.buttonSevenPressed();
        theTV.buttonNinePressed();
        theTV.buttonEightPressed();

        System.out.println("\nTest TV with Pause");
        theTV2.buttonSevenPressed();
        theTV2.buttonNinePressed();
        theTV2.buttonEightPressed();
        theTV2.deviceFeedback();

        System.out.println("\nTest DVD");
        theDVD.buttonSevenPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonEightPressed();
        theDVD.buttonEightPressed();

    }
}
