package com.beniregev.designpatterns.creational_patterns.factory.example2;

/**
 * <div>
 *     <h1>Package Delivery Interface with deliveryMethod</h1>
 *     <p></p>
 * </div>
 * @author binyamin.regev
 */
public interface PackageDelivery {
    String deliveryMethod(PackageInfo packageInfo);
}
