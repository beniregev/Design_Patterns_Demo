package com.beniregev.designpatterns.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    private List<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        ////  Before Java 8
        //for (Observer observer : observers) {
        //    observer.update(ibmPrice, applePrice, googlePrice);
        //}

        //  With Java 8 Stream API
        observers.forEach(observer -> observer.update(ibmPrice, aaplPrice, googPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.aaplPrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googPrice = googlePrice;
        notifyObserver();
    }
}
