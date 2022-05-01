package com.beniregev.designpatterns.behavioral_patterns.observer;

import java.text.DecimalFormat;
/**
 * Use Threads in Observer pattern
 * @author binyamin.regev
 */
public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep(2000);
            } catch(InterruptedException ie) {

            }

            double randNum = (Math.random() * .06) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price+randNum));
            if (stock == "IBM")
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            else if (stock == "AAPL")
                ((StockGrabber)stockGrabber).setApplePrice(price);
            else if (stock == "GOOG")
                ((StockGrabber)stockGrabber).setGooglePrice(price);
            System.out.println(stock + ": " + df.format(price + randNum) + " " +
                    df.format(randNum) + "\n");
        }
    }
}
