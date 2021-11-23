package com.beniregev.designpatterns.creational_patterns.factory.example2;

public class DeliveryByTruck implements PackageDelivery {
    @Override
    public String deliveryMethod(PackageInfo packageInfo) {
        return "Package delivery using a truck for " + packageInfo.getSize() + " package that weight " + packageInfo.getWeight();
    }
}
