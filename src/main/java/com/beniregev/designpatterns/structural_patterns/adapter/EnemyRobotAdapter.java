package com.beniregev.designpatterns.structural_patterns.adapter;

/**
 * <div>
 *     <p>
 *         The Adapter must provide an alternative action for the
 *         methods that need to be used because {@link EnemyAttacker}
 *         was implemented.
 *     </p>
 *     <p>
 *         This adapter does this by containing an object of the same
 *         type as the Adaptee ({@link EnemyRobot}) All calls to
 *         {@link EnemyAttacker} methods are sent instead to methods
 *         used by {@link EnemyRobot}.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){

        theRobot = newRobot;

    }

    public void fireWeapon() {

        theRobot.smashWithHands();

    }

    public void driveForward() {

        theRobot.walkForward();

    }

    public void assignDriver(String driverName) {

        theRobot.reactToHuman(driverName);

    }
}
