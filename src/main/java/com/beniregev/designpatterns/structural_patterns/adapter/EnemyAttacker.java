package com.beniregev.designpatterns.structural_patterns.adapter;

/**
 * <div>
 *     <p>
 *         <div>
 *             This is the Target Interface.
 *         </div>
 *         <div>
 *             This is what the client expects to work with. It is
 *             the adapters job to make new classes compatible with
 *             this one.
 *         </div>
 *
 *     </p>
 * </div>
 * @author binyamin.regev
 * @since jdk-1.8.0_162
 */
public interface EnemyAttacker {
    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);

}
