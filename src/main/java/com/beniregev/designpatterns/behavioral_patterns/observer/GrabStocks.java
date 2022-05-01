package com.beniregev.designpatterns.behavioral_patterns.observer;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber =  new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(67.00);
        stockGrabber.setGooglePrice(297.00);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(97.00);
        stockGrabber.setApplePrice(37.00);
        stockGrabber.setGooglePrice(167.00);

        StockObserver observer3 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(23.00);
        stockGrabber.setApplePrice(13.00);
        stockGrabber.setGooglePrice(93.00);

        stockGrabber.unregister(observer2);

        stockGrabber.setIbmPrice(88.00);
        stockGrabber.setApplePrice(28.00);
        stockGrabber.setGooglePrice(148.00);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 456.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 123.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 789.00);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
