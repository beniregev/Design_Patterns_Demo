package com.beniregev.designpatterns.structural_patterns.adapter;

import java.util.Random;

/**
 * <div>
 *     <p>
 *         The Adapter sends method calls to object(s) that use the
 *         {@link EnemyAttacker} interface to the right methods
 *         defined in {@link EnemyRobot}.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void walkForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");

    }

    public void reactToHuman(String driverName) {

        System.out.println("Enemy Robot Tramps on " + driverName);

    }
}
