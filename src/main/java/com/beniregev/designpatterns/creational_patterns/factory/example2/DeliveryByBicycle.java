package com.beniregev.designpatterns.creational_patterns.factory.example2;

public class DeliveryByBicycle implements PackageDelivery {

    @Override
    public String deliveryMethod(PackageInfo packageInfo) {
        return "Package delivery using bicycle for " + packageInfo.getSize() + " package that weight " + packageInfo.getWeight();
    }
}
