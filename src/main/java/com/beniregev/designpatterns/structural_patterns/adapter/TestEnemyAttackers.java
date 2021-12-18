package com.beniregev.designpatterns.structural_patterns.adapter;

/**
 * <div>
 *     <h1>Adapter Design Pattern Example</h1>
 *     <p>
 *         Welcome to my Adapter Design Pattern Example! This is a very
 *         easy design pattern to grasp and put into use.
 *     </p>
 *     <p>
 *         <div>
 *             It allows 2 completely incompatible interfaces to
 *             work together.
 *         </div>
 *         <div>
 *             Used when the client expects a (target) interface.
 *         </div>
 *         <div>
 *             The Adapter class allows the use of the available interface
 *             and the target interface.
 *         </div>
 *         <div>
 *             Any class can work together as long as the adapter solves
 *             the issue that all classes must implement every method
 *             defined by the shared interface.
 *         </div>
 *     </p>
 *     <p>
 *         This pattern is used when you want to translate one interface
 *         of a class into another interface. Now, it makes sense that
 *         these 2 interfaces are compatible otherwise the pattern may
 *         not make sense. To accomplish this, all you need to do is
 *         bridge the differences using our old friend composition again.
 *     </p>
 *     <p>
 *         Look at and follow the code below and you will get it.
 *     </p>
 *     <p>
 *         Let us look at an example of a video game. We have a
 *         client who wants to use an {@link EnemyAttacker}.
 *         <ul>Every {@link EnemyAttacker} so far can:
 *             <li>Fire a weapon.</li>
 *             <li>Drive forward.</li>
 *             <li>Assign a driver.</li>
 *         </ul>
 *     </p>
 *     <p>
 *         However, I want to create an AI {@link EnemyRobot}, it
 *         cannot do some of the things that an {@link EnemyAttacker}
 *         so far can do because they are irrelevant, and it can
 *         do things differently, and other new things.
 *         <ul>The AI {@link EnemyRobot}
 *             <li>Has no need for a driver, but is going to interact with people, e.g. {@code reactToHuman}.</li>
 *             <li>Is not going to {@code driveForward} but it is going to {@code walkForward}.</li>
 *             <li>It has no weapon and smashes things with hands and feet, e.g. {@code smashWithHand}</li>
 *         </ul>
 *     </p>
 *     <p>
 *         <div>
 *             We will implement an Adapter, and change the terms a little.
 *             <ul>
 *                 <li>{@link EnemyAttacker} is the Target.</li>
 *                 <li>{@link EnemyRobotAdapter} is the Adapter that we are going to implement.</li>
 *                 <li>{@link EnemyRobot} is the Adaptee, the new {@link EnemyAttacker} that we want to create.</li>
 *             </ul>
 *         </div>
 *         <div>
 *             We want to look at the {@link EnemyRobot} just like any other
 *             {@link EnemyAttacker}, how do we going to do that?
 *         </div>
 *         <div>
 *             Will are going to take the Adapter and store an
 *             {@link EnemyRobot} inside of it. Then, everytime
 *             one of the method of {@link EnemyAttacker} is
 *             called we are going to point to the correct version
 *             of an {@link EnemyRobot} method:
 *             <ul>
 *                 <li>{@code fireWeapon} will point to {@code smashWithHands}.</li>
 *                 <li>{@code driveForward} will point to {@code walkForward}</li>
 *                 <li>{@code assignDrive} will point to {@code reactToHuman}</li>
 *             </ul>
 *             Of course, the methods signature will be identical,
 *             or at least very similar to enable easy usage.
 *         </div>
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class TestEnemyAttackers {
    public static void main(String[] args) {
        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
