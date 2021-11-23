package com.beniregev.designpatterns.creational_patterns.factory.example2;

/**
 * <div>
 *     <h1>Delivery Manager or {@code Factory} class</h1>
 *     <p></p>
 * </div>
 * @author binyamin.regev
 */
public class DeliveryManager {
    public String deliveryManagerFactory(PackageInfo packageInfo) {
        if (packageInfo.getSize().equals("SMALL")) {
            return new DeliveryByBicycle().deliveryMethod(packageInfo);
        } else if (packageInfo.getSize().equals("MEDIUM")) {
            return new DeliveryByCar().deliveryMethod(packageInfo);
        } else if (packageInfo.getSize().equals("LARGE")) {
            return new DeliveryByTruck().deliveryMethod(packageInfo);
        }
        return "Invalid package size, FILED to deliver.";
    }
}
