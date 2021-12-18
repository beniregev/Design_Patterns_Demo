package com.beniregev.designpatterns.structural_patterns.adapter;

import java.util.Random;

/**
 * <div>
 *     <p>
 *         {@link EnemyTank} implements {@link EnemyAttacker}
 *         perfectly. Our job is to make classes with different
 *         methods from {@link EnemyAttacker} to work with the
 *         {@link EnemyAttacker} interface.
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public class EnemyTank implements EnemyAttacker {
    Random generator = new Random();

    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }

}
