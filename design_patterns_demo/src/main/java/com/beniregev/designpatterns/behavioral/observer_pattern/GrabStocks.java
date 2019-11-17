package com.beniregev.designpatterns.behavioral.observer_pattern;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber =  new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(67.00);
        stockGrabber.setGoogPrice(297.00);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(97.00);
        stockGrabber.setAaplPrice(37.00);
        stockGrabber.setGoogPrice(167.00);

        StockObserver observer3 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(23.00);
        stockGrabber.setAaplPrice(13.00);
        stockGrabber.setGoogPrice(93.00);

        stockGrabber.unregister(observer2);

        stockGrabber.setIbmPrice(88.00);
        stockGrabber.setAaplPrice(28.00);
        stockGrabber.setGoogPrice(148.00);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 456.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 123.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 789.00);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
