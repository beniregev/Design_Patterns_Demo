package com.beniregev.designpatterns.creational_patterns.factory.example2;

public class FactoryDesignPatternExample2Test {
    public static void main(String[] args) {
        System.out.println("******* Delivery Manager Process Started *******");
        DeliveryManager deliveryManager = new DeliveryManager();

        //  PackageInfo: { size="SMALL"; weight=5kg }
        PackageInfo smallPackage = new PackageInfo("SMALL", "5kgs");
        System.out.println(deliveryManager.deliveryManagerFactory(smallPackage));

        //  PackageInfo: { size="MEDIUM"; weight=10kg }
        PackageInfo mediumPackage = new PackageInfo("MEDIUM", "10kgs");
        System.out.println(deliveryManager.deliveryManagerFactory(mediumPackage));

        //  PackageInfo: { size="LARGE"; weight=20kg }
        PackageInfo largePackage = new PackageInfo("LARGE", "20kgs");
        System.out.println(deliveryManager.deliveryManagerFactory(largePackage));

        System.out.println("******* Delivery Manager Process Finished *******");

    }
}
